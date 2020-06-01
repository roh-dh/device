package study;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/random")
public class RandomServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Random r = new Random();
		int dice = r.nextInt(6)+1;
		
//		내보낼 내용의 유니코드를 UTF-8로 처리하겠다.
		resp.setCharacterEncoding("EUC-KR");
		resp.getWriter().println("주사위 : "+ dice);

	}
}
