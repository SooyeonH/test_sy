package com.javalec.team.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.team.dao.SelectDetail_dao;
import com.javalec.team.dto.ProductDetail_dto;
import com.javalec.team.dto.ReviewlistDetail_dto;

public class StoolDetail_Command implements PCommand {

   @Override
   public void execute(HttpServletRequest request, HttpServletResponse response) {
      // TODO Auto-generated method stub
      String spCode = request.getParameter("pCode");
      SelectDetail_dao dao = new SelectDetail_dao();
      
      //detail page
      ProductDetail_dto dto = dao.stool(spCode);
      request.setAttribute("detail", dto);
      
      //review list
      ArrayList<ReviewlistDetail_dto> dtos = dao.allreview(spCode);
      request.setAttribute("review", dtos);
   }

}