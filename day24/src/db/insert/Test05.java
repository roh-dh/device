package db.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		준비 : 총 6개 항목 중에서 ?개의 항목을 입력받아야 함
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 / 비밀번호를 입력");
		String client_id = sc.nextLine();
		String client_pw = sc.nextLine();
		sc.close();
		
		try {
			
//			처리
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(
							"jdbc:oracle:thin:@localhost:1521:xe", "study", "oracle");
			
//			명령 실행
			String sql = "insert into client values(client_seq.nextval, ?, ?, '일반회원', sysdate, 0)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, client_id);
			ps.setString(2, client_pw);
			
			ps.execute();//실행
			
			con.close();
			
//			결과
			System.out.println("회원가입이 완료되었습니다");
		}
		
	
//		조사해본 결과 아이디가 같은 경우 발생하는 예외가 있으니 이것을 따로 처리하겠다!
catch(SQLIntegrityConstraintViolationException e) 	{
	System.out.println("이미 사용중인 아이디입니다");	
}
	}
}
