package db.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test05 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		드라이버 생성
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","product","oracle");
		
		String sql = "Select * from product order by price desc";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getInt("no"));
			System.out.print("\t");
			System.out.print(rs.getString("name"));
			System.out.print("\t");
			System.out.print(rs.getString("type"));
			System.out.print("\t");
			System.out.print(rs.getInt("price"));
			System.out.print("\t\t");
			System.out.print(rs.getString("made"));
			System.out.print("\t\t");
			System.out.println(rs.getString("expire"));
		}
		
		con.close();
		System.out.println("성공!");
	}
}
