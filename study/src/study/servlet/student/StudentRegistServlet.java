package study.servlet.student;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.student.StudentDao;
import study.beans.student.StudentDto;

@WebServlet(urlPatterns = "/student/regist.do")
public class StudentRegistServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// 입력
//		String student_name = req.getParameter("student_name");
//		int student_score = Integer.parseInt(req.getParameter("student_score"));
		try {
			StudentDto sdto = new StudentDto();
			sdto.setStudent_name(req.getParameter("student_name"));
			sdto.setStudent_score(
					Integer.parseInt(req.getParameter("student_score")));

			// 처리(DB)

			StudentDao sdao = new StudentDao();
			sdao.regist(sdto);

			// 출력
			resp.setContentType("text/plain");
			resp.setCharacterEncoding("UTF-8");
			resp.getWriter().println("학생등록이 완료되었습니다");
		} catch (Exception e) {
			// 오류가 발생한 경우: 사용자에게 오류가 났음을 알려준다 + 서버에 기록을 남긴다.
			e.printStackTrace(); // 기록을 남긴다.
			resp.sendError(500);
		}
	}
}
