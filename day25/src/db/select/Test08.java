package db.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test08 {
	public static void main(String[] args) throws Exception{
//		목표 : product 테이블의 가격 합계와 평균을 출력
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "product", "oracle");
		
		String sql = "SELECT sum(price) 합계, avg(price) 평균 FROM product WHERE EXTRACT(YEAR FROM made)=2020\r\n" + 
				"";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
//		rs는 연결 종료까지만 사용할 수 있기 때문에 연결 종료 후에도 데이터를 쓰기 위해 변수에 복사
		rs.next();
		int sum = rs.getInt("합계");
		double avg = rs.getDouble("평균");
		
		con.close();
		
//		복사된 데이터를 출력
		System.out.println(sum);
		System.out.println(avg);
	}
}

