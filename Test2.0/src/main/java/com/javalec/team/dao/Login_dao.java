package com.javalec.team.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Login_dao {
	DataSource dataSource;

	public Login_dao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/1teamp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String login(String uId, String uPw) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String iD = null;

		try {
			connection = dataSource.getConnection();
			String query = "select uId from user where uId = ? and uPw = ? and uLeave is null";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, uId);
			preparedStatement.setString(2, uPw);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				iD = resultSet.getString("uId");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
		} // finally
		return iD;
	} // login

	
	public void adduser(String uId, String uName, String uEmail, String uPhone1, String uPhone2, String uBank, String uAccount,
			String uAddress) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement preparedStatement = null;
	
	try {
		connection = dataSource.getConnection();
		String query = "insert into user (uId, uName, uEmail, uPhone1, uPhone2, uBank, uAccount, uAddress, uJoin) values(?,?,?,?,?,?,?,?,now())";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, uId);
		preparedStatement.setString(2, uName);
		preparedStatement.setString(3, uEmail);
		preparedStatement.setString(4, uPhone1);
		preparedStatement.setString(5, uPhone2);
		preparedStatement.setString(6, uBank);
		preparedStatement.setString(7, uAccount);
		preparedStatement.setString(8, uAddress);

		preparedStatement.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	} finally { // finally는 위에 try/catch문이 이상이 있든 없거나 무조건 온다
		try {
			if (preparedStatement != null)
				preparedStatement.close(); // resultSet에 데이터가 있으면 닫아줘
			if (connection != null)
				connection.close(); // resultSet에 데이터가 있으면 닫아줘
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
	
	
	

	}

	



//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//

//import com.javalec.tdl.dto.TDtoM;

// Constructor
// userId(*), userPw, userName, signupDate(datetime), resignDate(datetime)

// login

// sign
//	public void signup(String userId,String userPw,String userName) {
//		Connection connection = null;
//		PreparedStatement preparedStatement = null;
//		
//		try {
//			connection = dataSource.getConnection(); // DB연결 끝
//			String query = "insert into customer (userId, userPw, userName, signupDate) values (?,?,?,now())";
//			preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setString(1, userId);
//			preparedStatement.setString(2, userPw);
//			preparedStatement.setString(3, userName);
//			
//			preparedStatement.executeUpdate();
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(preparedStatement != null) preparedStatement.close();
//				if(connection != null) connection.close();
//			}catch (Exception e) {
//				e.printStackTrace();
//			}
//		}// finally 메모리 정리 ; 이상 있거나 없거나 무조건 거친다.
//	} //sign up

// my page
//	public ArrayList<TDtoM> mypage(String loginId) {
//		ArrayList<TDtoM> dtosM = new ArrayList<TDtoM>();
//		Connection connection = null;
//		PreparedStatement preparedStatement = null;
//		ResultSet resultSet = null;
//			
//		try {
//			connection = dataSource.getConnection();
//			String query = "select userId, userName from customer where userId = ?";
//			preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setString(1, loginId);
//			
//			resultSet = preparedStatement.executeQuery();
//			
//			while (resultSet.next()) {
//				String userId = resultSet.getString("userId");
//				String userName = resultSet.getString("userName");
//				
//				TDtoM dtoM = new TDtoM(userId, userName);
//				dtosM.add(dtoM);
//			}
//				
//				
//		}catch(Exception e){
//			e.printStackTrace();
//		}finally {
//				try {
//					if(resultSet != null) resultSet.close();
//					if(preparedStatement != null) preparedStatement.close();
//					if(connection != null) connection.close();
//				}catch (Exception e) {
//					e.printStackTrace();
//				}
//			} 
//		return dtosM;
//		} 
//
//	
//	
//		// resign
//		public void resign(String userId) {
//			
//			Connection connection = null;
//			PreparedStatement preparedStatement = null;
//			
//			try {
//				//DB연결메서드 불러오기
//				connection = dataSource.getConnection(); 
//				//pstmt 생성
//				String query = "update customer set resignDate = now() where userId = ? " ;
//				preparedStatement = connection.prepareStatement(query);
//				preparedStatement.setString(1, userId);
//				//실행 
//				preparedStatement.executeUpdate();
//			} catch (Exception e) {
//				e.printStackTrace();
//			} finally { 
//					try {
//						if(preparedStatement !=null) preparedStatement.close();
//						if(connection != null) connection.close();
//	 			}catch (Exception e) {
//					e.printStackTrace();
//	 			}
//			}
//		}//resign
