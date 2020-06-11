package home.servlet.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.dao.MemberDao;
import home.beans.dto.MemberDto;

@WebServlet(urlPatterns = "/member/find_id.do")
public class MemberFindIdServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//입력 : member_nick , member_phone , member_birth  -----> MemberDto
			req.setCharacterEncoding("UTF-8");
			MemberDto mdto = new MemberDto();
			mdto.setMember_nick(req.getParameter("member_nick"));
			mdto.setMember_phone(req.getParameter("member_phone"));
			mdto.setMember_birth(req.getParameter("member_birth"));
			
			//처리
			MemberDao mdao = new MemberDao();
			String member_id = mdao.findId(mdto);
			
			//출력
			if(member_id != null) {//결과가 있으면(정보가 맞다면)
//				resp.sendRedirect("find_id_result.jsp?member_id="+member_id);
				
				req.getSession().setAttribute("member_id", member_id);
				resp.sendRedirect("find_id_result.jsp");
			}
			else {//결과가 없으면(정보가 맞지 않으면)
				resp.sendRedirect("find_id.jsp?error");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
