package study;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/score")
public class ScoreServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		파라미터로 kor, eng, math 를 전달받아 평균 계산 후 출력
		
//		입력
//		파라미터 중에서 kor이라는 이름을 찾고 그 값을 kor 변수에 저장!
		int kor = Integer.parseInt(req.getParameter("kor"));
		int eng = Integer.parseInt(req.getParameter("eng"));
		int math = Integer.parseInt(req.getParameter("math"));
		
//		처리
		int total = kor + eng + math;
		double average = total / 3.0;
		
//		출력
//		resp.setContentType("text/plain");//컨텐츠 유형 설정
//		resp.setCharacterEncoding("UTF-8");//인코딩 설정
		resp.setContentType("text/plain; charset=UTF-8");//한번에
		resp.getWriter().println("평균 : " + average);
	}
}





