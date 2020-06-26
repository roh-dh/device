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

import home.beans.dto.BoardFileDto;

public class BoardFileDao {
	
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
	
	//시퀀스 생성 메소드
	public int getSequence() throws Exception {
		Connection con = getConnection();
		
		String sql = "SELECT board_file_seq.nextval FROM dual";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		rs.next();
		int seq = rs.getInt(1);//rs.getInt("NEXTVAL");
		
		con.close();
		
		return seq;
	}
	
	//저장 메소드
	// - 시퀀스 번호까지 이미 뽑혀 있으므로 자동 생성할 데이터가 없다
	public void save(BoardFileDto bfdto) throws Exception {
		Connection con = getConnection();
		
		String sql = "INSERT INTO board_file VALUES(?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, bfdto.getBoard_file_no());
		ps.setString(2, bfdto.getBoard_file_name());
		ps.setLong(3, bfdto.getBoard_file_size());
		ps.setString(4, bfdto.getBoard_file_type());
		ps.setInt(5, bfdto.getBoard_origin());
		ps.execute();
		
		con.close();
	}
	
	//게시글 첨부파일 조회(댓글 조회와 동일)
	public List<BoardFileDto> getList(int board_no) throws Exception {
		Connection con = getConnection();
		String sql = "SELECT * FROM board_file "
							+ "WHERE board_origin = ? "
							+ "ORDER BY board_file_no ASC";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, board_no);
		ResultSet rs = ps.executeQuery();
		List<BoardFileDto> list = new ArrayList<>();
		while(rs.next()) {
			BoardFileDto bfdto = new BoardFileDto(rs);
			list.add(bfdto);
		}
		con.close();
		return list;
	}
	
	//단일조회 기능
	public BoardFileDto get(int board_file_no) throws Exception {
		Connection con = getConnection();
		
		String sql = "SELECT * FROM board_file WHERE board_file_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, board_file_no);
		ResultSet rs = ps.executeQuery();
		
		BoardFileDto bfdto;
		if(rs.next()) {
			bfdto = new BoardFileDto(rs);
		}
		else {
			bfdto = null;
		}
		
		con.close();
		return bfdto;
	}
}