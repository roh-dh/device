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

		resp.setCharacterEncoding("EUC-KR");
		if (thisYear - bornYear +1 > 65 || thisYear - bornYear +1 < 8) {
			resp.getWriter().println("무료");
		} else if (thisYear - bornYear +1 > 20) {
			resp.getWriter().println(1250 + "원");
		} else if (thisYear - bornYear +1 > 14) {
			resp.getWriter().println(720 + "원");
		} else {
			resp.getWriter().println(450 + "원");
		}
	}

}
