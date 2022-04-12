package com.javalec.team.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.team.dto.ProductDetail_dto;

public class SelectDetail_dao {

	DataSource dataSource;
	
	
	
	public SelectDetail_dao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/1teamp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public ProductDetail_dto all (String spCode) {
		ProductDetail_dto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pImg_detail, pImg_main, pName, pQuantity from product where pCode = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, spCode);
			resultSet = preparedStatement.executeQuery();
			
			
			if(resultSet.next()) {
				String pCode = resultSet.getString("pCode");
				String pImg_detail = resultSet.getString("pImg_detail");
				String pImg_main = resultSet.getString("pImg_main");
				String pName = resultSet.getString("pName");
				String pQuantity = resultSet.getString("pQuantity");
				
				dto = new ProductDetail_dto(pCode, pImg_detail, pImg_main, pName, pQuantity);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//	
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}//
	
	
	public ProductDetail_dto student (String spCode) {
		ProductDetail_dto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pImg_detail, pImg_main, pName, pQuantity from product where pCode = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, spCode);
			resultSet = preparedStatement.executeQuery();
			
			
			if(resultSet.next()) {
				String pCode = resultSet.getString("pCode");
				String pImg_detail = resultSet.getString("pImg_detail");
				String pImg_main = resultSet.getString("pImg_main");
				String pName = resultSet.getString("pName");
				String pQuantity = resultSet.getString("pQuantity");
				
				dto = new ProductDetail_dto(pCode, pImg_detail, pImg_main, pName, pQuantity);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//	
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}//
	
	
	
	
	public ProductDetail_dto interior (String spCode) {
		ProductDetail_dto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pImg_detail, pImg_main, pName, pQuantity from product where pCode = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, spCode);
			resultSet = preparedStatement.executeQuery();
			
			
			if(resultSet.next()) {
				String pCode = resultSet.getString("pCode");
				String pImg_detail = resultSet.getString("pImg_detail");
				String pImg_main = resultSet.getString("pImg_main");
				String pName = resultSet.getString("pName");
				String pQuantity = resultSet.getString("pQuantity");
				
				dto = new ProductDetail_dto(pCode, pImg_detail, pImg_main, pName, pQuantity);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//	
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}//
	
	
	
	
	public ProductDetail_dto office (String spCode) {
		ProductDetail_dto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pImg_detail, pImg_main, pName, pQuantity from product where pCode = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, spCode);
			resultSet = preparedStatement.executeQuery();
			
			
			if(resultSet.next()) {
				String pCode = resultSet.getString("pCode");
				String pImg_detail = resultSet.getString("pImg_detail");
				String pImg_main = resultSet.getString("pImg_main");
				String pName = resultSet.getString("pName");
				String pQuantity = resultSet.getString("pQuantity");
				
				dto = new ProductDetail_dto(pCode, pImg_detail, pImg_main, pName, pQuantity);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//	
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}//
	
	
	
	
	public ProductDetail_dto stool (String spCode) {
		ProductDetail_dto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pImg_detail, pImg_main, pName, pQuantity from product where pCode = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, spCode);
			resultSet = preparedStatement.executeQuery();
			
			
			if(resultSet.next()) {
				String pCode = resultSet.getString("pCode");
				String pImg_detail = resultSet.getString("pImg_detail");
				String pImg_main = resultSet.getString("pImg_main");
				String pName = resultSet.getString("pName");
				String pQuantity = resultSet.getString("pQuantity");
				
				dto = new ProductDetail_dto(pCode, pImg_detail, pImg_main, pName, pQuantity);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//	
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}//
	
	
	///////////////////////////////////////////////////////
}