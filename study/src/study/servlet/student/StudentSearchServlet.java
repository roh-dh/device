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

@WebServlet(urlPatterns = "/student/serach.do")
public class StudentSearchServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try {
		//[1] 입력:파라미터에서 student_name을 추출
		String student_name=req.getParameter("student_name");
		
		//[2] 처리:
		StudentDao sdao = new StudentDao();
		List<StudentDto> list = sdao.search(student_name);
		
		//[3] 출력:
		resp.setContentType("text/plain; charSet = UTF-8");
		for(StudentDto sdto : list) {
		resp.getWriter().println("이름 : "+sdto.getStudent_name());
		}
		
		
	} catch(Exception e){
		e.printStackTrace();
		resp.sendError(500);
	}
	
	}
}
