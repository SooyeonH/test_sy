package com.javalec.team.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.team.dao.SelectDetail_dao;

public class Click_Command implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		String spCode = request.getParameter("pCode");
		int spClick = (Integer.parseInt(request.getParameter("pClick"))+1);
		
		SelectDetail_dao dao = new SelectDetail_dao();
		dao.clickadd(spCode, spClick);

		
	}

}
