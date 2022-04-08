package com.javalec.team.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.javalec.team.dao.ReviewWrite_dao;

public class ReviewWritepage_Command implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		
		String oCode=request.getParameter("oCode");
		String rTitle = request.getParameter("rTitle");
		String rImg = request.getParameter("imgFile");
		String rContent = request.getParameter("rContent");
		String uId = "c";
		
		System.out.println(rTitle);
		System.out.println(rContent);
		System.out.println(uId);
		System.out.println(oCode);
		System.out.println(rImg);
	
		
		ReviewWrite_dao dao = new ReviewWrite_dao();
		dao.write(rTitle, rImg, rContent, uId, oCode);
		}
	}


//rTitle rImg rContent user_uId order_oCode