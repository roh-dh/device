package db.select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.beans.StudentDao;

public class Test09 {
	public static void main(String[] args) throws Exception {
//		목표 : 연결을 StudentDao를 이용하여 진행(궁극적으로 모든 DB작업을 StudentDao를 이용하여 처리)
		
		StudentDao sdao = new StudentDao();
		Connection con = sdao.getConnection();
		
		String sql = "select count(*) cnt from student";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		rs.next();
		int count = rs.getInt("cnt");
		
		con.close();
		System.out.println("완료!");
		
		System.out.println("카운트 : "+count);
	}
}