package home.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.dto.MemberDto;

/*@WebFilter(urlPatterns = {
		"/member/info.jsp",
		"/member/logout.do",
		"/member/change_password.jsp",
		"/member/change_password.do",
		"/member/change_password_result.jsp",
		"/member/exit.do",
		"/member/change_info.jsp",
		"/member/change_info.do",
		"/member/check.jsp",
		"/member/check.do",
//		"/admin/*"
})
*/
public class LoginFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
//	목표 : 현재 요청을 보내고 있는 상요자(누군지는 모름)가 로그인 상태인지 판정
//	정보 :
//	-로그인 정보 : session에 저장된 userinfo 정보(형태: MemberDto)
//	계획:
//	1. 세션에 있는 userinfo 정보를 꺼낸다
//	2. 해당 정보가 있는지 없는지 검사한다.
//	-있으면 : 로그인이 되어있는 사용자라고 볼 수 있다! (통과)
//		chain.doFilter(request, response);
//	-없으면 : 로그인이 되지 않은 사용자라고 볼 수 있다! (로그인 페이지로 리다이렉트)
//		-response.sendRedirect(페이지);
	
	HttpServletRequest req = (HttpServletRequest)request;
	HttpServletResponse resp = (HttpServletResponse)response;

		
//	1번 코드
	MemberDto mdto = (MemberDto)req.getSession().getAttribute("userinfo");
	
//	2번 코드
	boolean isLogin = mdto != null;
	
	if(isLogin) {
		chain.doFilter(request, response);
	}
	else{//로그아웃
//		resp.sendError(401);
		
//		리다이렉트는 사용자에게 내가 알려준 위치로 다시 들어오라고 전송하는 명령
//		-사용자에게 알려지는 주소이므로 context path를 적어야한다.
//		-필터는 반ㄷ싀 절대경로로 써야 함!
//		resp.sendRedirect("/home/member/login.jsp");
		resp.sendRedirect(req.getContextPath()+"/member/login.jsp");
	}
	
	}
}
