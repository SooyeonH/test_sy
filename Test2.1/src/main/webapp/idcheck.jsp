<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import ="java.sql.*" %>
    <%
	request.setCharacterEncoding("utf-8");
	//_01에서 받아온 userid를 userid에 저장한다.
	String uId = request.getParameter("uId");
	
	String strUserid = "";

	// mysql이 있는 위치 / 스키마 이름 customer 
	String url_mysql = "jdbc:mysql://localhost:3306/teamproject1?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
	String id_mysql ="root";
	String pw_mysql ="qwer1234";
	// 만약에 id가 정수가 아니라 문자였으면 "select userid from wtest where id = '" + id + "'"; 으로 써야됨
	String query = "select uId from user where uId = '" + uId +"'";
	try{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);//연결
		Statement stmt_mysql = conn_mysql.createStatement();
		
		// rs를 통해 데이터베이스에서 원하는 값들을 가져오는거!
		ResultSet rs = stmt_mysql.executeQuery(query);
		// re.next()의 getString(1~4)는 query의 userid, name, tel, address의 순서다.
		while(rs.next()){
			strUserid = rs.getString(1);			
		}
		
		conn_mysql.close(); // 종료시키는 코드
		
		// 사용자 ID가 없을 경우 돌려보내는 코
		if(strUserid.equals("")){
			out.print("<script>alert('사용 가능한 ID입니다.'); location.href='adduser.jsp' ; </script> ");
		}else{
			out.print("<script>alert('사용 불가능한 ID입니다.'); location.href='adduser.jsp' ; </script> ");
		}
		
	
	}catch(Exception e){
		e.printStackTrace();
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ID중복체크</title>
</head>
<body>

</body>
</html>


