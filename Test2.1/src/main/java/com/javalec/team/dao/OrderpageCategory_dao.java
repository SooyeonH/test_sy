package com.javalec.team.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.team.dto.OrderpageCategory_dto;

public class OrderpageCategory_dao {

	DataSource dataSource;
	

	public OrderpageCategory_dao (){
		try {
			Context context = new InitialContext(); // sql에 접근
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/1teamp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 전체 검색
	public ArrayList<OrderpageCategory_dto> list(String uId) {
		ArrayList<OrderpageCategory_dto> dtos = new ArrayList<OrderpageCategory_dto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

			
		try {
			connection = dataSource.getConnection();
			String query ="select o.oCode,o.user_uId, p.pImg_main, p.pName , o.oQuantity , o.oPrice, o.oDecision from product as p, ordering as o where p.pCode=o.product_pCode and o.user_uId=? ";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,uId);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				String oCode = resultSet.getString("oCode");
				String user_uId = resultSet.getString("user_uId");
				String pImg_main = resultSet.getString("pImg_main");
				String pName = resultSet.getString("pName");
				String oQuantity = resultSet.getString("oQuantity");
				String oPrice = resultSet.getString("oPrice");
				String oDecision = resultSet.getString("oDecision");
				
				// 하나 작은박스로 집어넣을려고 dto 만든것
				OrderpageCategory_dto dto = new OrderpageCategory_dto(oCode,user_uId,pImg_main,pName,oQuantity,oPrice,oDecision);

				// 이제 큰박스에 하나하나 넣어야 함 dtos 에 하나씩 쌓임
				dtos.add(dto);
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
		return dtos;
	}// 여기까지 list

	
	
	
	
}
