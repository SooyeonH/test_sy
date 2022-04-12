package com.javalec.team.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.team.dao.Find_dao;


public class Finduserid_Command implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// jsp에서 받는건 무조건 request한다고 생각하면 됨
		String uName = request.getParameter("name");
		String uEmail = request.getParameter("email");
		
		
	
		Find_dao dao = new Find_dao();
		String id= dao.contentView(uName, uEmail);
		//System.out.println("잘 실행되나 검사");
		request.setAttribute("uId", id);
		
	}

}


//package com.javalec.team.command;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.javalec.team.dao.Find_dao;
//import com.javalec.team.dto.Find_dto;
//
//public class Finduserid_Command implements PCommand {
//
//	@Override
//	public void execute(HttpServletRequest request, HttpServletResponse response) {
//		// TODO Auto-generated method stub
//		
//	String uId = request.getParameter("uId");
//	String uEmail = request.getParameter("uEmail");
//	String uName = request.getParameter("uName");
//	
//	Find_dao dao = new Find_dao ();
//	Find_dto dto = dao.finduserid(uId);
//	
//	request.setAttribute("finduserid", dto);
//	}
//}


