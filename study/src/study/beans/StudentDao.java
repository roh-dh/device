package study.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
//	연결 메소드
	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##study";
		String password = "c##study";

		return DriverManager.getConnection(url, user, password);
	}

//	등록 메소드
	public void regist(StudentDto sdto) throws Exception {
		Connection con = getConnection();
		String sql = "INSERT INTO student VALUES(" + "student_seq.nextval,?,?,sysdate)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, sdto.getStudent_name());
		ps.setInt(2, sdto.getStudent_score());

		ps.execute();
		con.close();
	}

//	목록 메소드
	public List<StudentDto> getList() throws Exception {
		Connection con = getConnection();

		String sql = "select * from student order by student_no asc";
		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();
		List<StudentDto> list = new ArrayList<>();
		while (rs.next()) { // 데이터 개수만큼 반복
			StudentDto sdto = new StudentDto();

//			int Student_no = rs.getInt("student_no");
//			sdto.setStudent_no(student_no);
			sdto.setStudent_no(rs.getInt("student_no"));
			sdto.setStudent_name(rs.getString("student_name"));
			sdto.setStudent_score(rs.getInt("student_score"));
			sdto.setStudent_create(rs.getString("student_create"));

			list.add(sdto);
		}
		con.close();
		return list;
	}

//검색 메소드
//	- input : String student_name
//	- process : database select query
//	- output : List<studentDto>
	public List<StudentDto> search(String student_name) throws Exception {
		Connection con = getConnection();

		String sql = "SELECT * FROM student "
				+" WHERE instr(student_name,?)>0"
				+ "ORDER BY student_no ASC";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, student_name);
		ResultSet rs = ps.executeQuery();

		List<StudentDto> list = new ArrayList<>();
		
		while(rs.next()) {
			StudentDto sdto = new StudentDto();
			sdto.setStudent_no(rs.getInt("student_no"));
			sdto.setStudent_name(rs.getString("student_name"));
			sdto.setStudent_score(rs.getInt("student_score"));
			sdto.setStudent_create(rs.getString("student_create"));

			list.add(sdto);
		}
		con.close();
		return list;
	}
	
	
//단일 조회
	public StudentDto get(int student_no) throws Exception{
//		process
		Connection con = getConnection();
		
		String sql = "SELECT * FROM student  "
				+"WHERE student_no =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, student_no);
		ResultSet rs = ps.executeQuery();
		
		
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
