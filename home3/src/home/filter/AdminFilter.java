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

//@WebFilter(urlPatterns = "/admin/*")
public class AdminFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
//		목표 : 허가받지 않은 사용자가 관리자 기능을 이용하는 것을 차단
//		정보 : 세션에 있는 userinfo를 이용하여 검사(형태 : MemberDto)
//		계획 : 
//		1. 세션의 정보를 추출한다.
//		2. 로그인 여부를 검사한다.
//			- 로그인이 되어있지 않으면 로그인 페이지로 리다이렉트
//		3. 권한을 검사한다
//			- 관리자인 경우 통과
//			- 관리자가 아닌 경우 403 오류를 송출(권한 없음)
		
//		다운캐스팅을 통해 필요한 객체 형태로 변환
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		
//		1번
		MemberDto mdto = (MemberDto) req.getSession().getAttribute("userinfo");

//		2번 : LoginFilter에서 하는 작업이므로 삭제
//		boolean isLogin = mdto != null;
//		if(!isLogin) {
//			resp.sendRedirect(req.getContextPath()+"/member/login.jsp");
//			return;//중지(+반환)
//		}
		
//		3번 - 2번의 else에 해당하는 경우
		if(mdto.getMember_auth().equals("관리자")) {//관리자라면
			chain.doFilter(request, response);//통과
		}
		else {//관리자가 아니라면
			resp.sendError(403);//403(권한 없음) 오류를 송출
		}
	}

}





