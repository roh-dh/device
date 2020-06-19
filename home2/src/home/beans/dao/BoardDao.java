package home.beans.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import home.beans.dto.BoardDto;

public class BoardDao {

	// context.xml에서 관리하는 자원 객체를 참조할 수 있도록 연결 코드 구현
	private static DataSource src;// 리모컨 선언

	// static 변수의 초기화가 복잡할 경우에 사용할 수 있는 static 전용 구문
	static {
		try {
			// src = context.xml에서 관리하는 자원의 정보;
			Context ctx = new InitialContext();// 탐색 도구
			Context env = (Context) ctx.lookup("java:/comp/env");// Context 설정 탐색
			src = (DataSource) env.lookup("jdbc/oracle");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	// 연결 메소드
	public Connection getConnection() throws Exception {
//		Class.forName("oracle.jdbc.OracleDriver");
//		return DriverManager.getConnection(
//				"jdbc:oracle:thin:@localhost:1521:xe", "c##kh", "c##kh");
		return src.getConnection();
	}

	// 목록 메소드
	public List<BoardDto> getList() throws Exception {
		Connection con = getConnection();

		String sql = "SELECT * FROM board\n" + 
				"CONNECT BY PRIOR board_no=super_no\n" + 
				"START WITH super_no IS NULL\n" + 
				"ORDER SIBLINGS BY group_no DESC, board_no ASC";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		List<BoardDto> list = new ArrayList<>();
		while (rs.next()) {
			BoardDto bdto = new BoardDto(rs);
			list.add(bdto);
		}

		con.close();
		return list;
	}

	// 검색 메소드
	public List<BoardDto> search(String type, String keyword) throws Exception {
		Connection con = getConnection();

		String sql = "SELECT * FROM board " + "WHERE instr(#1, ?) > 0 " + "ORDER BY board_no DESC";
		sql = sql.replace("#1", type);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ResultSet rs = ps.executeQuery();

		List<BoardDto> list = new ArrayList<>();
		while (rs.next()) {
			BoardDto bdto = new BoardDto(rs);
			list.add(bdto);
		}

		con.close();
		return list;
	}

	// 단일조회
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
		BoardDto bdto = rs.next() ? new BoardDto(rs) : null;// 3항 연산자

		con.close();

		return bdto;
	}

	// 조회수 증가
	public void plusReadcount(int board_no, String member_id) throws Exception {
		Connection con = getConnection();

		String sql = "UPDATE board " + "SET board_read = board_read + 1 " + "WHERE board_no = ? and board_writer != ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, board_no);
		ps.setString(2, member_id);
		ps.execute();

		con.close();
	}

	// 시퀀스 생성
	// - dual 테이블은 오라클이 제공하는 임시 테이블
	public int getSequence() throws Exception {
		Connection con = getConnection();

		String sql = "SELECT board_seq.nextval FROM dual";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		rs.next();
		int seq = rs.getInt(1);// rs.getInt("NEXTVAL");

		con.close();

		return seq;
	}

	// 등록
	// - 번호가 이미 생성되어서 bdto에 들어있으므로 시퀀스 사용 금지!
	// -bdto의 상황은 크게 두 가지 경우로 나뉜다.
	// 1.bdto.getSuper_no() == 0 새글
	// 2.bdto.getSuper_no() > 0 답글
	// -bdto에 들어갈 데이터(상위글번호, 그룹번호, 차수정보)를 계산하여 등록!

	// 새글 등록기준
	// - 상위글번호 0
	// - 차수: 0
	// - 그룹번호 시퀀스 번호

	// 답글이면 -원본글(상위글) 정보가 필요
	// -상위글번호: 원본글의 번호
	// -차수 원본글 차수+1
	// -그룹번호 원본글의 그룹번호

	public void write(BoardDto bdto) throws Exception {
		if(bdto.getSuper_no()==0) {//새글이면
			//bdto에는 5개의 정보가 들어있다(번호,말머리,제목,작성자,내용)
			//- 추가로 그룹번호만 설정해주어야 한다.(나머지는 0)
			bdto.setGroup_no(bdto.getBoard_no());
			bdto.setSuper_no(0);
			bdto.setDepth(0);
		}
		else {//답글이면
			//bdto에는 6개의 정보가 들어있다(번호,말머리,제목,작성자,내용,상위글번호)
			//- 추가로 상위글번호 그룹번호와 차수를 설정해주어야 한다.
			BoardDto find = this.get(bdto.getSuper_no()); //상위글 정보 불러오기
			//-find를 이용하여 bdto에 그룹번호와 차수를 설정
			bdto.setGroup_no(find.getGroup_no());
			bdto.setDepth(find.getDepth()+1);
		}
		
		Connection con = getConnection();
		
		//아래와 같이 작성하면 미 작성된 항목들은 default 값이 적용
		String sql = 
		"INSERT INTO board"
		+ "("
		+"board_no, "
		+"board_head, "
		+"board_title, "
		+"board_writer, "
		+"board_content, "
		+"super_no, "
		+"group_no, "
		+"depth"
		+")"
		+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, bdto.getBoard_no());
		ps.setString(2, bdto.getBoard_head());
		ps.setString(3, bdto.getBoard_title());
		ps.setString(4, bdto.getBoard_writer());
		ps.setString(5, bdto.getBoard_content());
		if(bdto.getSuper_no()==0) { //새글이면 NULL을 설정
			ps.setNull(6, Types.INTEGER);
		}
		else {//답글이면 번호를 설정
			ps.setInt(6, bdto.getSuper_no());
		}
		ps.setInt(7, bdto.getBoard_no());
		ps.setInt(8, bdto.getDepth());
		ps.execute();
		
		con.close();
	}

	// 게시글 삭제
	public void delete(int board_no) throws Exception {
		Connection con = getConnection();

		String sql = "DELETE board WHERE board_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, board_no);
		ps.execute();

		con.close();
	}

	// 게시글 수정
	public void edit(BoardDto bdto) throws Exception {
		Connection con = getConnection();

		String sql = "UPDATE board SET " + "board_head=?, board_title=?, board_content=? " + "where board_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bdto.getBoard_head());
		ps.setString(2, bdto.getBoard_title());
		ps.setString(3, bdto.getBoard_content());
		ps.setInt(4, bdto.getBoard_no());
		ps.execute();

		con.close();
	}

	// 댓글 개수 카운트
	// - 1번글의 댓글 개수를 알아내라!
	// - SELECT count(*) FROM reply WHERE reply_origin = 1
	// - 1번글의 댓글 개수를 5개로 변경해라!
	// - UPDATE board SET board_replycount = 5 WHERE board_no = 1
	// - 위의 두 구문을 합쳐서 실행하도록 구현
	public void editReplycount(int board_no) throws Exception {
		Connection con = getConnection();

		String sql = "UPDATE board " + "SET board_replycount = (" + "SELECT count(*) FROM reply WHERE reply_origin = ?"
				+ ") " + "WHERE board_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, board_no);
		ps.setInt(2, board_no);
		ps.execute();

		con.close();
	}
}
