package study.servlet.client;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.ClientDao;
import study.beans.ClientDto;

@WebServlet(urlPatterns = "/client/login.do")
public class ClientLoginServlet_boolean extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String client_id = req.getParameter("client_id");
			String client_pw = req.getParameter("client_pw");
			
			ClientDao cdao = new ClientDao();
			Boolean result = cdao.login(client_id,client_pw);
			
			resp.setContentType("text/plain; charset=UTF-8");
			
			if(result) {
				resp.getWriter().println("로그인 성공");
			} else {
				resp.getWriter().println("정보가 일치하지 않습니다.");
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	
	
	}

}
