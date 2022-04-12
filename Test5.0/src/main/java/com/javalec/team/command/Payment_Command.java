package com.javalec.team.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.javalec.team.dao.Wishlist_dao;
import com.javalec.team.dto.Wishlist_dto;

public class Payment_Command implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	 String uId="aaaaa";

		Wishlist_dao dao = new Wishlist_dao();
		ArrayList<Wishlist_dto> dtos = dao.list(uId);
		request.setAttribute("list", dtos);
	}

}
