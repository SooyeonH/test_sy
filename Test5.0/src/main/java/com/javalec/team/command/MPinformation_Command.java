package com.javalec.team.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javalec.team.dao.MPinformation_dao;
import com.javalec.team.dto.MPinformation_dto;

public class MPinformation_Command implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		//값을 받아와야 함String uId =request.getParameter("uId");
		HttpSession session = request.getSession();
		String uid =(String)session.getAttribute("uId");
		
		MPinformation_dao dao = new MPinformation_dao();
		MPinformation_dto dto = dao.contentView(uid);
		request.setAttribute("content_view", dto);
		
	}

}
