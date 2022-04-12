package com.javalec.team.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.team.dao.SearchSelectCategory_dao;
import com.javalec.team.dto.ProductReview_dto;

public class SearchAllCategory_Command implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	    String queryContent = request.getParameter("content");
	    
		SearchSelectCategory_dao dao = new SearchSelectCategory_dao();
		ArrayList<ProductReview_dto> dtos = dao.all(queryContent);
		request.setAttribute("list", dtos);
	}

}
