package db.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClientDao {
	
	//연결 메소드
	public Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		return DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "oracle");
	}
	
	//등록 메소드
//	public void regist(String client_id, String client_pw) throws Exception {
	public void regist(ClientDto cdto) throws Exception {
		Connection con = this.getConnection();
		
		String sql = "INSERT INTO client VALUES("
						+ "client_seq.nextval, ?, ?, '일반회원', sysdate, 0)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, cdto.getClient_id());
		ps.setString(2, cdto.getClient_pw());
		ps.execute();
		
		con.close();
	}
	
	//목록 메소드
	public List<ClientDto> getList() throws Exception{
		return getList("no", "asc");
	}
	
	public List<ClientDto> getList(String column, String sort) throws Exception{
		Connection con = getConnection();
		
		String sql = "SELECT * FROM client ORDER BY #1 #2";
		sql = sql.replace("#1", column);
		sql = sql.replace("#2", sort);
		
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<ClientDto> list = new ArrayList<>();//비어있는 List 준비
		while(rs.next()) {//데이터 수만큼 반복
			ClientDto cdto = new ClientDto();//비어있는 객체 준비
			
			//데이터 복사
			cdto.setClient_no(rs.getInt("client_no"));
			cdto.setClient_id(rs.getString("client_id"));
			cdto.setClient_pw(rs.getString("client_pw"));
			cdto.setClient_auth(rs.getString("client_auth"));
			cdto.setClient_join(rs.getString("client_join"));
			cdto.setClient_point(rs.getInt("client_point"));
			
			list.add(cdto);//List에 추가
		}
		
		con.close();
		
		return list;
	}

	//검색 메소드
	public List<ClientDto> search(String keyword) throws Exception{
		Connection con = getConnection();
		
//		String sql = "SELECT * FROM client WHERE client_id like '%'||?||'%' ORDER BY client_id ASC";
		String sql = "SELECT * FROM client WHERE instr(client_id, ?) > 0 ORDER BY client_id ASC";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ResultSet rs = ps.executeQuery();
		
		List<ClientDto> list = new ArrayList<>();//비어있는 List 준비
		while(rs.next()) {//데이터 수만큼 반복
			ClientDto cdto = new ClientDto();//비어있는 객체 준비
			
			//데이터 복사
			cdto.setClient_no(rs.getInt("client_no"));
			cdto.setClient_id(rs.getString("client_id"));
			cdto.setClient_pw(rs.getString("client_pw"));
			cdto.setClient_auth(rs.getString("client_auth"));
			cdto.setClient_join(rs.getString("client_join"));
			cdto.setClient_point(rs.getInt("client_point"));
			
			list.add(cdto);//List에 추가
		}
		
		con.close();
		
		return list;
	}

	public List<ClientDto> search(String keyword, String column) throws Exception{
		Connection con = getConnection();
		
		String sql = "SELECT * FROM client WHERE instr(#1, ?) > 0 ORDER BY #1 ASC";
		sql = sql.replace("#1", column);//#1을 column 값으로 치환해라

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ResultSet rs = ps.executeQuery();
		
		List<ClientDto> list = new ArrayList<>();//비어있는 List 준비
		while(rs.next()) {//데이터 수만큼 반복
			ClientDto cdto = new ClientDto();//비어있는 객체 준비
			
			//데이터 복사
			cdto.setClient_no(rs.getInt("client_no"));
			cdto.setClient_id(rs.getString("client_id"));
			cdto.setClient_pw(rs.getString("client_pw"));
			cdto.setClient_auth(rs.getString("client_auth"));
			cdto.setClient_join(rs.getString("client_join"));
			cdto.setClient_point(rs.getInt("client_point"));
			
			list.add(cdto);//List에 추가
		}
		
		con.close();
		
		return list;
	}
	
	public List<ClientDto> search(String keyword, String column, int duration) throws Exception{
		Connection con = getConnection();
		
		String sql = "SELECT * FROM client "
				+ "WHERE client_join between sysdate - ? and sysdate and instr(#1, ?) > 0 "
				+ "ORDER BY #1 ASC";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, duration);
		ps.setString(2, keyword);
		ResultSet rs = ps.executeQuery();
		
		List<ClientDto> list = new ArrayList<>();//비어있는 List 준비
		while(rs.next()) {//데이터 수만큼 반복
			ClientDto cdto = new ClientDto();//비어있는 객체 준비
			
			//데이터 복사
			cdto.setClient_no(rs.getInt("client_no"));
			cdto.setClient_id(rs.getString("client_id"));
			cdto.setClient_pw(rs.getString("client_pw"));
			cdto.setClient_auth(rs.getString("client_auth"));
			cdto.setClient_join(rs.getString("client_join"));
			cdto.setClient_point(rs.getInt("client_point"));
			
			list.add(cdto);//List에 추가
		}
		
		con.close();
		return list;
	}
	public void editPassword(ClientDto cdto) throws Exception{
		Connection con = getConnection();
		
		String sql = "UPDATE client SET Client_pw = ? WHERE Client_no =?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, cdto.getClient_pw());
		ps.setInt(2, cdto.getClient_no());
		
		int result= ps.executeUpdate();
		
		con.close();
		
	}
}