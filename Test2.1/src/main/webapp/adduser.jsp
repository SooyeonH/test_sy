<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- 부트스트랩 css -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
<script src="https://kit.fontawesome.com/0ffbbfb20c.js" crossorigin="anonymous"></script>
<meta charset="UTF-8">

<!-- 부트스트랩 js -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
<script type="js/main.js"></script>

<title>홈페이지</title>

</head>

<body>
	<!-- Header start -->
	<header id="Top">
		<nav class="navbar navbar-light " style="background-color: #BBBBBB;">
			<div class="container-fluid">
				<a class="navbar-brand" href="mainpage.jsp"><img src="image/homepageIcon.png" style="padding:5px 0 5px 20px;"></a>
				<nav class="navbar navbar-light bg-#BBBBBB">
					<div class="container-fluid" >
						<form class="d-flex" >
							<input class="form-control form-outline-secondary me-3" type="search"
								placeholder="Search" aria-label="Search" >
							<button class="btn btn-outline-secondary" type="submit" ><i class="fa-solid fa-magnifying-glass"></i></button>
						</form>
					</div>
				</nav>
				<a class="nav-link" href="login.do" style="color:white;">로그인 <i class="fa-solid fa-right-to-bracket"></i></a> 
				<a class="nav-link" href="adduser.do" style="color:white;">회원가입 <i class="fa-solid fa-user-plus"></i></a>
				<a class="nav-link" href="wishlist.do" style="color:white;">장바구니 <i class="fa-solid fa-bag-shopping"></i></a> 
				<a class="nav-link" href="mpInformation.do" style="color:white;">마이페이지 <i class="fa-solid fa-circle-user"></i></a>
				<a class="nav-link" href="orderpageCategory.do" style="color:white;">주문조회 <i class="fa-solid fa-circle-user"></i></a>
				<a class="nav-link" href="serviceCenter.do" style="color:white;">고객센터 <i class="fa-solid fa-house-user"></i></a>
				
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarScroll"
					aria-controls="navbarScroll" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
			</div>
			<div class="container-fluid" style="background-color: #EEEEEE;">
				<div class="collapse navbar-collapse" id="navbarScroll">
					<ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll"
						style="-bs-scroll-height: 50px;">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="mainpage.do">Home</a></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#"
							id="navbarScrollingDropdown" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> 전체 카테고리 </a>
							<ul class="dropdown-menu"
								aria-labelledby="navbarScrollingDropdown">
								<li><a class="dropdown-item" href="allCategory.do"> 상품 전체보기</a></li>
								<li><hr class="dropdown-divider"></li>
								<li><a class="dropdown-item" href="studentCategory.do"> 학생용 의자</a></li>
								<li><hr class="dropdown-divider"></li>
								<li><a class="dropdown-item" href="officeCategory.do"> 사무용 의자</a></li>
								<li><hr class="dropdown-divider"></li>
								<li><a class="dropdown-item" href="interiorCategory.do"> 인테리어 의자 </a></li>
								<li><hr class="dropdown-divider"></li>
								<li><a class="dropdown-item" href="stoolCategory.do"> 스툴 / 좌식의자 </a></li>
							</ul>
						</li>
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="index.jsp"></a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<!-- Header End -->
	
	<!-- Bread Crumb Start -->
	<section class="breadCrumb">
		<nav aria-label="breadcrumb">
		  <ol class="breadcrumb">
		    <li class="breadcrumb-item active" aria-current="page">Home</li>
		  </ol>
		</nav>
	</section>
	<!-- Bread Crumb End -->
	
	<!-- 여기부터 넣으시면 됩니다 Start -->
	<h2>회원가입</h2>
	<form action="addfinish.do" method="get">

		<table>
			<tr height="7">
				<td colspan="4"><hr /></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input type="text" id="inputID" name="uId"></td>
				<td><a href="idchk.do"><input type="button" name="check" value="중복체크" size="5"></a>
				<td>공백없는 5~12자리 영문/숫자 조합</td>
			<tr>
				<td id="error-id"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" id="inputPW" name="uPw">
				<td></td>
				<td>공백없는 5~12자리 영문/숫자 조합</td>
			<tr>
				<td id="error-pw"></td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td><input type="password" id="inputPW2" name="uPw2">
			<tr>
				<td></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" id="inputNAME" name="uName"></td>
			<tr>
				<td id="error-name"></td>
			</tr>
			
			<tr>
				<td>이메일</td>
				<td><input type="text" id="inputEMAIL" name="uEmail" placeholder="abc@naver.com"></td>
			<tr>
				<td id="error-email"></td>
			</tr>
			
			<tr>
				<td>휴대폰번호 :</td>
				<td>010-<input type="text" placeholder="1234" name="uPhone1" size="5">-<input type="text" name="uPhone2" placeholder="5678" size="5"></td>
			<tr>	
				<td></td>
			</tr>
		    
			<tr>
				<td>본인계좌</td>
				<td>
				<select name="uBank">
				<option  selected="selected">국민</option>
				<option>신한</option>
				<option>농협</option>
				<option>하나</option>
				<option>기업</option>
				</select>
			
				<input type="text" id="inputACCOUNT" name="uAccount"
					placeholder="12345678" size="14"></td>
				<td></td>
				<td>- 없이 숫자만 입력해주세요</td>
			<tr>
				<td id="error-account"></td>
			</tr>
	
			<tr>
				<td>주소</td>
				<td><input type="text" name="uAddress"></td>
			<tr>
				<td></td>
			</tr>
			
			
			<tr height="7">
				<td colspan="4"><hr /></td>
			</tr>
			<tr>
			<td><input type="submit" value="가입하기" onclick="checkAddfinish"></td>
			</tr>
		</table>
	</form>

 
 	<form action="form" id="form" method="post">
