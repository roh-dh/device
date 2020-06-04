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

@WebServlet(urlPatterns = "/client/search.do")
public class ClientSearchServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//		파타미터에서 읽어옴 입력
			String keyword = req.getParameter("keyword");

//		처리
			ClientDao cdao = new ClientDao();
			List<ClientDto> list = cdao.search(keyword);

			// 출력
			resp.setContentType("text/plain; charset=UTF-8");
			if (!list.isEmpty()) {
				resp.getWriter().println("검색 결과는 총" + list.size() + "개 입니다");

				for (ClientDto cdto : list) {
					resp.getWriter().println("아이디 : " + cdto.getClient_id());
				}
			}
			else {
				resp.getWriter().println("검색 결과가 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}

		
		
		
		
	}
}
