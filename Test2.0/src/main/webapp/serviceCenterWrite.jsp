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
	
	<!-- 여기부터 넣으시면 됩니다 Start -->
		<!-- Bread Crumb Start -->
	<section class="breadCrumb">
		<nav aria-label="breadcrumb">
		  <ol class="breadcrumb">
		    <li class="breadcrumb-item"><a href="#">Home</a></li>
		    <li class="breadcrumb-item"><a href="serviceCenter.do" style="text-decoration : none;">고객센터</a></li>
		    <li class="breadcrumb-item"><a href="serviceCenter1vs1.do" style="text-decoration : none;">1대1 문의/확인</a></li>
		    <li class="breadcrumb-item active" aria-current="page">글작성</li>
		  </ol>
		</nav>
	</section>
	<!-- Bread Crumb End -->
	
	<div align="center">
		<h1>고객센터</h1><br><br>
		<h3>1:1 문의 글작성</h3>
		<div class="row" style="margin-top: 5rem; margin-bottom:5rem;">
			<div class="d-grid gap-5 d-md-flex justify-content-md-center">
				<a href="serviceCenter.do" style="text-decoration : none;"><button class="btn btn-secondary btn-lg" type="button">공지사항</button></a>
				<a href="serviceCenter1vs1.do" style="text-decoration : none;"><button class="btn btn-secondary btn-lg" type="button">1:1 문의/확인</button></a>
			</div>
		</div>
	</div>
	
	<!-- table Start -->
		<div class ="container mb-5">
			<div class="row justify-content-md-center">
				<div class="col col-lg-7 ">
					<div class="accordion-item">
						<h2 class="accordion-header" id="flush-headingOne">
							<button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseOne" aria-expanded="false" aria-controls="flush-collapseOne">
								        <span>개인정보 수집·이용에 관한 사항</span><span>보기</span>
							</button>
						</h2>
						<div id="flush-collapseOne" class="accordion-collapse collapse" aria-labelledby="flush-headingOne" data-bs-parent="#accordionFlushExample">
							<div class="accordion-body">
							<p>[1:1문의 정보수집 동의]</p>
								1:1문의를 위해 다음의 개인정보 수집 이용에 동의 후 원활한 서비스 이용이 가능 합니다.
							<p>1. 개인정보 수집 항목</p>
								성명, 전화번호, 휴대폰번호, 이메일주소
							<p>2. 개인정보 수집 목적</p>
								고객문의, 접수, 처리결과 안내
							<p>3. 개인정보 보유 이용 기간</p>
								원칙적으로, 개인정보 수집 및 이용목적이 달성된 후에는 해당 정보를 지체 없이 파기합니다.
								단, 관계법령의 규정에 의하여 보존할 필요가 있는 경우 아래와 같이 관계법령에서 정한 일정
								기간 동안 개인정보를 보관할 수 있습니다.
							</div>
						</div>
						<div align="right">
							<input id="agree1" type="checkbox" value="" name="#">
						</div>
			  		</div>
				</div>
			</div>
		</div>
<form action="serviceCenterWriteFinish.do" method="get">
	<div class="container mb-6">
		<div class="row justify-content-md-center">
		    <div class="col col-lg-6 ">
		      	<div>
		      		<table>
		      			<tr>
		      				<td>문의구분 : </td>
		      				<td>
		      					<select name="iCode" id="email03" onchange="javascript:changed();" style='min-height:24px;'>
									<option value="상품문의">상품문의</option>
									<option value="배송문의">배송문의</option>
									<option value="주문문의">주문문의</option>
									<option value="A/S문의">A/S문의</option>
									<option value="기타문의">기타문의</option>
								</select>
		      				</td>
		      			</tr>
		      			<tr>
		      				<td>작성자 : </td>
		      				<td>
		      				<input type="text" name="user_uId" value="" size="62">
		      				</td>
		      			</tr>	
		      			<tr>
		      				<td>이메일 : </td>
		      				<td>
		      					<input type="text" name="user_uEmail" size="62" value="" />
							</td>
		      			</tr>
		      			<tr>
		      				<td>문의제목 : </td>
		      				<td><input name="iTitle" type="text" style="width:500px;"></td>
		      			</tr>
		      			<tr>
		      				<td>문의내용 : </td>
		      				<td><textarea name="iContent" id="content" title="내용" style="width:500px; height:300px;"></textarea></td>
		      			</tr>
		      		</table>
				</div>
		    </div>
		    
		    <div class="col col-lg-1">
			    <div class="d-flex" style="height: 600px;">
	 				 <div class="vr"></div>
				</div>
		    </div>
		    <div class="col col-lg-3">
		      <div>
					<p class="text01">고객 여러분께 알려드립니다.</p>
					<p>
						콜센터로의 전화문의는 문의가 집중되는 오전 10시~오후 2시 시간대를 가급적 피해주시고, 번거로우시더라도 [1:1문의]를 활용해 주시면 고객님의 요청사항을 보다 정확하게 확인하여 신속하게 해결해 드리도록 하겠습니다.<br><br>
						* 상품에 문제가 있을시 사진과 함께 남겨주시면 보다 빠른확인이 가능합니다. 
					</p>
					<p class="text01">1:1문의 운영일/시간</p>
					<p>평일: 오전 10시~12시/오후 1시~6시 | 토, 일요일, 공휴일 휴무</p>
					<p class="text02">
						개인정보보호법 제21조에 따라 비회원 또는 타 쇼핑몰 주문 건에 대한 고객 정보는 주문 완료 시 파기됩니다.<br>
						AS/반품 등 상품 수령 후 문의에 대해서 주문 검색에 다소 제약이 있으니 이점 양해 바랍니다.
					</p>
				</div>
		    </div>
		</div>
		<div>
			<div class="row justify-content-md-center mt-5">
			   <div class="col col-lg-2">
			      <input class="btn btn-dark btn-lg" type="submit" value="문의하다">
			   </div>
			</div>
		</div>
 	</div>
</form>		
	<!-- table End -->
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