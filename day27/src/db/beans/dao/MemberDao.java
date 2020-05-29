package db.beans.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.beans.dto.MemberDto;

public class MemberDao {

	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","c##kh","c##kh");
	}

	// 회원가입 : 회원이 입력한 정보를 데이터베이스에 추가
	public void regist(MemberDto mdto) throws Exception {
		Connection con = getConnection();

		String sql = "INSERT INTO member Values(" + "?,?,?,?,?,?,?,?,?,'일반',sysdate, null)";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, mdto.getMember_id());
		ps.setString(2, mdto.getMember_pw());
		ps.setString(3, mdto.getMember_nick());
		ps.setString(4, mdto.getPost());
		ps.setString(5, mdto.getBase_addr());
		ps.setString(6, mdto.getExtra_addr());
		ps.setString(7, mdto.getMember_birth());
		ps.setString(8, mdto.getMember_phone());
		ps.setString(9, mdto.getMember_intro());
		ps.execute();// 실행

		con.close();
//		return; void때는 return을 생략..
	}

	// 로그인 :
//	select * from member Where member_id=? and member_pw=?
	public boolean login(MemberDto mdto) throws Exception {
		Connection con = getConnection();

		String sql = "select count(*) from member " + "where member_id=? and member_pw=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, mdto.getMember_id());
		ps.setString(2, mdto.getMember_pw());
		ResultSet rs = ps.executeQuery();
		rs.next();
		int result = rs.getInt(1);// rs.getInt("count(*)");

		con.close();
		return result == 1;
		/*
		 * if(result==1) { return true; //성공 } else { return false; //실패 }
		 */
	}

	public boolean login2(MemberDto mdto)throws Exception {
	Connection con =getConnection();
	
	String sql = "select count(*) from member where member_id=? and member_pw=?";
	PreparedStatement ps =con.prepareStatement(sql);
	ps.setString(1, mdto.getMember_id());
	ps.setString(2, mdto.getMember_pw());
	ResultSet rs = ps.executeQuery();		
	boolean result = rs.next();
	
/*	if(result == true) {
		return true;
	} else {
		return false;
	} */
	con.close();

	return result;
	}
	
//	select count(*) from member where member_id=? and member_pw=?
	public String findId(MemberDto mdto) throws Exception{
		Connection con = getConnection();
		String sql = "SELECT member_id FROM MEMBER WHERE member_nick=? AND member_birth=?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, mdto.getMember_nick());
		ps.setString(2, mdto.getMember_birth());
		
		ResultSet rs = ps.executeQuery();
		String id;
		if(rs.next()) {
			id = rs.getString(1);			
		} else {
			id = null;
		}
		con.close();
		
		return id;
	}
	
	
	
	//아이디 찾기

}

