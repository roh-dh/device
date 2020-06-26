package study.beans.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	
	//연결 메소드
	public Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		return con;
	}
	
	//등록 메소드
	public void regist(StudentDto sdto) throws Exception{
		Connection con = getConnection();
		
		String sql = "INSERT INTO student VALUES("
							+ "student_seq.nextval, ?, ?, sysdate)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, sdto.getStudent_name());
		ps.setInt(2, sdto.getStudent_score());
		
		ps.execute();
		
		con.close();
	}
	
	//목록 메소드
	public List<StudentDto> getList() throws Exception{
		Connection con = getConnection();//연결
		
		String sql = "SELECT * FROM student ORDER BY student_no ASC";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();//실행
		
		List<StudentDto> list = new ArrayList<>();//비어있는 List 준비
		while(rs.next()) {//데이터 개수만큼 반복
			StudentDto sdto = new StudentDto();//비어있는 객체 생성
			
			sdto.setStudent_no(rs.getInt("student_no"));
			sdto.setStudent_name(rs.getString("student_name"));
			sdto.setStudent_score(rs.getInt("student_score"));
			sdto.setStudent_create(rs.getString("student_create"));

			list.add(sdto);//리스트에 추가
		}
		
		con.close();//종료
		
		return list;//리스트를 반환
	}
	
	//검색 메소드
	// - input : String student_name
	// - process : Database Select Query
	// - output : List<StudentDto>
	public List<StudentDto> search(String student_name) throws Exception{
		Connection con = getConnection();
		
		String sql = "SELECT * FROM student "
							+ "WHERE instr(student_name, ?) > 0 "
							+ "ORDER BY student_no ASC";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, student_name);
		ResultSet rs = ps.executeQuery();
		
		List<StudentDto> list = new ArrayList<>();//비어있는 List 준비
		while(rs.next()) {//데이터 개수만큼 반복
			StudentDto sdto = new StudentDto();//비어있는 객체 생성
			
			sdto.setStudent_no(rs.getInt("student_no"));
			sdto.setStudent_name(rs.getString("student_name"));
			sdto.setStudent_score(rs.getInt("student_score"));
			sdto.setStudent_create(rs.getString("student_create"));

			list.add(sdto);//리스트에 추가
		}
		
		con.close();//종료
		
		return list;//리스트를 반환
	}

	//단일조회 기능
	// - input : Primary key(int student_no)
	// - output : StudentDto
	public StudentDto get(int student_no) throws Exception{
		//process
		Connection con = getConnection();
		
		String sql = "SELECT * FROM student S "
									+ "WHERE S.student_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, student_no);
		ResultSet rs = ps.executeQuery();
		//rs에는 데이터가 1개 아니면 0개이므로 rs.next()로 구분하여 처리
		
//		StudentDto sdto = 객체 or null;
		StudentDto sdto;
		if(rs.next()) {//있으면? 객체를 만들어서 값을 복사
			sdto = new StudentDto();
			sdto.setStudent_no(rs.getInt("student_no"));
			sdto.setStudent_name(rs.getString("student_name"));
			sdto.setStudent_score(rs.getInt("student_score"));
			sdto.setStudent_create(rs.getString("student_create"));
		}
		else {//없으면? null 처리
			sdto = null;
		}
		
		con.close();
		
		return sdto;
	}
}








