package study.servlet.student;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.student.StudentDao;
import study.beans.student.StudentDto;

@WebServlet(urlPatterns = "/student/search.do")
public class StudentSearchServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//해야할 일
			//[1] 입력 : 파라미터에서 student_name을 추출
			String student_name = req.getParameter("student_name");
			
			//[2] 처리 : 
			StudentDao sdao = new StudentDao();
			List<StudentDto> list = sdao.search(student_name);
			
			//[3] 출력 : 
			resp.setCharacterEncoding("UTF-8");
			resp.setContentType("text/plain");
			
			for(StudentDto sdto : list) {
				resp.getWriter().print("이름 : "+sdto.getStudent_name());
				resp.getWriter().print(",");
				resp.getWriter().print("점수 : "+sdto.getStudent_score());
				resp.getWriter().println();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}







