package com.javalec.team.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.team.dao.InsertCart_dao;
import com.javalec.team.dao.InsertRightPayment_dao;

public class InsertRightPayment_Command implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String oPrice = request.getParameter("oPrice");
		String oAddress = request.getParameter("oAddress");
		String product_pCode = request.getParameter("product_pCode");
		String user_uId = request.getParameter("user_uId");
		System.out.println(oPrice);
		System.out.println(oAddress);
		System.out.println(product_pCode);
		System.out.println(user_uId);
		InsertRightPayment_dao dao = new InsertRightPayment_dao();
		dao.insertRightPayment(oPrice, oAddress, product_pCode, user_uId);
	}

}
