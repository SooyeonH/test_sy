package com.javalec.team.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.team.dao.InsertCart_dao;

public class InsertCart_Command implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String pCode = request.getParameter("pCode");
		int pQuantity =Integer.parseInt(request.getParameter("pQuantity"));
		
		InsertCart_dao dao = new InsertCart_dao();
		dao.insertCart(pCode, pQuantity);

}}
