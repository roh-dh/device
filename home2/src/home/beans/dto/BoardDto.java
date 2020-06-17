package home.beans.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardDto {
	private int board_no, board_read;
	private String board_head, board_title, board_writer, board_content, board_date;
	public BoardDto() {
		super();
	}
	//추가 : ResultSet을 BoardDto로 변환하는 생성자
	public BoardDto(ResultSet rs) throws SQLException {
		this.setBoard_no(rs.getInt("board_no"));
		this.setBoard_head(rs.getString("board_head"));
		this.setBoard_title(rs.getString("board_title"));
		this.setBoard_content(rs.getString("board_content"));
		this.setBoard_writer(rs.getString("board_writer"));
		this.setBoard_date(rs.getString("board_date"));
		this.setBoard_read(rs.getInt("board_read"));
	}
	public int getBoard_no() {
		return board_no;
	}
	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}
	public int getBoard_read() {
		return board_read;
	}
	public void setBoard_read(int board_read) {
		this.board_read = board_read;
	}
	public String getBoard_head() {
		return board_head;
	}
	public void setBoard_head(String board_head) {
		this.board_head = board_head;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_writer() {
		return board_writer;
	}
	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public String getBoard_date() {
		return board_date;
	}
	public void setBoard_date(String board_date) {
		this.board_date = board_date;
	}
}
