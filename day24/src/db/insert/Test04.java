package db.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test04 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Scanner를 이용해서 신규 호텔을 등록할 수 있는 프로그램을 구현
		String name = "달나라호텔";
		String region = "우주";
		double rate = 4.5;
		
//		DB insert 작업
		Class.forName("oracle.jdbc.OracleDriver");//드라이버 활성화
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");//로그인
		
//		실제 명령 전달하는 코드
		String sql = "INSERT INTO hotel values(hotel_seq.nextval, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
//		데이터 형태에 맞게 ? 에 대한 연결 설정
		ps.setString(1, name);
		ps.setString(2, region);
		ps.setDouble(3, rate);
		
		ps.execute();
		
		con.close();//로그아웃
		
//		결과 출력
		System.out.println("등록이 완료되었습니다");
	}
}
