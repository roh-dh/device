package db.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test03 {
	public static void main(String[] args) throws Exception{
		String name = "공유";
		int score = 57;
		
//		PreparedStatement의 방식을 이용하여 오류 없이 데이터를 추가하여 명령 실행
		Class.forName("oracle.jdbc.OracleDriver");//드라이버 설치
		
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "oracle");//로그인
		
//		명령을 준비할 때, 채워야 할 부분을 ?로 처리하여 작성
		String sql = "insert into student values(student_seq.nextval, ?, ?, sysdate)";
		
//		전송 객체를 준비
		PreparedStatement ps = con.prepareStatement(sql);
		
//		전송하기 전에 ?로 설정해둔 자리에 맞는 값을 채워주도록 코드 작성
		ps.setString(1, name);//ps가 가지고 있는 명령의 1번째 물음표에 name을 문자열 형태로 채워라!
		ps.setInt(2, score);//ps가 가지고 있는 명령의 2번째 물음표에 score를 숫자 형태로 채워라!
		
//		전송
		ps.execute();
		
		con.close();//로그아웃
		
		System.out.println("성공!");
	}
}
