package com.javalec.team.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.team.dto.MPinformation_dto;
import com.javalec.team.dto.OrderpageCategory_dto;

public class OrderpageCategory_dao {
	DataSource dataSource;

	public OrderpageCategory_dao() {
		try {
			Context context = new InitialContext(); // sql에 접근
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/1teamp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public OrderpageCategory_dto contentView(String Id) {

		OrderpageCategory_dto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = dataSource.getConnection();
			String query = "select o.user_uId, p.pImg_main, p.pName , o.oQuantity , o.oPrice, o.oDecision from product as p, ordering as o where p.pCode=o.product_pCode and o.user_uId=? ";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, Id);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				
				String user_uId = resultSet.getString("user_uId");
				String pImg_main = resultSet.getString("pImg_main");
				String pName = resultSet.getString("pName");
				String oQuantity = resultSet.getString("oQuantity");
				String oPrice = resultSet.getString("oPrice");
				String oDecision = resultSet.getString("oDecision");
				

				// 하나 작은박스로 집어넣을려고 dto 만든것
				dto = new OrderpageCategory_dto(user_uId,pImg_main,pName,oQuantity,oPrice,oDecision);

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

	}//end

	
	
}
