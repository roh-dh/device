package study;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/plus.kh")
public class PlusServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	목표 : 숫자 두 개를 입력받아서 합계를 출력

//	준비
//	int a = 사용자가 보낸 a의 값(파라미터);
//	int b = 사용자가 보낸 b의 값(parameter);
		
//	요청 정보에서 파라미터를 읽어올 수 있다.
//	(주의) 파라미터는 읽어오면 무조건 String 형태이다.
//	주소에서 ? 뒷부분에 있는 a= xxx 부분을 읽어와서 숫자로 바꿔 저장!
	int a = Integer.parseInt(req.getParameter("a"));
	
//	주소에서 ? 뒷부분에 있는 b=xxx 부분을 읽어와서 숫자로 바꿔 저장!
	int b = Integer.parseInt(req.getParameter("b"));
	

//	계산
	int c = a+b;
	
//	출력
	resp.setCharacterEncoding("EUC-KR");
	resp.getWriter().println("합계 : "+c);
	
	}
}
