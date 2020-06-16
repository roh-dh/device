package home.servlet.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.dao.MemberDao;
import home.beans.dto.MemberDto;

@WebServlet(urlPatterns = "/member/change_password.do")
public class MemberChangePasswordServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//입력 : 필요한 데이터는 2개(member_id, member_pw)
			// - 세션에서 추출 : member_id
			// - 사용자 입력 : member_pw

			//member_id 를 세션에서 추출
			// - session에서 추출한 데이터는 Object 형태이므로 실제로 사용할 수 있는 형태로 다운캐스팅
			MemberDto mdto = (MemberDto)req.getSession().getAttribute("userinfo");
			String member_id = mdto.getMember_id();
			
			//member_pw를 파라미터에서 추출
			String member_pw = req.getParameter("member_pw");
			
			//처리
			MemberDto user = new MemberDto();
			user.setMember_id(member_id);
			user.setMember_pw(member_pw);
			
			//MemberDao에 회원정보(user)를 주고 비밀번호를 변경하도록 지시
			MemberDao mdao = new MemberDao();
			mdao.changePassword(user);
			
			//출력
			resp.sendRedirect("change_password_result.jsp");
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}






