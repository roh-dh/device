package study.servlet.client;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.client.ClientDao;
import study.beans.client.ClientDto;

@WebServlet(urlPatterns = "/client/regist.do")
public class ClientRegistServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			ClientDto cdto = new ClientDto();
			cdto.setClient_id(req.getParameter("client_id"));
			cdto.setClient_pw(req.getParameter("client_pw"));
//		처리(DB)
		ClientDao cdao = new ClientDao();
		cdao.regist(cdto);
			
//		출력
		resp.setContentType("text/plain; charset=UTF-8");
		
//		resp.setContentType("text/plain");
//		resp.setCharacterEncoding("UTF-8");
		
		resp.getWriter().println("회원가입이 완료되었습니다.");
		} catch (Exception e) {
			// 오류가 발생한 경우: 사용자에게 오류가 났음을 알려준다 + 서버에 기록을 남긴다.
			e.printStackTrace(); // 기록을 남긴다.
			resp.sendError(500);
		}

	}
}
