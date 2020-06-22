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

@WebServlet(urlPatterns = "/client/list.do")
public class ClientListServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			입력 없음
//			처리는 ClientDao가 수행
			ClientDao cdao = new ClientDao();
			List<ClientDto> list = cdao.getList();
			
//			출력만 여기서 진행
			resp.setContentType("text/plain; charset=UTF-8");
			
			resp.getWriter().println("총 "+list.size()+"명의 회원이 있습니다");
			
//			cdto에 list의 모든 데이터를 집어넣어라(한번에 한개씩..전체 반복)
			for(ClientDto cdto : list) {
				resp.getWriter().print(cdto.getClient_id());
				resp.getWriter().print("/");
				resp.getWriter().print(cdto.getClient_auth());
				resp.getWriter().println();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}





