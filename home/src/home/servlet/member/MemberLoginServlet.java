package home.servlet.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.dao.MemberDao;
import home.beans.dto.MemberDto;

//http://localhost:8080/home/member/login.do
@WebServlet(urlPatterns = "/member/login.do")
public class MemberLoginServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//입력 : login.jsp에서 전달되는 member_id, member_pw를 수신하여 MemberDto 형태로 저장
			req.setCharacterEncoding("UTF-8");//지금은 필요없지만 습관처럼 쓴다
			MemberDto mdto = new MemberDto();
			mdto.setMember_id(req.getParameter("member_id"));
			mdto.setMember_pw(req.getParameter("member_pw"));
			
			//처리
			MemberDao mdao = new MemberDao();
			
			MemberDto user = mdao.login(mdto); // mdto에 저장해놓은 2개 데이터를 줄테니까 MemberDto들어있는거(회원정보) 모두 내놔라
			//반환:MemberDto를 유저라는 변수명으로 반환해라 읽어오기: mdao안에서 변수명login에 mdto에 들어있는것들을 받아서 읽어온다.			
			
			//출력
			if(user == null) {//로그인 실패
				resp.sendRedirect("login.jsp?error");//사용자에게 로그인 페이지로 되돌아가도록 지시
			}
			else {//로그인 성공
//				로그인 시각을 갱신
				mdao.updateLoginTime(user.getMember_id());
				
//				로그인한 사용자 정보(user)를 "userinfo"라는 이름으로 세션에 저장
//				- 서블릿에서는 session이라는 이름의 객체가 없으므로 req에서 꺼내서 사용해야 한다
//				- JSP에서는 session이라는 이름으로 바로 접근이 가능하도록 준비되어 있다
				req.getSession().setAttribute("userinfo", user);
				
//				resp.sendRedirect("../index.jsp");//사용자에게 메인 페이지로 가도록 지시(상대경로)
				resp.sendRedirect(req.getContextPath());//메인 페이지의 절대경로 (절대경로가 안전!)
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}



