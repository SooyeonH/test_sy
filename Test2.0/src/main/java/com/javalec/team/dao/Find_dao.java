package com.javalec.team.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.team.command.PCommand;
import com.javalec.team.dto.Find_dto;

public class Find_dao implements PCommand{

//	public void finduserid(String uName, String uEmail) {
//		// TODO Auto-generated method stub
//
		public void finduserid( String uId , String uEmail ) {
		Find_dto dto = null ;

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select uName, uEmail from user where uId = '" + userid +"'";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(ssNum));
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				
				String uName = resultSet.getString("uName");
				String uEmail = resultSet.getString("uEmail");

				
				dto = new Find_dto(uName, uEmail);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {   //finally는 이상이 없었을때나 있었을때나  메모리 정리를 해주는 것 
			
		try {
			if(resultSet != null) resultSet.close(); //데이터가 있으면 클로즈해라 
			if(preparedStatement != null) preparedStatement.close();
			if(connection != null) connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		return dto;
		
	}

		
					
						
		
		
		
	}

}
