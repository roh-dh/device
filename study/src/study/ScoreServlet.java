package study;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/score")
public class ScoreServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//String을 int로 바꾸려는 변환명령: Integer.parseInt
//파라미터 중에서 kor이라는 이름을 찾고 그 값을 kor 변수에 저장!
		int kor = Integer.parseInt(req.getParameter("kor"));
		int eng = Integer.parseInt(req.getParameter("eng"));
		int math = Integer.parseInt(req.getParameter("math"));

//계산
		double avg = (double) (kor + eng + math) / 3;

//출력
		//MIME-TYPE 약속된 파일유형값
//		resp.setContentType("audio/mp3");//컨텐츠 유형 설정
//		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain; charset=UTF-8");
		resp.getWriter().println("평균 : " + avg);
		
	}
}
