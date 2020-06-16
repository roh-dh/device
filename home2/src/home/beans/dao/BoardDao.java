package home.beans.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BoardDao {
	//연결 메소드
	public Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##kh", "c##kh");
	}

	
	
	
	
	
}
