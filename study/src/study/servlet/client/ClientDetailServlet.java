package study.servlet.client;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.ClientDao;
import study.beans.ClientDto;

@WebServlet(urlPatterns = "/client/detail.do")
public class ClientDetailServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
try {
	int Client_no = Integer.parseInt(req.getParameter("client_no"));
	
	ClientDao cdao = new ClientDao();
//	상세정보의 단일정보
	ClientDto cdto = cdao.get(Client_no);
//	정보목록
//	List<ClientDto cdto>
	
	resp.setContentType("text/plain; charset =UTF-8");
	if(cdto == null) {
		resp.getWriter().println("없는데요..");
	} else {
		
	resp.getWriter().println("상세정보");
	
	resp.getWriter().println(cdto.getClient_id());
	resp.getWriter().println(cdto.getClient_no());
	
//	resp.getWriter().println(cdto.getClient_id());
//	resp.getWriter().println(cdto.getClient_auth());
//	resp.getWriter().println(cdto.getClient_point());
	}
	
} catch(Exception e) {
	e.printStackTrace();
	resp.sendError(500);
}
	}

}
