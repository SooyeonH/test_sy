<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   request.setCharacterEncoding("utf-8");

   Object id =request.getAttribute("uId");

   if(id != null){
      
      request.setAttribute("alertTxt" , "아이디는 " + id + " 입니다." );
      RequestDispatcher rds = request.getRequestDispatcher("login.jsp");
      rds.forward(request, response);
   }else {
      request.setAttribute("alertTxt" , "회원가입된 정보가 없습니다");
      RequestDispatcher rds = request.getRequestDispatcher("finduser.jsp");
      rds.forward(request, response);
   
   }
   

%>   
</body>
</html>