package home.beans.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import home.beans.dto.ReplyDto;

public class ReplyDao {

	private static DataSource src;

	static {
		try {
			Context ctx = new InitialContext(); // 탐색 도구
			Context env = (Context) ctx.lookup("java:/comp/env");
			src = (DataSource) env.lookup("jdbc/oracle");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	// 연결 메소드
	public Connection getConnection() throws Exception {
		return src.getConnection();
	}

	// 댓글 등록 메소드
	public void insert(ReplyDto rdto) throws Exception {
		Connection con = getConnection();

		String sql = "INSERT INTO reply values(?,?,?,sysdate,?)";

		PreparedStatement ps = con.prepareStatement(sql);

		ps.setInt(1, rdto.getReply_no());
		ps.setString(2, rdto.getReply_writer());
		ps.setString(3, rdto.getReply_content());
		ps.setInt(4, rdto.getReply_origin());

		ps.execute();

		con.close();

	}

	public int reply_no() throws Exception {
		Connection con = getConnection();

		String sql = "SELECT REPLY_SEQ.NEXTVAL FROM DUAL";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		rs.next();

		int reply_no = rs.getInt(1);

		con.close();

		return reply_no;
	}

}
