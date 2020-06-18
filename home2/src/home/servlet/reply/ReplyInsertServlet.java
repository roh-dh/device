package home.servlet.reply;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.dao.ReplyDao;
import home.beans.dto.ReplyDto;

@WebServlet(urlPatterns = "/board/reply_insert.do")
public class ReplyInsertServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//입력
			ReplyDao rdao = new ReplyDao();
			int reply_no = rdao.reply_no();
			
			ReplyDto rdto = new ReplyDto();
			rdto.setReply_no(reply_no);
			rdto.setReply_writer(req.getParameter("reply_writer"));
			rdto.setReply_content(req.getParameter("reply_content"));
			rdto.setReply_origin(Integer.parseInt(req.getParameter("reply_origin")));
			
			
			//처리
			
			rdao.insert(rdto);  //작성자 내용 작성일시 dto에 넣을예정
			
			
			
			//출력
			
			resp.sendRedirect("/content.jsp?board_no="+ rdto.getReply_origin());
			
			
		} catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	
	
	}

}
