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
<link rel="stylesheet" href="webapp/css/style.css">
<meta charset="UTF-8">

<!-- 부트스트랩 js -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
<script type="js/main.js"></script>

<title>초기버전 메인페이지</title>

</head>

<body>
	<!-- Header start -->
	<header>
		<nav class="navbar navbar-light" style="background-color: #483434;">
			<div class="container-fluid">
				<a class="navbar-brand" href="index.jsp">홈페이지 로고부분</a>
				<nav class="navbar navbar-light bg-light">
					<div class="container-fluid">
						<form class="d-flex">
							<input class="form-control me-2" type="search"
								placeholder="Search" aria-label="Search">
							<button class="btn btn-outline-success" type="submit">Search</button>
						</form>
					</div>
				</nav>
				<a class="nav-link" href="#">로그인</a> <a class="nav-link" href="#">회원가입</a>
				<a class="nav-link" href="#">장바구니</a> <a class="nav-link" href="#">마이페이지</a>
				<a class="nav-link" href="bbs.jsp">고객센터</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarScroll"
					aria-controls="navbarScroll" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
			</div>
			<div class="container-fluid" style="background-color: #6B4F4F;">
				<div class="collapse navbar-collapse" id="navbarScroll">
					<ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll"
						style="-bs-scroll-height: 50px;">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="index.jsp">Home</a></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#"
							id="navbarScrollingDropdown" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> 전체 카테고리 </a>
							<ul class="dropdown-menu"
								aria-labelledby="navbarScrollingDropdown">
								<li><a class="dropdown-item" href="#"> 학생용 의자</a></li>
								<li><hr class="dropdown-divider"></li>
								<li><a class="dropdown-item" href="#"> 사무용 의자</a></li>
								<li><hr class="dropdown-divider"></li>
								<li><a class="dropdown-item" href="#"> 인테리어 의자 </a></li>
								<li><hr class="dropdown-divider"></li>
								<li><a class="dropdown-item" href="#"> 스툴 / 좌식의자 </a></li>
							</ul></li>
					</ul>
				</div>
			</div>

		</nav>
	</header>
	<!-- Header End -->

	<!-- image slide Start -->
	<div id="carouselExampleFade" class="carousel slide carousel-fade"
		data-bs-ride="carousel">
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="img/slide1.PNG" class="d-block w-100 h-50" alt="...">
			</div>
			<div class="carousel-item">
				<img src="img/slide2.PNG" class="d-block w-100 h-50" alt="...">
			</div>
			<div class="carousel-item">
				<img src="img/slide3.PNG" class="d-block w-100 h-50" alt="...">
			</div>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleFade" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleFade" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
	</div>
	<!-- image slide End -->
	
	<!-- Bread Crumb Start -->
	<section class="breadCrumb">
		<nav aria-label="breadcrumb">
		  <ol class="breadcrumb">
		    <li class="breadcrumb-item active" aria-current="page">Home</li>
		  </ol>
		</nav>
		
		<nav aria-label="breadcrumb">
		  <ol class="breadcrumb">
		    <li class="breadcrumb-item"><a href="#">Home</a></li>
		    <li class="breadcrumb-item active" aria-current="page">Library</li>
		  </ol>
		</nav>
		
		<nav aria-label="breadcrumb">
		  <ol class="breadcrumb">
		    <li class="breadcrumb-item"><a href="#">Home</a></li>
		    <li class="breadcrumb-item"><a href="#">Library</a></li>
		    <li class="breadcrumb-item active" aria-current="page">Data</li>
		  </ol>
		</nav>
	</section>
	<!-- Bread Crumb End -->
	
	<!-- Footer start -->
	<footer>
		<div class="card text-left">
			<div class="card-body">
				<h3 class="card-title mt-3 mb-3"><a href="#">고객센터</a></h3>
				<h5 class="card-title mt-3 mb-3">상담시간: 평일 09:00~17:30 (점심시간 12:00~13:00) / 주말 & 공휴일 휴무</h5>
				<hr class="dropdown-divider">
				<p class="card-text mt-4 mb-4">
				상호명 : (주) 듀오백<br>
				대표이사 : 정관영 <br>
				개인정보보호책임자 : 김종현<br>
				주소 : 인천광역시 서구 가재울로32번길 27<br>
				사업자등록번호 : 136-81-07470 <br>
				사업자정보확인 통신판매업신고번호 : 제 2004-00018</p>
				<hr class="dropdown-divider">
				<p class="card-text mt-3 mb-3">Copyright &copy; <script>document.write(new Date().getFullYear());</script> ALL rights reserved.</p>
			</div>
			<div class="card-footer text-muted mt-2 mb-2">
				<a href="index.jsp" class="btn" >맨 위로 가기</a>
			</div>
		</div>
	</footer>
	<!-- Footer End -->

</body>

</html>