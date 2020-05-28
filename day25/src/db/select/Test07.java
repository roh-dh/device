package db.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test07 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
//목표 : study계정의 student 테이블 데이터 개수를 구하시오.
		
	Class.forName("oracle.jdbc.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","study","oracle");

	String sql = "select count(*)  from student";
	PreparedStatement ps = con.prepareStatement(sql);
	
	ResultSet rs = ps.executeQuery(); //select 용 실행 명령
//	데이터가 무조건 1
//	- count(), mint(), max(), sum(), avg() 등
	rs.next();
//	int count = rs.getInt(1);
	int count = rs.getInt("count(*)");
//	int count = rs.getInt("cnt");
	System.out.println(count);
	
	
	con.close();
	}
}
