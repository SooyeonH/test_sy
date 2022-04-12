package com.javalec.team.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class InsertRightPayment_dao {
DataSource dataSource;
	
	public InsertRightPayment_dao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/1teamp");
			//Servers > context.xml  뿉  엳 뒗  젙蹂대줈 DB  뿰寃곗쓣  걹 궦 寃 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}/////
	
	
	public void insertRightPayment(String oPrice, String oAddress, String product_pCode, String user_uId) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "insert into ordering ( oPrice, oDate, oAddress, oQuantity, oDecision, product_pCode, user_uId) values ( ?, now(), ?, 1, '배송중', ?, ? ) ";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, oPrice);
			preparedStatement.setString(2, oAddress);
			preparedStatement.setString(3, product_pCode);
			preparedStatement.setString(4, user_uId);
			
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}//write
}
