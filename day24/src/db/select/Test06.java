package db.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test06 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		드라이버 생성
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","study","oracle");
		
		String sql = "Select * from client where instr(client_id,'d')>0";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getInt("client_no"));
			System.out.print("\t");
			System.out.print(rs.getString("client_id"));
			System.out.print("\t");
			System.out.print(rs.getString("client_pw"));
			System.out.print("\t");
			System.out.print(rs.getString("client_auth"));
			System.out.print("\t\t");
			System.out.print(rs.getString("client_join"));
			System.out.print("\t\t");
			System.out.println(rs.getInt("client_point"));
		}
		
		con.close();
		System.out.println("성공!");
	}
}
