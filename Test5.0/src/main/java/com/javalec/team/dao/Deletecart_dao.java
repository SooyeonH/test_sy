package com.javalec.team.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Deletecart_dao {
   
   DataSource dataSource; // Servers-context.xml을 가져올거임
   public Deletecart_dao() {
      
   try {
      Context context = new InitialContext();
      dataSource = (DataSource) context.lookup("java:comp/env/jdbc/1teamp");
   } catch (Exception e) {
      e.printStackTrace();
   }
   }

   public void deletecart(String pCode, int cQuantity) {

      Connection connection = null;
      PreparedStatement preparedStatement = null;
   

      try {
      connection = dataSource.getConnection();
      String query = "delete from cart where product_pCode = ? and cQuantity=?";
      preparedStatement = connection.prepareStatement(query);
      preparedStatement.setString(1, pCode);
      preparedStatement.setInt(2, cQuantity);
      preparedStatement.executeUpdate();
   
      } catch (Exception e) {
         e.printStackTrace();
      } finally { // 이상이 있거나 없거나 온다.
      try {
      if (preparedStatement != null) preparedStatement.close();
      if (connection != null) connection.close();
      } catch (Exception e) {
      e.printStackTrace();

      }

         }
      }
   }   

