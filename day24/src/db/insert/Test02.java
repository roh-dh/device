package db.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) throws Exception{
//		준비
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 점수 입력");
		String name = sc.nextLine();
		int score = sc.nextInt();
		sc.close();
		
//		처리
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
//		String sql = "INSERT INTO student values(student_seq.nextval, '홍길동', 50, sysdate)";
		String sql = "INSERT INTO student values(student_seq.nextval, '"+name+"', "+score+", sysdate)";
		System.out.println(sql);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.execute();
		
		con.close();
		
//		결과
		System.out.println("성공!");
	}
}
