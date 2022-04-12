package com.javalec.team.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Login_dao {
	DataSource dataSource;

	public Login_dao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/1teamp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String login(String uId, String uPw) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String iD = null;

		try {
			connection = dataSource.getConnection();
			String query = "select uId from user where uId = ? and uPw = ? and uLeave is null";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, uId);
			preparedStatement.setString(2, uPw);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				iD = resultSet.getString("uId");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
		} // finally
		return iD;
	} // login

	public void adduser(String uId, String uName, String uEmail, String uPw, String uPhone1, String uPhone2, String uBank,
			String uAccount, String uAddress) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();
			String query = "insert into user (uId, uName, uEmail, uPw, uPhone1, uPhone2, uBank, uAccount, uAddress, uJoin) values(?,?,?,?,?,?,?,?,?,now())";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, uId);
			preparedStatement.setString(2, uName);
			preparedStatement.setString(3, uEmail);
			preparedStatement.setString(4, uPw);
			preparedStatement.setString(5, uPhone1);
			preparedStatement.setString(6, uPhone2);
			preparedStatement.setString(7, uBank);
			preparedStatement.setString(8, uAccount);
			preparedStatement.setString(9, uAddress);

			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // finally는 위에 try/catch문이 이상이 있든 없거나 무조건 온다
			try {
				if (preparedStatement != null)
					preparedStatement.close(); // resultSet에 데이터가 있으면 닫아줘
				if (connection != null)
					connection.close(); // resultSet에 데이터가 있으면 닫아줘
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
