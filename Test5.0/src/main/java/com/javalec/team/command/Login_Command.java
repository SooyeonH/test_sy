package com.javalec.team.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javalec.team.dao.Login_dao;

public class Login_Command implements PCommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String uId = request.getParameter("uId");
		String uPw = request.getParameter("uPw");

		Login_dao dao = new Login_dao();
		String id = dao.login(uId, uPw);
		
		request.setAttribute("uId" , id);
		//세션저장 한 곳
		HttpSession session = request.getSession();//저장시킬 곳에서 쓰기 두줄다!!!!
		session.setAttribute("uId", id);
	}

}