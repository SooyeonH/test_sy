package com.javalec.team.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.team.dao.ServiceCenter1vs1Detail_dao;
import com.javalec.team.dto.ServiceCenter1vs1Detail_dto;

public class ServiceCenter1vs1Detail_Command implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String inum =  request.getParameter("iNum");
		
		ServiceCenter1vs1Detail_dao dao = new ServiceCenter1vs1Detail_dao();
		ArrayList<ServiceCenter1vs1Detail_dto>  dtos = dao.Content(inum);
		request.setAttribute("Content", dtos);
		
	}

}
