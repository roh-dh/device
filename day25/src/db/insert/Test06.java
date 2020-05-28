package db.insert;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db.beans.StudentDao;

public class Test06 {
	public static void main(String[] args) throws Exception {
//		목표 : StudentDao를 이용하여 데이터를 DB(student table)에 저장
		
//		준비물 : 이름(student_name), 점수(student_score)
		String student_name = "이소룡";
		int student_score = 95;
		
//		처리
		StudentDao sdao = new StudentDao();
		Connection con = sdao.getConnection();
		
		String sql = "insert into student values(student_seq.nextval, ?, ?, sysdate)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, student_name);
		ps.setInt(2, student_score);
		ps.execute();
		
		con.close();
	}
}