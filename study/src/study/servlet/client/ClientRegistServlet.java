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
public class ClientRegistServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			입력
//			String client_id = req.getParameter("client_id");
//			String client_pw = req.getParameter("client_pw");
			
			ClientDto cdto = new ClientDto();
			cdto.setClient_id(req.getParameter("client_id"));
			cdto.setClient_pw(req.getParameter("client_pw"));
			
//			처리
			ClientDao cdao = new ClientDao();
			cdao.regist(cdto);
			
//			출력
			resp.setContentType("text/plain");
			resp.setCharacterEncoding("UTF-8");
			resp.getWriter().println("회원 등록 완료");
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}






