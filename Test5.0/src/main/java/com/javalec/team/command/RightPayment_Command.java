package com.javalec.team.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.team.dao.SelectDetail_dao;
import com.javalec.team.dto.ProductDetail_dto;

public class RightPayment_Command implements PCommand {

   @Override
   public void execute(HttpServletRequest request, HttpServletResponse response) {
      // TODO Auto-generated method stub

      
      String spCode = request.getParameter("pCode");
      SelectDetail_dao dao = new SelectDetail_dao();
      
      //detail page
      ProductDetail_dto dto = dao.all(spCode);
      request.setAttribute("detail", dto);
   }

}