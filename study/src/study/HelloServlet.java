package study;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//자바 파일을 이용해서 웹서비스 구현
// -> 이 파일의 실행 결과가 브라우저에 출력되도록 구현
// -> 내가 직접 만드는 것이 아니라 "상속"으로 구현
// -> 이 파일에 연결될 "주소" 를 설정
@WebServlet(urlPatterns = "/hello.do")
public class HelloServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//resp를 이용해서 사용자 화면에 출력
		resp.getWriter().println("hello");
	}
}





