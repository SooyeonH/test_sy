<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<style>
.mypage {
padding : 20px 0 0 30px;
}
.wishlist{
padding : 50px 0 0 150px;
}
.BreadCrumb {
padding : 30px 0 0 40px;
font-size: 1.2rem;
}
#detaillist {
text-align:right;
}
.container1{
margin : 0 0 100px 0;
}
</style>
<body>
	<!-- Header start -->
	<header id="Top">
		<nav class="navbar navbar-light " style="background-color: #BBBBBB;">
			<div class="container-fluid">
				<a class="navbar-brand" href="mainpage.jsp"><img src="image/homepageIcon.png" style="padding:5px 0 5px 20px;"></a>
				<nav class="navbar navbar-light bg-#BBBBBB">
					<div class="container-fluid" >
						<form class="d-flex" action="searchallCategory.do">
							<input class="form-control form-outline-secondary me-3" type="text" name="content"
								placeholder="상품이름을 검색하세요." aria-label="Search" >
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
	<div class = "BreadCrumb">
		<section class="breadCrumb">
			<nav aria-label="breadcrumb">
			  <ol class="breadcrumb">
			    <li class="breadcrumb-item"><a href="mainpage.jsp">Home</a></li>
			    <li class="breadcrumb-item active" aria-current="page">마이페이지</li>
			  </ol>
			</nav>
		</section>
	</div>
	<!-- Bread Crumb End -->
	
	<!-- 여기부터 넣으시면 됩니다 Start -->
	<br><br>
	<h1 align="center">마이페이지</h1><br><hr class="dropdown-divider"><br>
	<div class = "container1">
	<div class="container">
		<div class="row justify-content-md-center">
		    <div class="col col-lg-7 ">
		      	<form action="mpchange.do" method="post">
		      		<table class="table table-bordered align-middle" style="text-align:center">
		      		 <thead>
			      		 <tr>
			      		 <td class="table-secondary"><h4>구분</h4></td>
			      		 <td class="table-secondary"><h4>나의 정보</h4></td>
  					 </thead>
 					 <tbody>
		      			<tr>
		      				<th scope="col" id="detaillist" class="table-light" >사용자 ID : </th>
		      				<td><input type="text" name="uId" size="30" value="${content_view.uId }" readonly="readonly"></td>
		      			</tr>
		      			<tr>
		      				<th scope="col" id="detaillist" class="table-light">성명 : </th>
		      				<td><input type="text" name="uName" size="30" value="${content_view.uName }"readonly="readonly" ></td>
		      			</tr>
		      			<tr>
		      				<th scope="col" id="detaillist" class="table-light">이메일 : </th>
		      				<td><input type="text" name="uEmail" size="30" value="${content_view.uEmail }" ></td>
		      			</tr>	
		      			<tr>
		      				<th scope="col" id="detaillist" class="table-light">휴대폰 번호 : </th>
		      				<td>010 - <input type="text" name="uPhone1" size="8" value="${content_view.uPhone1 }" > - <input type="text" name="uPhone2" size="8" value="${content_view.uPhone2 }" ></td>
		      			</tr>
		      			<tr>
		      				<th scope="col" id="detaillist" class="table-light">주소 : </th>
		      				<td><input type="text" name="uAddress" size="30" value="${content_view.uAddress }" ></td>
		      			</tr>
		      			<tr>
		      				<th scope="col" id="detaillist" class="table-light">계좌 : </th>
		      				<td><select name="uBank">
									<option  selected="selected">${content_view.uBank }</option>
									<option>국민</option>
									<option>신한</option>
									<option>농협</option>
									<option>하나</option>
									<option>기업</option>
								</select>
								<input type="text" name="uAccount" size="20" value="${content_view.uAccount }" ></td>
		      			</tr>
		      			<tr>
		      				<th scope="col" id="detaillist" class="table-light">비밀번호 : </th>
		      				<td><input type="text" name="uPw" size="30" value="${content_view.uPw }" ></td>
		      			</tr>
		      			</tbody>
		      			
		      		</table>
		      		<div align="right">
			      		<input type="submit" class="btn btn-secondary" value="나의 정보 변경하기">
		      		</div>
		      	</form>
		      	<br>
		      	<form action="mpdelete.do" method="post">
		      	<div align="right">
					<input type="hidden" name="uId" size="12" value="${content_view.uId }">
					<table>
						<tr>
							<td><input type="submit"  class="btn btn-secondary" value="탈퇴하기"></td>
						</tr>
					</table>
		      	</div>
				</form>
				
		    </div>
		</div>
 	</div>
</div>
	
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

</body>

</html>