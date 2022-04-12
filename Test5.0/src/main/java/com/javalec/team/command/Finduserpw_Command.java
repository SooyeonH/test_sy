package com.javalec.team.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.team.dao.Find_dao;


public class Finduserpw_Command implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// jsp에서 받는건 무조건 request한다고 생각하면 됨
		String uName = request.getParameter("name");
		String uEmail = request.getParameter("email");
		String uId = request.getParameter("id");
		
		
	
		Find_dao dao = new Find_dao();
		String pw= dao.contentView2(uName, uEmail,uId);
		//System.out.println("잘 실행되나 검사");
		request.setAttribute("uPw", pw);
		
	}

}