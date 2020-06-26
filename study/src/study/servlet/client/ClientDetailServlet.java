package study.servlet.client;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.client.ClientDao;
import study.beans.client.ClientDto;

@WebServlet(urlPatterns = "/client/detail.do")
public class ClientDetailServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//입력
			int client_no = Integer.parseInt(req.getParameter("client_no"));
			
			//처리
			ClientDao cdao = new ClientDao();
			ClientDto cdto = cdao.get(client_no);
			
			//출력
			resp.setCharacterEncoding("UTF-8");
			resp.setContentType("text/plain");
			
			if(cdto != null) {
				resp.getWriter().println(cdto.getClient_no());
				resp.getWriter().println(cdto.getClient_id());
				resp.getWriter().println(cdto.getClient_pw());
				resp.getWriter().println(cdto.getClient_auth());
				resp.getWriter().println(cdto.getClient_join());
				resp.getWriter().println(cdto.getClient_point());
			}
			else {
				//resp.getWriter().println("정보가 없습니다");
				resp.sendError(404);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}




