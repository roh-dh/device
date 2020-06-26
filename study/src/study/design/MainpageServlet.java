package study.design;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/index.do")
public class MainpageServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.setContentType("text/html");
//		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		resp.getWriter().println("<!-- HTML 주석 -->");
		/* JSP 주석 */
		resp.getWriter().println("<html>");
		resp.getWriter().println("<head>");
		resp.getWriter().println("<title>홈페이지</title>");
		resp.getWriter().println("</head>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("<h1>안녕!</h1>");
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}
}






