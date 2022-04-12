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
<style>
.listnumber{
padding : 50px 0 50px 0;
}
.BreadCrumb {
padding : 30px 0 0 40px;
font-size: 1.2rem;
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
			    <li class="breadcrumb-item"><a href="serviceCenter.jsp">고객센터</a></li>
			    <li class="breadcrumb-item active" aria-current="page">공지사항</li>
			  </ol>
			</nav>
		</section>
	</div>
	<!-- Bread Crumb End -->
	
	<!-- 여기부터 넣으시면 됩니다 Start -->
	<div align="center">
		<h1>고객센터</h1><br><br>
		<h3>공지사항</h3>
		<div class="row" style="margin-top: 5rem; margin-bottom:5rem;">
			<div class="d-grid gap-5 d-md-flex justify-content-md-center">
				<a href="serviceCenter.do" style="text-decoration : none;"><button class="btn btn-secondary btn-lg" type="button">공지사항</button></a>
				<a href="serviceCenter1vs1.do" style="text-decoration : none;"><button class="btn btn-secondary btn-lg" type="button">1:1 문의/확인</button></a>
			</div>
		</div>
	</div>

		<!-- table Start -->
		<section class ="bbs">
		<div class ="container">
			<div class="row">
			<table class="table table-hover table-striped">
				  <thead>
				    <tr>
				      <th scope="col">번호</th>
				      <th scope="col">문의 구분</th>
				      <th scope="col">제목</th>
				    </tr>
				  </thead>
				  <tbody>
				    <tr>
				      <td colspan="3">
					      <div class="accordion-item">
						    <h2 class="accordion-header" id="flush-headingOne">
						      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseOne" aria-expanded="false" aria-controls="flush-collapseOne">
						        1 | 취소/교환/환불 | 취소나 반품으로 인한 결제취소는 어떻게 되나요? 
						      </button>
						    </h2>
							    <div id="flush-collapseOne" class="accordion-collapse collapse" aria-labelledby="flush-headingOne" data-bs-parent="#accordionFlushExample">
							      <div class="accordion-body">
							      	신용카드 : 배송 전 취소나 반품으로 인한 주문취소 시 카드 매출 취소는 즉시 접수되지만, 카드사 매입 취소까지 보통 3~7일 정도 소요될 수 있습니다.<br>
									각 카드사마다 취소 처리 기간이 다르기 때문에 카드사를 통하여 확인할 수 있습니다.<br>
									만약 대금이 결제되었다 하더라도 해당 금액만큼 해당 카드사에서 다음 달 청구 결제 대금에서 제외됩니다.<br>
									무통장입금 / 실시간 계좌이체 : 취소 환불 요청 후 요청하신 계좌로 입금됩니다.<br>
									(4시 이전 접수건은 당일, 4시 이후 접수건은 익일 입금 예정)
							      </div>
							    </div>
	  						</div>
  						</td>
				    </tr>
				    <tr>
				      <td colspan="3">
					      <div class="accordion-item">
						    <h2 class="accordion-header" id="flush-headingTwo">
						      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseTwo" aria-expanded="false" aria-controls="flush-collapseTwo">
						        2 | 취소/교환/환불 | 받은 상품의 교환, 반품이 가능한가요?
						      </button>
						    </h2>
							    <div id="flush-collapseTwo" class="accordion-collapse collapse" aria-labelledby="flush-headingTwo" data-bs-parent="#accordionFlushExample">
							      <div class="accordion-body">
							      	상품을 수령하신 후 7일 이내에 교환, 반품이 가능합니다.<br>
									제품에 하자가 있을 경우, 교환, 반품 배송비는 두닷이 부담합니다.<br>
									고객님의 변심에 의한 교환, 반품일 경우, 교환 시 추가되는 배송비 또는 반품 배송비는 고객 부담입니다.<br>
									그러나 상품을 개봉했거나 설치한 후에는 상품의 재판매가 불가능하므로 고객 변심에 의한 교환, 반품이 불가능합니다.
							      </div>
							    </div>
	  						</div>
  						</td>
				    </tr>
				    <tr>
				      <td colspan="3">
					      <div class="accordion-item">
						    <h2 class="accordion-header" id="flush-headingThree">
						      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseThree" aria-expanded="false" aria-controls="flush-collapseThree">
						        3 | 취소/교환/환불 | 주문취소는 어떻게 하나요?
						      </button>
						    </h2>
							    <div id="flush-collapseThree" class="accordion-collapse collapse" aria-labelledby="flush-headingThree" data-bs-parent="#accordionFlushExample">
							      <div class="accordion-body">
							      	먼저 주문하신 상품의 배송 정보를 확인 부탁드립니다.<br>
									상품 발송 전인 경우,[1:1 문의 게시판 - 주문 문의]로 접수해주시면, 취소 처리해 드리겠습니다.<br>
									상품이 발송된 경우 주문취소는 바로 어렵습니다,<br>
									상품을 수령하신 후 반품 처리하여야 하며, 반품비용이 발생됩니다.<br>
									단, 주문 제작 상품일 경우 제작 중 취소는 불가능합니다.
							      </div>
							    </div>
	  						</div>
  						</td>
				    </tr>
				   
				  </tbody>
			</table>
				
				<div class="listnumber" >
					<nav aria-label="Page navigation example">
					  <ul class="pagination justify-content-center">
					    <li class="page-item">
					      <a class="page-link" href="#" aria-label="Previous">
					        <span aria-hidden="true">&laquo;</span>
					      </a>
					    </li>
					    <li class="page-item active"><a class="page-link" href="#">1</a></li>
					    <li class="page-item"><a class="page-link" href="#">2</a></li>
					    <li class="page-item"><a class="page-link" href="#">3</a></li>
					    <li class="page-item"><a class="page-link" href="#">4</a></li>
					    <li class="page-item"><a class="page-link" href="#">5</a></li>
					    <li class="page-item">
					      <a class="page-link" href="#" aria-label="Next">
					        <span aria-hidden="true">&raquo;</span>
					      </a>
					    </li>
					  </ul>
					</nav>
				</div>
			</div>
		</div>
	</section>
	<!--  table End -->
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