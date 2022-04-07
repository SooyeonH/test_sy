package com.javalec.team.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;



public class MPdelete_dao {
	DataSource dataSource;
	public MPdelete_dao() {
		try {
			Context context = new InitialContext(); // sql에 접근
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/1teamp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delete(String uId) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		

		try {
			connection = dataSource.getConnection();
			String query = "delete from user where uId=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, uId);
	
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally { // finally는 이상이 없었을때나 있었을때나 메모리 정리를 해주는 것

			try {
				
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


