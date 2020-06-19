package home.servlet.reply;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.dao.BoardDao;
import home.beans.dao.ReplyDao;
import home.beans.dto.MemberDto;
import home.beans.dto.ReplyDto;

@WebServlet(urlPatterns = "/board/reply_insert.do")
public class ReplyInsertServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			입력 : reply_writer(세션) , reply_content(파라미터) , reply_origin(파라미터)
			MemberDto mdto = (MemberDto) req.getSession().getAttribute("userinfo");
			
			ReplyDto rdto = new ReplyDto();
			rdto.setReply_writer(mdto.getMember_id());
			rdto.setReply_content(req.getParameter("reply_content"));
			rdto.setReply_origin(Integer.parseInt(req.getParameter("reply_origin")));
			
//			처리 : 
			ReplyDao rdao = new ReplyDao();
			rdao.write(rdto);
			
//			댓글이 등록되었다면 개수를 다시 세도록 지시
			BoardDao bdao = new BoardDao();
			bdao.editReplycount(rdto.getReply_origin());
			
//			출력 : 
			resp.sendRedirect("content.jsp?board_no="+rdto.getReply_origin());
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}