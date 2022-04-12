package com.javalec.team.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class InsertOrdering_dao {
	DataSource dataSource;

	public InsertOrdering_dao() {
		try {
			Context context = new InitialContext(); // sql에 접근
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/1teamp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void modify(String address, String uId) {
	
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = dataSource.getConnection();
			String query = "update cart set cAddress=? , cDecision='결제완료' where user_uId=? ";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, address);
			preparedStatement.setString(2, uId);
		
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


}
