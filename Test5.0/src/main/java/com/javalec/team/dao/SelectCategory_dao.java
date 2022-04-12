package com.javalec.team.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.team.dto.ProductReview_dto;


public class SelectCategory_dao {
	DataSource dataSource;
	
	public SelectCategory_dao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/1teamp");
			//Servers > context.xml  �굢占�  占쎈엿 占쎈츎  占쎌젧�솻洹ｏ옙餓ο옙 DB  �굢寃쇱물�⑥�щ굵  椰꾬옙 亦낉옙 �뇦占� 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}/////
	
	
	
	public ArrayList<ProductReview_dto> all(){
		ArrayList<ProductReview_dto> dtos = new ArrayList<ProductReview_dto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int p1 = 0;
		int p2 = 6;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pCategoryname, pName, pImg_main, pQuantity, pPrice, pClick from product limit ?, ?";
			preparedStatement = connection.prepareStatement(query);
			
			 preparedStatement.setInt(1, p1);
	         preparedStatement.setInt(2, p2);
	
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
			// 占쎈턄 疫뀐옙 占쎈턄  占쎈엿濾곤옙   驪볦뼃爾�  癲╉꺂��占쎄콫占쎈뎨   占쎌젧占쎈뎨 	
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
	
	public ArrayList<ProductReview_dto> allCategoryPage(int startnum, int endnum){
		ArrayList<ProductReview_dto> dtos = new ArrayList<ProductReview_dto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
	
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pCategoryname, pName, pImg_main, pQuantity, pPrice, pClick from product limit " + startnum + "," + endnum;
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
			// 占쎈턄 疫뀐옙 占쎈턄  占쎈엿濾곤옙   驪볦뼃爾�  癲╉꺂��占쎄콫占쎈뎨   占쎌젧占쎈뎨 	
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
	
	
	
	
	
	

	
	public ArrayList<ProductReview_dto> slist(){
		ArrayList<ProductReview_dto> dtos = new ArrayList<ProductReview_dto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int s1 = 0;
		int s2 = 6;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pCategoryname, pName, pImg_main, pQuantity, pPrice, pClick from product where pCategoryname = '학생용 의자' limit ?, ?";
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setInt(1, s1);
	        preparedStatement.setInt(2, s2);
			
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
			// 占쎈턄 疫뀐옙 占쎈턄  占쎈엿濾곤옙   驪볦뼃爾�  癲╉꺂��占쎄콫占쎈뎨   占쎌젧占쎈뎨 	
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
	
	
	public ArrayList<ProductReview_dto> studentCategoryyPage(int startnum, int endnum){
		ArrayList<ProductReview_dto> dtos = new ArrayList<ProductReview_dto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
	
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pCategoryname, pName, pImg_main, pQuantity, pPrice, pClick from product where pCategoryname = '학생용 의자' limit " + startnum + "," + endnum;
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
			// 占쎈턄 疫뀐옙 占쎈턄  占쎈엿濾곤옙   驪볦뼃爾�  癲╉꺂��占쎄콫占쎈뎨   占쎌젧占쎈뎨 	
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
	
	
	
	
	
	
	
	
	public ArrayList<ProductReview_dto> ilist(){
		ArrayList<ProductReview_dto> dtos = new ArrayList<ProductReview_dto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int i1 = 0;
		int i2 = 6;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pCategoryname, pName, pImg_main, pQuantity, pPrice, pClick from product where pCategoryname = '인테리어용 의자' limit ?, ?";
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setInt(1, i1);
	        preparedStatement.setInt(2, i2);
			
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
			// 占쎈턄 疫뀐옙 占쎈턄  占쎈엿濾곤옙   驪볦뼃爾�  癲╉꺂��占쎄콫占쎈뎨   占쎌젧占쎈뎨 	
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
	
	
	public ArrayList<ProductReview_dto> interiorCategoryyPage(int startnum, int endnum){
		ArrayList<ProductReview_dto> dtos = new ArrayList<ProductReview_dto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
	
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pCategoryname, pName, pImg_main, pQuantity, pPrice, pClick from product where pCategoryname = '인테리어용 의자' limit " + startnum + "," + endnum;
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
			// 占쎈턄 疫뀐옙 占쎈턄  占쎈엿濾곤옙   驪볦뼃爾�  癲╉꺂��占쎄콫占쎈뎨   占쎌젧占쎈뎨 	
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
	
	
	
	
	
	
	
	
	public ArrayList<ProductReview_dto> olist(){
		ArrayList<ProductReview_dto> dtos = new ArrayList<ProductReview_dto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int o1 = 0;
		int o2 = 6;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pCategoryname, pName, pImg_main, pQuantity, pPrice, pClick from product where pCategoryname = '사무용 의자' limit ?, ?";
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setInt(1, o1);
	        preparedStatement.setInt(2, o2);
			
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
			// 占쎈턄 疫뀐옙 占쎈턄  占쎈엿濾곤옙   驪볦뼃爾�  癲╉꺂��占쎄콫占쎈뎨   占쎌젧占쎈뎨 	
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
	
	
	public ArrayList<ProductReview_dto> officeCategoryyPageage(int startnum, int endnum){
		ArrayList<ProductReview_dto> dtos = new ArrayList<ProductReview_dto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
	
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pCategoryname, pName, pImg_main, pQuantity, pPrice, pClick from product where pCategoryname = '사무용 의자' limit " + startnum + "," + endnum;
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
			// 占쎈턄 疫뀐옙 占쎈턄  占쎈엿濾곤옙   驪볦뼃爾�  癲╉꺂��占쎄콫占쎈뎨   占쎌젧占쎈뎨 	
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
	
	
	
	
	
	
	
	public ArrayList<ProductReview_dto> tlist(){
		ArrayList<ProductReview_dto> dtos = new ArrayList<ProductReview_dto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		int t1 = 0;
		int t2 = 6;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pCategoryname, pName, pImg_main, pQuantity, pPrice, pClick from product where pCategoryname = '스툴/좌식 의자' limit ?, ?";
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setInt(1, t1);
	        preparedStatement.setInt(2, t2);
			
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
			// 占쎈턄 疫뀐옙 占쎈턄  占쎈엿濾곤옙   驪볦뼃爾�  癲╉꺂��占쎄콫占쎈뎨   占쎌젧占쎈뎨 	
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
	
	
	public ArrayList<ProductReview_dto> stoolCategoryyPage(int startnum, int endnum){
		ArrayList<ProductReview_dto> dtos = new ArrayList<ProductReview_dto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
	
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pCategoryname, pName, pImg_main, pQuantity, pPrice, pClick from product where pCategoryname = '스툴/좌식 의자' limit " + startnum + "," + endnum;
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
			// 占쎈턄 疫뀐옙 占쎈턄  占쎈엿濾곤옙   驪볦뼃爾�  癲╉꺂��占쎄콫占쎈뎨   占쎌젧占쎈뎨 	
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