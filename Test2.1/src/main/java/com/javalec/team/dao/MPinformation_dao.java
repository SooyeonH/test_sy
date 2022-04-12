package com.javalec.team.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


import com.javalec.team.dto.MPinformation_dto;

public class MPinformation_dao {

	
	DataSource dataSource;

	public MPinformation_dao() {
		try {
			Context context = new InitialContext(); // sql에 접근
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/1teamp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public MPinformation_dto contentView(String Id) {

		MPinformation_dto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = dataSource.getConnection();
			String query = "select uId,uName,uEmail,uPw,uPhone1,uPhone2,uBank,uAccount,uAddress from user where uId=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, Id);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				String uId = resultSet.getString("uId");
				String uName = resultSet.getString("uName");
				String uEmail = resultSet.getString("uEmail");
				String uPw = resultSet.getString("uPw");
				String uPhone1 = resultSet.getString("uPhone1");
				String uPhone2 = resultSet.getString("uPhone2");
				String uBank = resultSet.getString("uBank");
				String uAccount = resultSet.getString("uAccount");
				String uAddress = resultSet.getString("uAddress");

				// 하나 작은박스로 집어넣을려고 dto 만든것
				dto = new MPinformation_dto(uId,uName,uEmail,uPw,uPhone1,uPhone2,uBank,uAccount,uAddress);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // finally는 이상이 없었을때나 있었을때나 메모리 정리를 해주는 것

			try {
				if (resultSet != null)
					resultSet.close(); // 데이터가 있으면 클로즈해라
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dto;

	}

	
	
	
}//끝
