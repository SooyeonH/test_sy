package com.javalec.team.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javalec.team.dao.Idcheck_dao;

public class IdCheck_Command implements PCommand {

   @Override
   public void execute(HttpServletRequest request, HttpServletResponse response) {
      // TODO Auto-generated method stub\
      HttpSession session = request.getSession();
      String idcheck = request.getParameter("idcheck");
      
      
      Idcheck_dao dao = new Idcheck_dao();   
      String IdCheck= dao.idcheck(idcheck);
      
      request.setAttribute("uId", IdCheck);
      
      if(dao.idcheck(IdCheck) == null) {
         session.setAttribute("idtxt", "사용할 수 있는 아이디입니다.");
         session.setAttribute("userid", idcheck);
      }else if(dao.idcheck(IdCheck) != null) {
         session.setAttribute("idtxt", "중복된 아이디입니다.");
         session.setAttribute("userid", "다시 중복체크를 해주세요.");
      }
      
   }

}