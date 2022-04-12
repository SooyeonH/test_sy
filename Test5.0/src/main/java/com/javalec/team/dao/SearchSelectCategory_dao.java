package com.javalec.team.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.team.dto.ProductReview_dto;

public class SearchSelectCategory_dao {
	DataSource dataSource;
	
	public SearchSelectCategory_dao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/1teamp");
			//Servers > context.xml  뿉  엳 뒗  젙蹂대줈 DB  뿰寃곗쓣  걹 궦 寃 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}/////
	
	
	
	public ArrayList<ProductReview_dto> all(String queryContent){
		ArrayList<ProductReview_dto> dtos = new ArrayList<ProductReview_dto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pCategoryname, pName, pImg_main, pQuantity, pPrice, pClick from product";
			
			if(queryContent != null) {
	            query += " where pName like '%" + queryContent + "%'";
	         }
			
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				String pCode = resultSet.getString("pCode");
				String pCategoryname = resultSet.getString("pCategoryname");
				String pName = resultSet.getString("pName");
				String pImg_main = resultSet.getString("pImg_main");
				String pQuantity = resultSet.getString("pQuantity");
				String pPrice = resultSet.getString("pPrice");
				int pClick = resultSet.getInt("pClick");
				
				ProductReview_dto dto = new ProductReview_dto(pCode, pCategoryname, pName, pImg_main, pQuantity, pPrice, pClick);
				
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
