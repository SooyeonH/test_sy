package com.javalec.team.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class InsertCart_dao {
	
	DataSource dataSource;
	
	public InsertCart_dao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/1teamp");
			//Servers > context.xml  뿉  엳 뒗  젙蹂대줈 DB  뿰寃곗쓣  걹 궦 寃 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}/////
	
	
	public void insertCart(String pCode, int pQuantity) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "insert into cart ( cQuantity, product_pCode, cDate, user_uId) values (?,?,now(),?) ";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, pQuantity);
			preparedStatement.setString(2, pCode);
			preparedStatement.setString(3, "aaaaa");
			
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