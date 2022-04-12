<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");

	Object id = request.getAttribute("uId");
	
	if (id == null){
		request.setAttribute("alertTxt" , "로그인실패");
		RequestDispatcher rds = request.getRequestDispatcher("login.jsp");
		rds.forward(request, response);
	
	} else if (id != null){
		
		request.setAttribute("alertTxt" , "로그인성공");
		RequestDispatcher rds = request.getRequestDispatcher("mainpage.jsp");
		rds.forward(request, response);
	}
	

%>		