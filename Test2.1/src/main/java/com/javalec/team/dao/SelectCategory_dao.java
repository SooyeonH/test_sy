package com.javalec.team.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.team.dto.ProductReview_dto;


public class SelectCategory_dao {
	DataSource dataSource;
	
	public SelectCategory_dao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/1teamp");
			//Servers > context.xml  뿉  엳 뒗  젙蹂대줈 DB  뿰寃곗쓣  걹 궦 寃 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}/////
	
	
	
	public ArrayList<ProductReview_dto> all(){
		ArrayList<ProductReview_dto> dtos = new ArrayList<ProductReview_dto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pCategoryname, pName, pImg_main, pQuantity from product";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				String pCode = resultSet.getString("pCode");
				String pCategoryname = resultSet.getString("pCategoryname");
				String pName = resultSet.getString("pName");
				String pImg_main = resultSet.getString("pImg_main");
				String pQuantity = resultSet.getString("pQuantity");
				
				ProductReview_dto dto = new ProductReview_dto(pCode, pCategoryname, pName, pImg_main, pQuantity);
				
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 씠 긽 씠  엳嫄   뾾嫄  硫붾え由   젙由 	
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	} //list end
	
	
	
	
	public ArrayList<ProductReview_dto> slist(){
		ArrayList<ProductReview_dto> dtos = new ArrayList<ProductReview_dto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pCategoryname, pName, pImg_main, pQuantity from product where pCategoryname = '학생용 의자'";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				String pCode = resultSet.getString("pCode");
				String pCategoryname = resultSet.getString("pCategoryname");
				String pName = resultSet.getString("pName");
				String pImg_main = resultSet.getString("pImg_main");
				String pQuantity = resultSet.getString("pQuantity");
				
				ProductReview_dto dto = new ProductReview_dto(pCode, pCategoryname, pName, pImg_main, pQuantity);
				
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 씠 긽 씠  엳嫄   뾾嫄  硫붾え由   젙由 	
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	} //list end
	
	
	public ArrayList<ProductReview_dto> ilist(){
		ArrayList<ProductReview_dto> dtos = new ArrayList<ProductReview_dto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pCategoryname, pName, pImg_main, pQuantity from product where pCategoryname = '인테리어용 의자'";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				String pCode = resultSet.getString("pCode");
				String pCategoryname = resultSet.getString("pCategoryname");
				String pName = resultSet.getString("pName");
				String pImg_main = resultSet.getString("pImg_main");
				String pQuantity = resultSet.getString("pQuantity");
				
				ProductReview_dto dto = new ProductReview_dto(pCode, pCategoryname, pName, pImg_main, pQuantity);
				
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 씠 긽 씠  엳嫄   뾾嫄  硫붾え由   젙由 	
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	} //list end
	
	public ArrayList<ProductReview_dto> olist(){
		ArrayList<ProductReview_dto> dtos = new ArrayList<ProductReview_dto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pCategoryname, pName, pImg_main, pQuantity from product where pCategoryname = '사무용 의자'";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				String pCode = resultSet.getString("pCode");
				String pCategoryname = resultSet.getString("pCategoryname");
				String pName = resultSet.getString("pName");
				String pImg_main = resultSet.getString("pImg_main");
				String pQuantity = resultSet.getString("pQuantity");
				
				ProductReview_dto dto = new ProductReview_dto(pCode, pCategoryname, pName, pImg_main, pQuantity);
				
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 씠 긽 씠  엳嫄   뾾嫄  硫붾え由   젙由 	
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	} //list end
	
	public ArrayList<ProductReview_dto> tlist(){
		ArrayList<ProductReview_dto> dtos = new ArrayList<ProductReview_dto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pCategoryname, pName, pImg_main, pQuantity from product where pCategoryname = '스툴/좌식 의자'";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				String pCode = resultSet.getString("pCode");
				String pCategoryname = resultSet.getString("pCategoryname");
				String pName = resultSet.getString("pName");
				String pImg_main = resultSet.getString("pImg_main");
				String pQuantity = resultSet.getString("pQuantity");
				
				ProductReview_dto dto = new ProductReview_dto(pCode, pCategoryname, pName, pImg_main, pQuantity);
				
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 씠 긽 씠  엳嫄   뾾嫄  硫붾え由   젙由 	
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	} //list end
	
	
	
}