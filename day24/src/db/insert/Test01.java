package db.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test01 {
	public static void main(String[] args) throws Exception{
//		목표 : study에 테이블을 만들고 해당하는 테이블에 데이터를 추가하는 것
//		- 테이블은 어디서 만들어야 하는가? 자바 아니면 DB에서? DB에서!
//		- 데이터는 어떻게 추가하는가?
		
//		진행 순서
//		[1] 드라이버 실행  -> [2] 연결 -> [3] 명령 준비 및 실행 -> [4] 종료 -> [5] 성공 메시지 출력
		
		Class.forName("oracle.jdbc.OracleDriver");//[1]
		
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "oracle");//[2]
		
//		[3] DBeaver 에서 작업하듯이 명령을 준비해서 전송하면 된다
//		INSERT INTO student values(student_seq.nextval, '홍길동', 50, sysdate);
		
//		주의 : 명령 마지막에 ;을 작성하면 오류가 발생한다.
		String sql = "INSERT INTO student values(student_seq.nextval, '홍길동', 50, sysdate)";
		
//		전송 객체 생성(연결이 되어 있을때만 사용이 가능하므로 연결 정보에서 획득한다)
		PreparedStatement ps = con.prepareStatement(sql);
		
//		전송(실행)
		ps.execute();
		
		con.close();//[4]
		
		System.out.println("성공!");//[5]
	}
}

