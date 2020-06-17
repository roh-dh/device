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
	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		return DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "c##kh", "c##kh");
	}
	
	//목록 메소드
	public List<BoardDto> getList() throws Exception{
		Connection con = getConnection();
		
		String sql = "SELECT * FROM board ORDER BY board_no DESC";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<BoardDto> list = new ArrayList<>();
		while(rs.next()) {
			BoardDto bdto = new BoardDto(rs);
			list.add(bdto);
		}
		
		con.close();
		return list;
	}
	
	//검색 메소드
	public List<BoardDto> search(String type, String keyword) throws Exception{
		Connection con = getConnection();
		
		String sql = "SELECT * FROM board "
								+ "WHERE instr(#1, ?) > 0 "
								+ "ORDER BY board_no DESC";
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
	
	//단일조회
	public BoardDto get(int board_no) throws Exception {
		Connection con = getConnection();
		
		String sql = "SELECT * FROM board WHERE board_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, board_no);
		ResultSet rs = ps.executeQuery();
		
//		BoardDto bdto = 객체 or null;
//		BoardDto bdto;
//		if(rs.next()) {
//			bdto = new BoardDto(rs);
//		}
//		else {
//			bdto = null;
//		}
		BoardDto bdto = rs.next() ? new BoardDto(rs) : null;//3항 연산자
		
		con.close();
		
		return bdto;
	}
	
	//조회수 증가
	public void plusReadcount(int board_no, String member_id) throws Exception {
		Connection con = getConnection();
		
		String sql = "UPDATE board "
						+ "SET board_read = board_read + 1 "
						+ "WHERE board_no = ? and board_writer != ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, board_no);
		ps.setString(2, member_id);
		ps.execute();
		
		con.close();
	}
	
	//시퀀스 생성
	// - dual 테이블은 오라클이 제공하는 임시 테이블
	public int getSequence() throws Exception{
		Connection con = getConnection();
		
		String sql = "SELECT board_seq.nextval FROM dual";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		rs.next();
		int seq = rs.getInt(1);//rs.getInt("NEXTVAL");
		
		con.close();
		
		return seq;
	}
	
	//등록
	// - 번호가 이미 생성되어서 bdto에 들어있으므로 시퀀스 사용 금지!
	public void write(BoardDto bdto) throws Exception {
		Connection con = getConnection();
		
		//아래와 같이 작성하면 미 작성된 항목들은 default 값이 적용
		String sql = 
		"INSERT INTO board"
		+ "(board_no, board_head, board_title, board_writer, board_content) "
		+ "VALUES(?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, bdto.getBoard_no());
		ps.setString(2, bdto.getBoard_head());
		ps.setString(3, bdto.getBoard_title());
		ps.setString(4, bdto.getBoard_writer());
		ps.setString(5, bdto.getBoard_content());
		ps.execute();
		
		con.close();
	}
	
	//게시글 삭제
	public void delete(int board_no) throws Exception {
		Connection con = getConnection();

		String sql = "DELETE board WHERE board_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, board_no);
		ps.execute();
		
		con.close();
	}
	
	//게시글 수정
	public void edit(BoardDto bdto) throws Exception {
		Connection con = getConnection();
		
		String sql = "UPDATE board SET "
							+ "board_head=?, board_title=?, board_content=? "
							+ "where board_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bdto.getBoard_head());
		ps.setString(2, bdto.getBoard_title());
		ps.setString(3, bdto.getBoard_content());
		ps.setInt(4, bdto.getBoard_no());
		ps.execute();
		
		con.close();
	}
}














