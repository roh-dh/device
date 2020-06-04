package study.servlet.client;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.ClientDao;
import study.beans.ClientDto;

@WebServlet(urlPatterns = "/client/login.do.it")
public class ClientLoginServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
try {
//	입력
	ClientDto cdto = new ClientDto(); //2개 들어있는 데이터
	cdto.setClient_id(req.getParameter("client_id"));
	cdto.setClient_pw(req.getParameter("client_pw"));
	
//	처리
	ClientDao cdao = new ClientDao();
	ClientDto newDto = cdao.login2(cdto);
	
//	출력
	resp.setContentType("text/plain; charset=UTF-8");
	if(newDto !=null) {//로그인 성공이라면
		resp.getWriter().println("로그인 성공");
		resp.getWriter().println("<회원정보>");
		resp.getWriter().println("ID "+newDto.getClient_id());
		resp.getWriter().println("권한 "+newDto.getClient_auth());
		resp.getWriter().println("포인트 "+newDto.getClient_point());
		resp.getWriter().println("가입일 "+newDto.getClient_join());
	}
	else {
		resp.getWriter().println("로그인 실패");
	}
	
	
} catch(Exception e) {
	e.printStackTrace();
	resp.sendError(500);
}
		
		
	}
}
