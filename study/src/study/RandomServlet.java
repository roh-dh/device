package study;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/random")
public class RandomServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//입력
		Random r = new Random();
		int dice = r.nextInt(6) + 1;
		
		//처리
		//출력
		
		//들어오는 데이터의 유니코드를 EUC-KR로 처리하겠다.
		//req.setCharacterEncoding("EUC-KR");
		
		//내보낼 내용의 유니코드를 EUC-KR로 처리하겠다
		//resp.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("EUC-KR");
		resp.getWriter().println("주사위 : " + dice);
		
	}
}



