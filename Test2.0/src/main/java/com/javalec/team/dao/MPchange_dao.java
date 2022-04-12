package com.javalec.team.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.team.dto.MPinformation_dto;

public class MPchange_dao {
	DataSource dataSource;

	public MPchange_dao() {
		try {
			Context context = new InitialContext(); // sql에 접근
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/1teamp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void modify(String uId,String uName,String uEmail,String uPw,String uPhone1,String uPhone2,String uBank,String uAccount,String uAddress) {
		MPinformation_dto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = dataSource.getConnection();
			String query = "update user set uName=?, uEmail=?, uPw=? ,uPhone1=?,uPhone2=?,uBank=?,uAccount=?,uAddress=? where uId=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, uName);
			preparedStatement.setString(2, uEmail);
			preparedStatement.setString(3, uPw);
			preparedStatement.setString(4, uPhone1);
			preparedStatement.setString(5, uPhone2);
			preparedStatement.setString(6, uBank);
			preparedStatement.setString(7, uAccount);
			preparedStatement.setString(8, uAddress);
			preparedStatement.setString(9, uId);
	
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally { // finally는 이상이 없었을때나 있었을때나 메모리 정리를 해주는 것

			try {
				if (resultSet != null)
					resultSet.close();
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}//
