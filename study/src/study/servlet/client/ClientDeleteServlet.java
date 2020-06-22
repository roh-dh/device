package study.servlet.client;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.client.ClientDao;
import study.beans.client.ClientDto;

@WebServlet(urlPatterns = "/client/delete.do")
public class ClientDeleteServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//입력 : client_id, client_pw ---> ClientDto
			ClientDto cdto = new ClientDto();
			cdto.setClient_id(req.getParameter("client_id"));
			cdto.setClient_pw(req.getParameter("client_pw"));
			
			//처리 : 로그인 후 성공시에만 삭제
			ClientDao cdao = new ClientDao();
			ClientDto newDto = cdao.login(cdto);
			if(newDto != null) {
				cdao.delete(cdto.getClient_id());
			}
			
			//출력
			resp.setContentType("text/plain; charset=UTF-8");
			if(newDto != null) {
				resp.getWriter().println("그동안 이용해주셔서 감사합니다");
			}
			else {
				resp.getWriter().println("로그인 정보가 일치하지 않습니다");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
