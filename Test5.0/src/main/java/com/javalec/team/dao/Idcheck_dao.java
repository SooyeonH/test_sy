package com.javalec.team.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Idcheck_dao {
   DataSource dataSource;

    public Idcheck_dao() {
       try {
          Context context = new InitialContext();
         dataSource = (DataSource) context.lookup("java:comp/env/jdbc/1teamp");
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
    
    public String idcheck(String idcheck) {
       
      Connection connection = null;
      PreparedStatement preparedStatement = null;
      ResultSet resultSet = null;
      String uId=null;
      try {
         connection = dataSource.getConnection();
         String query = "select uId from user where uId = ?"; 
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, idcheck);
         resultSet = preparedStatement.executeQuery();
         
         if(resultSet.next()) {
            uId = resultSet.getString("uId");
         
//            dto = new Find_dto (uId); // dto에 다 넣은것
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
      return uId;
      
   }
}