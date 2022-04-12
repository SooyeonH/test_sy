package com.javalec.team.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.team.dto.Wishlist_dto;

public class Payment_dao {
DataSource dataSource; // Servers-context.xml을 가져올거임
	
	public Payment_dao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/1teamp");
		} catch (Exception e) {
			e.printStackTrace();
		}

		}
	
	public ArrayList<Wishlist_dto> list(String uId) {

		ArrayList<Wishlist_dto> dtos = new ArrayList<Wishlist_dto>();

		Connection connection = null;

		PreparedStatement preparedStatement = null;

		ResultSet resultSet = null;

		try {

		connection = dataSource.getConnection();

		String query = "select p.pName, p.pImg_main, c.cQuantity, c.cDate, p.pCode, p.pPrice "
				+"from product as p, cart as c "
				+"where p.pCode = c.product_pCode and c.user_uId= '"+uId+"'";
		
		preparedStatement = connection.prepareStatement(query);

		resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {

		String pName = resultSet.getString("pName");
		
		String pImg_main = resultSet.getString("pImg_main");
		
		int cQuantity = resultSet.getInt("cQuantity");
		
		Timestamp cDate = resultSet.getTimestamp("cDate");
		
		String pCode = resultSet.getString("pCode");

		int pPrice = resultSet.getInt("pPrice");
		
		Wishlist_dto dto = new Wishlist_dto(pName, pImg_main, cQuantity, cDate, pCode,pPrice);

		dtos.add(dto);

		}

		} catch (Exception e) {

		e.printStackTrace();

		} finally { // 이상이 있거나 없거나 온다.

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

		return dtos;
}
	
}
