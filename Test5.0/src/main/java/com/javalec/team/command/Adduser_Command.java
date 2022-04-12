package com.javalec.team.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.team.dao.Login_dao;

public class Adduser_Command implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String uId = request.getParameter("uId");
		String uName = request.getParameter("uName");
		String uEmail = request.getParameter("uEmail");
		String uPw = request.getParameter("uPw");
		String uPhone1 = request.getParameter("uPhone1");
		String uPhone2 = request.getParameter("uPhone2");
		String uBank = request.getParameter("uBank");
		String uAccount = request.getParameter("uAccount");
		String uAddress = request.getParameter("uAddress");
		
		Login_dao dao = new Login_dao ();
		dao.adduser(uId, uName, uEmail, uPw, uPhone1, uPhone2, uBank, uAccount, uAddress);
	}

}