<div id="list"></div>
<div id="callBackDiv"></div>   
<div>주소 : <input type="text"  style="width:50px;" id="zipNo"  name="zipNo" />
<button type="button" onClick="goPopup();"> 주소찾기</button></div>
 <div style="padding-left: 2.9em"><div><input type="text"  style="width:300px;" id="address"  name="address" placeholder="위에 주소찾기 버튼을 눌러주세요."/></div>
</div>         

</form> 


<script type="text/javascript">
var isCheckConfirmPasswd = false;

function checkConfirmPasswd(confirmPasswd) {
	var passwd = document.fr.passwd.value;
	
	var span_checkConfirmPasswdResult = document.getElementById("checkConfirmPasswdResult");
	
	if(passwd == confirmPasswd) {
		span_checkConfirmPasswdResult.innerHTML = "비밀번호 일치";
		span_checkConfirmPasswdResult.style.color = "BLUE";
		
		isCheckConfirmPasswd = true;
	} else {
		span_checkConfirmPasswdResult.innerHTML = "비밀번호 불일치";
		span_checkConfirmPasswdResult.style.color = "RED";

		isCheckConfirmPasswd = false;
	}
}




</script>



<script>

function goPopup(){
   // 주소검색을 수행할 팝업 페이지를 호출합니다.
   // 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(https://www.juso.go.kr/addrlink/addrLinkUrl.do)를 호출하게 됩니다.
   var pop = window.open("/Test/jusoPopup.jsp","pop","width=570,height=420, scrollbars=yes, resizable=yes"); 
    
}

function jusoCallBack(zipNo,roadFullAddr){
         var zipNoEl = document.querySelector("#zipNo");
         var addressEl = document.querySelector("#address");
         zipNoEl.value=zipNo;
         addressEl.value=roadFullAddr;
      
}

</script>
	
	<!-- End -->
	
	<!-- Footer start -->
	<footer >
		<div class="card" style="background-color: #696464; color: #E9E5DD;">
			<div class="card-body text-left mt-4" style="background-color: #696464;">
				<h3><a href="serviceCenter.do" style="text-decoration : none; color : white;">고객센터   <i class="fa-solid fa-house-user"></i></a></h3>
				<h6 class="card-title mt-3 mb-3">상담시간: 평일 09:00~17:30 (점심시간 12:00~13:00) / 주말 & 공휴일 휴무</h6><br>				
				<h1>
					<a href="facebook.com" style="text-decoration : none; color : white;"><i class="fa-brands fa-facebook"></i></a> 
					<a href="facebook.com" style="text-decoration : none; color : white;"><i class="fa-brands fa-instagram"></i></a>
					<a href="facebook.com" style="text-decoration : none; color : white;"><i class="fa-brands fa-youtube"></i></a>
					<a href="facebook.com" style="text-decoration : none; color : white;"><i class="fa-brands fa-twitter"></i></a>
				</h1>
				<br>
				<hr class="dropdown-divider"><br>
				<p class="card-text mt-4 mb-4">
				상호명 : (주) 시디즈<br>
				대표이사 : 이승민 <br>
				개인정보보호책임자 : 한수연<br>
				주소 : 서울 강동구 천호대로157길 14, 6층 (천호동, 나비빌딩)<br>
				사업자등록번호 : 156-80-12341 <br>
				사업자정보확인 통신판매업신고번호 : 제 5004-00123</p><br>
				<hr class="dropdown-divider">
			</div>
			<div class="card-body text-center">
				<p class="card-text mb-3">Copyright &copy; <script>document.write(new Date().getFullYear());</script> ALL rights reserved.</p>
			</div>
			<div class="card-footer text-center text-muted mt-2 mb-2"><br>
				<a href="#Top" class="btn btn-outline-secondary">맨 위로 가기 <i class="fa-solid fa-angles-up"></i></a>
			</div>
		</div>
	</footer>
	<!-- Footer End -->
<script src="https://code.jquery.com/jquery-3.6.0.slim.min.js"
		integrity="sha256-u7e5khyithlIdTpu22PHhENmPcRdFiHRjhAuHcs05RI="
		crossorigin="anonymous"></script>
	<script>
	
$("#inputID").blur(function(){
	var regType1 = /^[A-Za-z0-9+]{5,12}$/;
	if (!regType1.test($("#inputID").val())) {
			$("#error-id").html("★아이디 잘못★")
	}
	})
$("#inputID").keyup(function(){
	$("#error-id").html("")
})	

$("#inputPW").blur(function(){
	var regType2 = /^[A-Za-z0-9+]{5,12}$/;
	if (!regType2.test($("#inputPW").val())) {
			$("#error-pw").html("★비밀번호 잘못★")
	}
	})
$("#inputPW").keyup(function(){
	$("#error-pw").html("")
})	

$("#inputNAME").blur(function(){
	var regType3 = /^[가-힣]*$/;
	if (!regType3.test($("#inputNAME").val())) {
			$("#error-name").html("★이름 잘못★")
	}
	})
$("#inputNAME").keyup(function(){
	$("#error-name").html("")
})	

$("#inputEMAIL").blur(function(){
	var regType4 = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
	if (!regType4.test($("#inputEMAIL").val())) {
			$("#error-email").html("★이메일 잘못★")
	}
	})
$("#inputEMAIL").keyup(function(){
	$("#error-email").html("")
})	

$("#inputACCOUNT").blur(function(){
	var regType5 = /^[0-9]*$/;
	if (!regType5.test($("#inputACCOUNT").val())) {
			$("#error-account").html("★계좌 잘못★")
	}
	})
$("#inputACCOUNT").keyup(function(){
	$("#error-account").html("")
})	
 

	

</script>

</body>

</html>