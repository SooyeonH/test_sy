<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<script type="text/javascript">
function idcheck(){
   alert("${idcheck.uId}")
      }
</script>


<script type="text/javascript">
      let alertT = '<%=request.getAttribute("idtxt")%>';
      
      if (alertT !== "null"){
         alert(alertT);   
         }
      </script>
      <div align="center">
<form action="idcheckuser.do">
ID : <input type="text" name="idcheck" id="aaa">
<br><br>
<input type="submit" value="중복체크하기">
</form>

      </div>
 <script src="js/main.js"></script> 
</body>
</html>