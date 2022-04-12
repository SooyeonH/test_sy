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
		request.setAttribute("alertTxt" , "로그인을 실패하셨습니다. 다시한번 확인해주세요.");
		RequestDispatcher rds = request.getRequestDispatcher("login.jsp");
		rds.forward(request, response);
	
	} else if (id != null){
		
		request.setAttribute("alertTxt" , "어서오세요. SIDIZ입니다.");
		RequestDispatcher rds = request.getRequestDispatcher("mainpage.jsp");
		rds.forward(request, response);
	}
	

%>		