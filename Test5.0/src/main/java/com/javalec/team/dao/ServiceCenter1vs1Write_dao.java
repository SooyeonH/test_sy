package com.javalec.team.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ServiceCenter1vs1Write_dao {

	DataSource dataSource;
	public ServiceCenter1vs1Write_dao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/1teamp"); //java:comp/env는 BListCommand다!
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void write(String iCode, String user_uId, String user_uEmail, String iTitle, String iContent) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "insert into inquire (iCode, user_uId, user_uEmail, iTitle, iContent, iDate, iReply) values (?,?,?,?,?,now(),'답변중')"; 
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, iCode);
			preparedStatement.setString(2, user_uId);
			preparedStatement.setString(3, user_uEmail);
			preparedStatement.setString(4, iTitle);
			preparedStatement.setString(5, iContent);
			
			
			preparedStatement.executeUpdate();
			
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally { // finally는 위에 try/catch문이 이상이 있든 없거나 무조건 온다
			try {
				if(preparedStatement != null) preparedStatement.close(); // resultSet에 데이터가 있으면 닫아줘
				if(connection != null) connection.close(); // resultSet에 데이터가 있으면 닫아줘
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	} // write
}
