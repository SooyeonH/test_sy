package com.javalec.team.homecontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.team.command.MPchange_Command;
import com.javalec.team.command.MPdelete_Command;
import com.javalec.team.command.MPinformation_Command;
import com.javalec.team.command.OrderpageCategory_Command;
import com.javalec.team.command.PCommand;
import com.javalec.team.command.ReviewWritepage_Command;


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
		
		String viewPage = null; // viewPage는 사용자가 보는 화면을 뜻함. switch를 통해 이줄밑에는 viewPage의 종류를 정의해주면됨
		PCommand command =null;
		
		String uri = request.getRequestURI(); // uri는 프로젝트 이름/~.do
		String conPath = request.getContextPath(); // conPath는 프로젝트 이름
		String com = uri.substring(conPath.length()); // com은 ~.do
		
//		System.out.println(uri); 
//		System.out.println(conPath);
//		System.out.println(com);
		
	switch(com) {
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
		
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}
}
