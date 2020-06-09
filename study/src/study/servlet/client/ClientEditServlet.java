package study.servlet.client;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.client.ClientDao;
import study.beans.client.ClientDto;

@WebServlet(urlPatterns = "/client/edit.do")
public class ClientEditServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			입력: 아이디(client_id), 기존비밀번호(client_pw), 신규비밀번호(new_pw)
			ClientDto cdto = new ClientDto();
			cdto.setClient_id(req.getParameter("client_id"));
			cdto.setClient_pw(req.getParameter("client_pw"));
			
			ClientDao cdao = new ClientDao();
			ClientDto newDto = cdao.login2(cdto);
			if(newDto != null) {
				cdto.setClient_pw(req.getParameter("new_pw")); //교체
				cdao.edit(cdto); //비밀번호 변경 /// 위의 코드로 수정이 당연히 되기때문에 반환데이터를 받을필요X
			}
			
			//출력
			resp.setContentType("text/plain; charset=UTF-8");
			
			
			if(newDto != null) {
				resp.getWriter().println("정보 수정이 완료되었습니다.");
			} else {
				resp.getWriter().println("로그인 정보가 맞지 않습니다");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
