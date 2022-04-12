package com.javalec.team.homecontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javalec.team.command.Adduser_Command;
import com.javalec.team.command.AllCategoryPage_Command;
import com.javalec.team.command.AllCategory_Command;
import com.javalec.team.command.AllDetail_Command;
import com.javalec.team.command.Deletecart_Command;
import com.javalec.team.command.Finduserid_Command;
import com.javalec.team.command.Finduserpw_Command;
import com.javalec.team.command.IdCheck_Command;
import com.javalec.team.command.InsertCart_Command;
import com.javalec.team.command.InsertRightPayment_Command;
import com.javalec.team.command.Insertordering_Command;
import com.javalec.team.command.InteriorCategory_Command;
import com.javalec.team.command.InteriorCategoryyPage_Command;
import com.javalec.team.command.InteriorDetail_Command;
import com.javalec.team.command.Login_Command;
import com.javalec.team.command.MPchange_Command;
import com.javalec.team.command.MPdelete_Command;
import com.javalec.team.command.MPinformation_Command;
import com.javalec.team.command.OfficeCategory_Command;
import com.javalec.team.command.OfficeCategoryyPage_Command;
import com.javalec.team.command.OfficeDetail_Command;
import com.javalec.team.command.OrderpageCategory_Command;
import com.javalec.team.command.PCommand;
import com.javalec.team.command.Payment_Command;
import com.javalec.team.command.ReviewWritepage_Command;
import com.javalec.team.command.RightPayment_Command;
import com.javalec.team.command.SearchAllCategory_Command;
import com.javalec.team.command.SearchAllDetail_Command;
import com.javalec.team.command.ServiceCenter1vs1Detail_Command;
import com.javalec.team.command.ServiceCenter1vs1_Command;
import com.javalec.team.command.ServiceCenterWrite_Command;
import com.javalec.team.command.StoolCategory_Command;
import com.javalec.team.command.StoolCategoryyPage_Command;
import com.javalec.team.command.StoolDetail_Command;
import com.javalec.team.command.StudentCategory_Command;
import com.javalec.team.command.StudentCategoryyPage_Command;
import com.javalec.team.command.StudentDetail_Command;
import com.javalec.team.command.Wishlist_Command;

/**
 * Servlet implementation class homecontroller
 */
@WebServlet("*.do")
public class homecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public homecontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet"); 
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost"); 
		actionDo(request, response);
	}
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo");
		request.setCharacterEncoding("utf-8"); //한글처리를 줘야되기때문에 써줘야됨
		
		HttpSession session = request.getSession();
		
		String viewPage = null; // viewPage는 사용자가 보는 화면을 뜻함. switch를 통해 이줄밑에는 viewPage의 종류를 정의해주면됨
		PCommand command =null;
		
		String uri = request.getRequestURI(); // uri는 프로젝트 이름/~.do
		String conPath = request.getContextPath(); // conPath는 프로젝트 이름
		String com = uri.substring(conPath.length()); // com은 ~.do
		
