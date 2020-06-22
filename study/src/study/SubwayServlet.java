package study;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/subway.it")
public class SubwayServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		입력
		int birth = Integer.parseInt(req.getParameter("birth"));
		
//		처리
		int year = birth / 10000;
		int age = Calendar.getInstance().get(Calendar.YEAR) - year + 1;
		
//		int fare = 0 or 450 or 720 or 1250;
		int fare;
		if(age < 8 || age >= 65) {
			fare = 0;
		}
		else if(age < 14) {
			fare = 450;
		}
		else if(age < 20) {
			fare = 720;
		}
		else {
			fare = 1250;
		}
		
//		출력
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");
		
		resp.getWriter().println(fare);
	}
}







