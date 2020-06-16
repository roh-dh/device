package home.beans.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import home.beans.dto.BoardDto;

public class BoardDao {
	//연결 메소드
	public Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##kh", "c##kh");
	}

	//목록 메소드
	public List<BoardDto> getList() throws Exception{
		Connection con = getConnection();
		
		String sql= "SELECT * from board ORDER BY BOARD_no desc";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<BoardDto> list = new ArrayList<>();
		while(rs.next()){
			BoardDto bdto = new BoardDto(rs);
			list.add(bdto);
		}
		con.close();
		return list;
	}
	
	//검색 메소드
	public List<BoardDto> search(String type, String keyword) throws Exception{
			Connection con = getConnection();

			String sql= "SELECT * FROM board "
					+"WHERE instr(type,?)>0"
					+"ORDER BY board_no desc";
			sql = sql.replace("#1", type);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, keyword);
			ResultSet rs = ps.executeQuery();
			
			List<BoardDto> list = new ArrayList<>();
			while(rs.next()) {
				BoardDto bdto = new BoardDto(rs);
				list.add(bdto);
			}
			
			
			con.close();
			return list;
	}
	
	
	
}
