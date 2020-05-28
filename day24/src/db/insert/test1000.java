package db.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class test1000 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("호텔명/지역/호텔평점을 차례로 입력하세요.");
		String name = sc.nextLine();
		String region = sc.nextLine();
		double score = sc.nextDouble();
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","study","oracle");
		
		String sql = "INSERT INTO hotel values(hotel_seq.nextval,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, name);
		ps.setString(2, region);
		ps.setDouble(3, score);

		ps.execute();
		
		con.close();		
		System.out.println("성공!");
	}
}

