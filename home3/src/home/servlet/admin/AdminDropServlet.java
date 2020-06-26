package home.servlet.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.dao.MemberDao;

@WebServlet(urlPatterns = "/admin/drop.do")
public class AdminDropServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//입력 : 지울 대상의 기본키(member_id , 파라미터)
			String member_id = req.getParameter("member_id");
			
			//처리 : 삭제 처리
			MemberDao mdao = new MemberDao();
			mdao.exit(member_id);//회원탈퇴와 동일한 기능 사용
			
			//출력 : 회원 목록(list.jsp)
			resp.sendRedirect("list.jsp");
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}








