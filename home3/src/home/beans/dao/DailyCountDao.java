package home.beans.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import home.beans.dto.DailyCountDto;

public class DailyCountDao {
	//연결 방법은 이전과 동일
	private static DataSource src;
	
	static {
		try {
			Context ctx = new InitialContext();
			Context env = (Context) ctx.lookup("java:/comp/env");
			src = (DataSource) env.lookup("jdbc/oracle");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() throws Exception{
		return src.getConnection();
	}
	
//	일반조회
	public List<DailyCountDto> getList() throws Exception {
		Connection con = getConnection();
		
//		뷰는 테이블처럼 조회가 가능
		String sql = "SELECT * FROM daily_count";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<DailyCountDto> list = new ArrayList<>();
		while(rs.next()) {
			DailyCountDto dcdto = new DailyCountDto(rs);
			list.add(dcdto);
		}
		con.close();
		return list;
	}
	
	
//	기간조회
	public List<DailyCountDto> getList(String start, String finish) throws Exception {
		Connection con = getConnection();
		
		String sql = "SELECT * FROM daily_count "
			+ "WHERE to_date(day, 'YYYY-MM-DD') "
			+ "between to_date(?, 'YYYY-MM-DD') and to_date(?, 'YYYY-MM-DD')";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, start);
		ps.setString(2, finish);
		ResultSet rs = ps.executeQuery();
		
		List<DailyCountDto> list = new ArrayList<>();
		while(rs.next()) {
			DailyCountDto dcdto = new DailyCountDto(rs);
			list.add(dcdto);
		}
		con.close();
		return list;
	}
}









