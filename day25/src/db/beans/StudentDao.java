package db.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//DAO : Data Access Object. 데이터(DB) 접근 객체
//- DB에 연관된 기능들을 보관한 뒤 편하게 불러서 사용하도록 구성하는 클래스
//- 1개의 DAO는 1개의 테이블과 연결되도록 구성
public class StudentDao {
	
	//DB에는 반드시 연결코드가 있어야 하니까 보관해두고 불러서 쓰자!(연결 대행 메소드)
	//- 수행 내용 : 데이터베이스 연결(드라이버 로딩 + 연결코드)
	//- 반환 데이터 : 스트림 정보(Connection)
	public Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "oracle");
		return con;//연결 정보 반환
	}
	
	//카운트를 구하는 모든 DB관련 작업을 수행할 메소드
	//준비물 : X
	//이름 : getCount
	//반환형 : 카운트 값(int)
	public int getCount() throws Exception {
		Connection con = this.getConnection();
		
		String sql = "select count(*) cnt from student";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		rs.next();
		int count = rs.getInt("cnt");
		
		con.close();
		
		return count;
	}		//test10 연동
	
	//등록 메소드
	//준비물 : 이름, 점수
	//이름 : regist
	//반환형 : X(void)
	public void regist(String student_name, int student_score) throws Exception {
		Connection con = this.getConnection();
		
		String sql = "insert into student values(student_seq.nextval, ?, ?, sysdate)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, student_name);
		ps.setInt(2, student_score);
		ps.execute();
		
		con.close();
	}
}

