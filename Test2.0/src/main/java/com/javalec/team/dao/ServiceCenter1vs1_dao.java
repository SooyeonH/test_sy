package com.javalec.team.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.team.dto.ServiceCenter1vs1_dto;

public class ServiceCenter1vs1_dao {
	
		DataSource dataSource;
		
		public ServiceCenter1vs1_dao() {
			try {
				Context context = new InitialContext();
				dataSource = (DataSource) context.lookup("java:comp/env/jdbc/inquire"); //java:comp/env는 BListCommand다!
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		// ------------------------------------ 검색 부분 시작 --------------------------------------------
		// 전체 검색 (dao는 DB에서 가져오는 거고 jsp에 보내줘야되기때문에 dto를 만들러 가야됨)
			public ArrayList<ServiceCenter1vs1_dto> Inquire() {
				ArrayList<ServiceCenter1vs1_dto> dtos = new ArrayList<ServiceCenter1vs1_dto>();
				Connection connection = null;
				PreparedStatement preparedStatement = null;
				ResultSet resultSet = null;
				
				try {
					connection = dataSource.getConnection();
					String query = "select iNum, iCode, user_uId, iTitle, iContent, iDate, iReply from inquire"; 
					preparedStatement = connection.prepareStatement(query);
					resultSet = preparedStatement.executeQuery();
					
					while(resultSet.next()) {
						int iNum = resultSet.getInt("iNum");
						String iCode = resultSet.getString("iCode");
						String user_uId = resultSet.getString("user_uId");
						String iTitle = resultSet.getString("iTitle");
						String iContent = resultSet.getString("iContent");
						Timestamp iDate = resultSet.getTimestamp("iDate");//timestamp는 ctrl+space눌러줘!
						String iReply = resultSet.getString("iReply");
						
						ServiceCenter1vs1_dto dto = new ServiceCenter1vs1_dto(iNum, iCode, user_uId, iTitle, iContent, iDate, iReply); // dto에 다 넣은것
						dtos.add(dto); // ArrayList dtos에 dto한줄씩 쌓는다.
					}
					
				}catch (Exception e) {
					e.printStackTrace();
				}finally { // finally는 위에 try/catch문이 이상이 있든 없거나 무조건 온다
					try {
						if(resultSet != null) resultSet.close(); // resultSet에 데이터가 있으면 닫아줘
						if(preparedStatement != null) preparedStatement.close(); // resultSet에 데이터가 있으면 닫아줘
						if(connection != null) connection.close(); // resultSet에 데이터가 있으면 닫아줘
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				return dtos;
			} // list
}// ServiceCenter1vs1_dao