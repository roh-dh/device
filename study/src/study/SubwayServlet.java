package study;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/subway.it")
public class SubwayServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int birth = Integer.parseInt(req.getParameter("birth"));

		int bornYear = birth / 10000;
		int thisYear = Calendar.getInstance().get(Calendar.YEAR);
		int age = thisYear-bornYear+1;
		resp.setContentType("text/plain; charset=UTF-8");
		String fare;
		if (age > 65 || age < 8) {
			fare = "무료";
		} else if (age > 20) {
			fare = 1250+"원";
		} else if (age > 14) {
			fare = 750+"원";
		} else {
			fare = 450+"원";
		}
		resp.getWriter().println(fare);
	}
	
}
