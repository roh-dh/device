package study.servlet.client;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.client.ClientDao;
import study.beans.client.ClientDto;

@WebServlet(urlPatterns = "/client/search.do")
public class ClientSearchServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//입력
			String keyword = req.getParameter("keyword");
			
			//처리
			ClientDao cdao = new ClientDao();
			List<ClientDto> list = cdao.search(keyword);
			
			//출력
			resp.setContentType("text/plain");
			resp.setCharacterEncoding("UTF-8");
			
//			if(list.size() > 0) {//데이터가 0개보다 많으면
			if(!list.isEmpty()) {//리스트가 비어있지 않으면
				resp.getWriter().println("검색 결과는 총 "+list.size()+"개 입니다");
				
				for(ClientDto cdto : list) {
					resp.getWriter().print("[ID] "+cdto.getClient_id());
					resp.getWriter().print(",");
					resp.getWriter().println("[Auth] "+cdto.getClient_auth());
				}
			}
			else {
				resp.getWriter().println("검색 결과가 없습니다");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}







