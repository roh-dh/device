package home.servlet.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.dao.MemberDao;
import home.beans.dto.MemberDto;

@WebServlet(urlPatterns = "/admin/edit.do")
public class AdminEditServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//입력 : 아이디를 포함한 10개의 정보 + POST 방식이므로 유니코드 처리를 신경쓰자!
			req.setCharacterEncoding("UTF-8");
			
			MemberDto mdto = new MemberDto();
			mdto.setMember_id(req.getParameter("member_id"));
			mdto.setMember_pw(req.getParameter("member_pw"));
			mdto.setMember_nick(req.getParameter("member_nick"));
			mdto.setPost(req.getParameter("post"));
			mdto.setBase_addr(req.getParameter("base_addr"));
			mdto.setExtra_addr(req.getParameter("extra_addr"));
			mdto.setMember_birth(req.getParameter("member_birth"));
			mdto.setMember_phone(req.getParameter("member_phone"));
			mdto.setMember_intro(req.getParameter("member_intro"));
			mdto.setMember_auth(req.getParameter("member_auth"));
			
			//처리
			MemberDao mdao = new MemberDao();
			mdao.editByAdmin(mdto);
			
			//출력 : 상세정보 페이지에서는 member_id를 알아야 하므로 같이 첨부하여 redirect 처리
			resp.sendRedirect("detail.jsp?member_id=" + mdto.getMember_id());
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}










