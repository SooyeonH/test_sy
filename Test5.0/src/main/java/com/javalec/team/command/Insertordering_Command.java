package com.javalec.team.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.team.dao.InsertOrdering_dao;


public class Insertordering_Command implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		
		String address = request.getParameter("address");
		String uId = "aaaaa";
		
		
		InsertOrdering_dao dao = new InsertOrdering_dao();
		dao.modify(address, uId);
	}

}
