package home.beans.dao;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ReplyDao {
	
	private static DataSource src;
	
	static {
		try {
			Context ctx = new InitialContext(); //탐색 도구 
			Context env = (Context) ctx.lookup("java:/comp/env");
			src = (DataSource) env.lookup("jdbc/oracle");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	//연결 메소드
	public Connection getConnection() throws Exception {
		return src.getConnection();
	}
	
}