//		System.out.println(uri); 
//		System.out.println(conPath);
//		System.out.println(com);
		switch(com) {
		//메인페이지
		case("/mainpage.do"): 
			command = new Login_Command();
			command.execute(request, response);
			viewPage = "infocheck.jsp";
			break;
		// 검색하기
		case("/searchallCategory.do"): 
			command = new SearchAllCategory_Command();
			command.execute(request, response);
			viewPage = "searchallCategory.jsp";
			break;
			
		case("/searchallDetail.do"): 
			command = new SearchAllDetail_Command();
			command.execute(request, response);
			viewPage = "searchalldetail.jsp";
			break;	
			
			//로그인(영진형) 시작   
	      case("/idcheck.do"): 
	         viewPage = "idcheck.jsp";
	         break;
	         
	      case("/idcheckuser.do"): 
	         command = new IdCheck_Command();
	         command.execute(request, response);
	         viewPage = "adduser.jsp";
	         break;
	         
	      case("/adduser.do"): 
	         viewPage = "adduser.jsp";
	         break;
	      
	      case("/addfinish.do"): 
	         command = new Adduser_Command();
	         command.execute(request, response);
	         viewPage = "beforelogin.jsp";
	         break;
	      
	      case("/finduser.do"): 
	         viewPage = "finduser.jsp";
	         break;
	         
	      case("/finduserid.do"): 
	         command = new Finduserid_Command();
	         command.execute(request, response);
	         viewPage = "findidcheck.jsp";
	         break;
	         
	      case("/finduserpw.do"): 
	         command = new Finduserpw_Command();
	         command.execute(request, response);
	         viewPage = "findpwcheck.jsp";
	         break;
	      
	      //로그인(영진형) 끝
			
		//고객센터 시작(승민)
		case("/serviceCenter.do"): //전체 내용 보여주기
			viewPage = "serviceCenter.jsp";
			break;
		
		case("/serviceCenter1vs1.do"): //1:1 문의로 가기
			command = new ServiceCenter1vs1_Command();
			command.execute(request, response);
			viewPage = "serviceCenter1vs1.jsp";
			break;
			
		case("/serviceCenter1vs1Detail.do")://문의 내용 보러가는 상세화면가기
			command = new ServiceCenter1vs1Detail_Command();
			command.execute(request, response);
			viewPage = "serviceCenter1vs1Detail.jsp";
			break;
			
		case("/serviceCenterWrite.do"): //글작성하러 가기
			viewPage = "serviceCenterWrite.jsp";
			break;
			
		case("/serviceCenterWriteFinish.do")://Write.jsp에서 폼으로 보내기
			command = new ServiceCenterWrite_Command();
			command.execute(request, response);
			viewPage = "serviceCenter1vs1.do";
			break;
		//고객센터 끝
			
		//마이페이지(수연누나) 시작	
		case ("/mpInformation.do"): //나의정보 보여주기
			command = new MPinformation_Command(); 
			command.execute(request, response);
			viewPage ="mypageInformation.jsp";
			break;
			
		case("/mpchange.do"): //내정보 수정
			command = new MPchange_Command();
			command.execute(request, response);
			viewPage="mpInformation.do";
			break;
			
		case("/mpdelete.do"): //탈퇴
			command = new MPdelete_Command();
			command.execute(request, response);
			viewPage = "mainpage.jsp"; //do로 해서 다시 케이스1에 들어가도록!! jsp 아님!!!!!
			break;
			
		case ("/orderpageCategory.do"): //나의주문정보
			command = new OrderpageCategory_Command(); 
			command.execute(request, response);
			viewPage ="orderpageCategory.jsp";
			break;
		
		case ("/reviewWritepage.do"): //리뷰쓰는페이지 이동
			viewPage="reviewWritepage.jsp";
			break;
	
		case("/reviewWrite.do")://리뷰디비에 저장
			command = new ReviewWritepage_Command();
			command.execute(request, response);
			viewPage = "mainpage.jsp"; //do로 해서 다시 케이스1에 들어가도록!! jsp 아님!!!!!
			break;
		//마이페이지(수연누나) 끝
		
		//제품(가슬)시작
			// allcategory - gaseul
			
		case("/allCategory.do"): 
			command = new AllCategory_Command();
			command.execute(request, response);
			viewPage = "allCategory.jsp";
			break;
		
		case("/allCategoryPage.do"): //pagination
			command = new AllCategoryPage_Command();
			command.execute(request, response);
			viewPage = "allCategory.jsp";
			break;
			
			
			case("/interiorCategory.do"): 
			command = new InteriorCategory_Command();
			command.execute(request, response);
			viewPage = "interiorCategory.jsp";
			break;
			
		case("/interiorCategoryPage.do"): //pagination
			command = new InteriorCategoryyPage_Command();
			command.execute(request, response);
			viewPage = "interiorCategory.jsp";
			break;
		
		
			
		case("/officeCategory.do"): 
			command = new OfficeCategory_Command();
			command.execute(request, response);
			viewPage = "officeCategory.jsp";
			break;
			
		case("/officeCategoryPage.do"): //pagination
			command = new OfficeCategoryyPage_Command();
			command.execute(request, response);
			viewPage = "officeCategory.jsp";
			break;
				
		
			
		case("/stoolCategory.do"): 
			command = new StoolCategory_Command();
			command.execute(request, response);
			viewPage = "stoolCategory.jsp";
			break;
			
		case("/stoolCategoryPage.do"): //pagination
			command = new StoolCategoryyPage_Command();
			command.execute(request, response);
			viewPage = "stoolCategory.jsp";
			break;
		
			
			
		case("/studentCategory.do"): 
			command = new StudentCategory_Command();
			command.execute(request, response);
			viewPage = "studentCategory.jsp";
			break;
			
		case("/studentCategoryPage.do"): //pagination
			command = new StudentCategoryyPage_Command();
		command.execute(request, response);
		viewPage = "studentCategory.jsp";
		break;
			//category.do - end
					
					//DetailPage.do
					
				case("/allDetail.do"): 
					command = new AllDetail_Command();
					command.execute(request, response);
					viewPage = "alldetail.jsp";
					break;
					
				case("/studentDetail.do"): 
					command = new StudentDetail_Command();
					command.execute(request, response);
					viewPage = "studentDetail.jsp";
					break;
					
					
				case("/officeDetail.do"): 
					command = new OfficeDetail_Command();
					command.execute(request, response);
					viewPage = "officeDetail.jsp";
					break;
					
				case("/interiorDetail.do"): 
					command = new InteriorDetail_Command();
					command.execute(request, response);
					viewPage = "interiorDetail.jsp";
					break;
					
				case("/stoolDetail.do"): 
					command = new StoolDetail_Command();
					command.execute(request, response);
					viewPage = "stoolDetail.jsp";
					break;
					//DetailPage.do - end
				case("/cartin.do"): 
					command = new InsertCart_Command();
					command.execute(request, response);
					viewPage = "wishlist.do";
					break;
					//detail page -> rightPayment
	            case("/rightPayment.do")://寃곗젣 뿉 꽌 臾쇳뭹  닔 젙 븯湲 
	               command = new RightPayment_Command();
	               command.execute(request, response);
	               viewPage = "rightPayment.jsp";
	               break;
		//제품(가슬)끝
		
		//장바구니(은애누나) 시작
				case("/wishlist.do")://전체 내용 보여주기
					command = new Wishlist_Command();
					command.execute(request, response);
					viewPage = "wishlist.jsp";
					break;									
				
				case("/delete.do")://장바구니삭제
				command = new Deletecart_Command();
				command.execute(request, response);
					viewPage = "wishlist.do";
					break;
				case("/payment.do")://결제화면으로 넘어가기
					command = new Payment_Command();
					command.execute(request, response);
					viewPage = "payment.jsp";
					break;
				case("/insertordering.do")://결제테이블저장동시에 결제창
					command = new Insertordering_Command();
					command.execute(request, response);
					viewPage = "paymentmethod.jsp";
					break;
				case("/rightpaymentmethod.do")://바로결제하기
					command = new InsertRightPayment_Command();
					command.execute(request, response);
					viewPage = "paymentmethod.jsp";
					break;
				//장바구니(은애누나) 끝
					
				
				case("/naver_login.do"):
					viewPage = "naver_login.jsp";
					break;
				case("/savelogin.do"):
					viewPage = "mainpage.do";
					break;
		
		} // switch(com)

		

		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}
}
