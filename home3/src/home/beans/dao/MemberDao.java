package home.beans.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import home.beans.dto.MemberDto;

public class MemberDao {

	//연결 메소드
	public Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##kh", "c##kh");
	}
	
	//가입 메소드
	public void join(MemberDto mdto) throws Exception{
		Connection con = getConnection();
		
		String sql = "INSERT INTO member VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, '일반', sysdate, null)";
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
		
		ps.execute();
		
		con.close();
	}
	
	//로그인 메소드
	public MemberDto login(MemberDto mdto) throws Exception{
		Connection con = getConnection();
		
		String sql = "SELECT * FROM member WHERE member_id=? AND member_pw=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, mdto.getMember_id());
		ps.setString(2, mdto.getMember_pw());
		ResultSet rs = ps.executeQuery();
		
//		rs에는 데이터가 1개 있거나 아니면 없거나 둘 중 하나이므로 그에 따라 MemberDto를 준비하여 반환
//		MemberDto user = 객체 or null;
		MemberDto user;
		if(rs.next()) {//데이터가 있으면
			user = new MemberDto();
			
			user.setMember_id(rs.getString("member_id"));
			user.setMember_pw(rs.getString("member_pw"));
			user.setMember_nick(rs.getString("member_nick"));
			user.setPost(rs.getString("post"));
			user.setBase_addr(rs.getString("base_addr"));
			user.setExtra_addr(rs.getString("extra_addr"));
			user.setMember_birth(rs.getString("member_birth"));
			user.setMember_phone(rs.getString("member_phone"));
			user.setMember_intro(rs.getString("member_intro"));
			user.setMember_auth(rs.getString("member_auth"));
			user.setMember_join(rs.getString("member_join"));
			user.setMember_login(rs.getString("member_login"));
		}
		else {
			user = null;
		}
		
		con.close();
		
		return user;
	}
	
	//로그인 시각 갱신 메소드
	public void updateLoginTime(String id) throws Exception{
		Connection con = getConnection();
		
		String sql = "UPDATE member SET member_login=sysdate WHERE member_id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.execute();
//		int result = ps.executeUpdate();
		
		con.close();
	}
	
	//아이디 찾기 메소드
	public String findId(MemberDto mdto) throws Exception{
		Connection con = getConnection();
		
		String sql = "SELECT member_id FROM member "
				+ "WHERE member_nick=? and member_phone=? and member_birth=?";
//				+ "WHERE member_nick=? and member_phone=? and member_birth=to_date(?, 'YYYY-MM-DD')";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, mdto.getMember_nick());
		ps.setString(2, mdto.getMember_phone());
		ps.setString(3, mdto.getMember_birth());
		ResultSet rs = ps.executeQuery();
		
//		String member_id = 추출한 아이디 or null;
		String member_id;
		if(rs.next()) {
			member_id = rs.getString("member_id");//rs.getString(1)
		}
		else {
			member_id = null;
		}
		
		con.close();
		
		return member_id;
	}
	
	//비밀번호 변경 메소드
	public void changePassword(MemberDto mdto) throws Exception{
		Connection con = getConnection();
		
		String sql = "UPDATE member SET member_pw=? WHERE member_id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, mdto.getMember_pw());
		ps.setString(2, mdto.getMember_id());
		ps.execute();
		
		con.close();
	}

	//정보 변경 메소드
	public void changeInfo(MemberDto mdto) throws Exception {
		Connection con = getConnection();
		
		String sql = "UPDATE member SET "
				+ "member_nick=?, post=?, base_addr=?, extra_addr=?, member_phone=?, member_intro=? "
				+ "WHERE member_id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, mdto.getMember_nick());
		ps.setString(2, mdto.getPost());
		ps.setString(3, mdto.getBase_addr());
		ps.setString(4, mdto.getExtra_addr());
		ps.setString(5, mdto.getMember_phone());
		ps.setString(6, mdto.getMember_intro());
		ps.setString(7, mdto.getMember_id());
		ps.execute();
		
		con.close();
	}
	
	//단일조회 메소드
	public MemberDto get(String member_id) throws Exception{
		Connection con = getConnection();
		
		String sql = "SELECT * FROM member WHERE member_id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, member_id);
		ResultSet rs = ps.executeQuery();
		
//		MemberDto mdto = 객체 or null;
		MemberDto mdto;
		if(rs.next()) {
			mdto = new MemberDto();
			
			//12개의 정보를 복사
			mdto.setMember_id(rs.getString("member_id"));
			mdto.setMember_pw(rs.getString("member_pw"));
			mdto.setMember_nick(rs.getString("member_nick"));
			mdto.setPost(rs.getString("post"));
			mdto.setBase_addr(rs.getString("base_addr"));
			mdto.setExtra_addr(rs.getString("extra_addr"));
			mdto.setMember_birth(rs.getString("member_birth"));
			mdto.setMember_phone(rs.getString("member_phone"));
			mdto.setMember_intro(rs.getString("member_intro"));
			mdto.setMember_auth(rs.getString("member_auth"));
			mdto.setMember_join(rs.getString("member_join"));
			mdto.setMember_login(rs.getString("member_login"));
		}
		else {
			mdto = null;
		}
		
		con.close();
		
		return mdto;
	}
	
	//탈퇴 메소드
	public void exit(String member_id) throws Exception{
		Connection con = getConnection();
		
		String sql = "DELETE member WHERE member_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, member_id);
		ps.execute();
		
		con.close();
	}
	
	//(관리자) 회원 검색 기능
	public List<MemberDto> search(String member_id) throws Exception{
		Connection con = getConnection();
		
		String sql = "SELECT * FROM member WHERE instr(member_id, ?) > 0 ORDER BY member_id ASC";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, member_id);
		ResultSet rs = ps.executeQuery();
		
		List<MemberDto> list = new ArrayList<>();
		while(rs.next()) {
			MemberDto mdto = new MemberDto(rs);
			list.add(mdto);
		}
		
		con.close();
		
		return list;
	}

	//(관리자) 회원 검색 기능(타입 추가) - 메소드 오버로딩
	public List<MemberDto> search(String type, String keyword) throws Exception{
		Connection con = getConnection();
		
		String sql = "SELECT * FROM member WHERE instr(#1, ?) > 0 ORDER BY #1 ASC";
		sql = sql.replace("#1", type);
		System.out.println("sql = " + sql);
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ResultSet rs = ps.executeQuery();
		
		//나머지 처리는 다른 목록들과 동일하다
		List<MemberDto> list = new ArrayList<>();
		while(rs.next()) {
			MemberDto mdto = new MemberDto(rs);
			list.add(mdto);
		}
		
		con.close();
		
		return list;
	}
	
	//(관리자) 회원 정보 수정
	public void editByAdmin(MemberDto mdto) throws Exception{
		Connection con = getConnection();
		
		String sql = "UPDATE member SET "
								+ "member_pw=?, member_nick=?, post=?, base_addr=?, extra_addr=?, "
								+ "member_birth=?, member_phone=?, member_intro=?, member_auth=? "
							+ "WHERE member_id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, mdto.getMember_pw());
		ps.setString(2, mdto.getMember_nick());
		ps.setString(3, mdto.getPost());
		ps.setString(4, mdto.getBase_addr());
		ps.setString(5, mdto.getExtra_addr());
		ps.setString(6, mdto.getMember_birth());
		ps.setString(7, mdto.getMember_phone());
		ps.setString(8, mdto.getMember_intro());
		ps.setString(9, mdto.getMember_auth());
		ps.setString(10, mdto.getMember_id());
		ps.execute();
		
		con.close();
	}
}














