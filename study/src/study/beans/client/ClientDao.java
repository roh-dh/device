package study.beans.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClientDao {
	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##student";
		String password = "c##student";
		return DriverManager.getConnection(url, user, password);
	}

	public void regist(ClientDto cdto) throws Exception {

		Connection con = getConnection();
		String sql = "INSERT INTO client VALUES(client_seq.nextval,?,?,'일반회원',sysdate,0)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, cdto.getClient_id());
		ps.setString(2, cdto.getClient_pw());

		ps.execute();
		con.close();
	}

	public List<ClientDto> getList() throws Exception {
		Connection con = getConnection();

		String sql = "SELECT * FROM client order by client_no asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		List<ClientDto> list = new ArrayList<>();
		while (rs.next()) {
			ClientDto cdto = new ClientDto();
			cdto.setClient_no(rs.getInt("client_no"));
			cdto.setClient_id(rs.getString("client_id"));
			cdto.setClient_pw(rs.getString("client_pw"));
			cdto.setClient_auth(rs.getString("client_auth"));
			cdto.setClient_join(rs.getString("client_join"));
			cdto.setClient_point(rs.getInt("client_point"));
			list.add(cdto);
		}

		con.close();
		return list;
	}

	public List<ClientDto> search(String keyword) throws Exception {
//		public output 이름(input)장보고
		Connection con = getConnection();

		String sql = "SELECT * FROM client WHERE instr(CLIENT_ID, ?)>0 or instr(CLIENT_AUTH , ?)>0";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ps.setString(2, keyword);

		ResultSet rs = ps.executeQuery();

		List<ClientDto> list = new ArrayList<>();
		while (rs.next()) {
			ClientDto cdto = new ClientDto();
			cdto.setClient_no(rs.getInt("client_no"));
			cdto.setClient_id(rs.getString("client_id"));
			cdto.setClient_pw(rs.getString("client_pw"));
			cdto.setClient_auth(rs.getString("client_auth"));
			cdto.setClient_join(rs.getString("client_join"));
			cdto.setClient_point(rs.getInt("client_point"));
			list.add(cdto);
		}

		con.close();
		return list;
	}

//		단일조회 기능
	public ClientDto get(int client_no) throws Exception {
		Connection con = getConnection();
		String sql = "select client_no,client_id from client where client_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, client_no);
		ResultSet rs = ps.executeQuery();

		ClientDto cdto;
		if (rs.next()) {
			cdto = new ClientDto();
			cdto.setClient_no(rs.getInt("client_no"));
			cdto.setClient_id(rs.getString("client_id"));
//			cdto.setClient_pw(rs.getString("client_pw"));
//			cdto.setClient_auth(rs.getString("client_auth"));
//			cdto.setClient_join(rs.getString("client_join"));
//			cdto.setClient_point(rs.getInt("client_point"));
		} else {
			cdto = null;
		}
		con.close();
		return cdto;

	}

	public Boolean login(String client_id, String client_pw) throws Exception {
		Connection con = getConnection();
		String sql = "SELECT * FROM client " + "WHERE CLIENT_ID = ? AND Client_pw = ? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, client_id);
		ps.setString(2, client_pw);

		ResultSet rs = ps.executeQuery();

		boolean result = rs.next();

		return result;
	}

	// 로그인 메소드
	// - input : 회원정보(아이디, 비밀번호)
	// - output : 회원정보(모든정보 - 6개)
	public ClientDto login2(ClientDto cdto) throws Exception {
		Connection con = getConnection();
		String sql = "SELECT * FROM CLIENT WHERE client_id=? and client_pw =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, cdto.getClient_id());
		ps.setString(2, cdto.getClient_pw());
		ResultSet rs = ps.executeQuery();

//		위 ClientDto의 역할은 데이터를 가져오는 것으로 끝남 그래서 ClientDto를 새로 만듬.
//		ClientDto newDto = 객체 or null;
		ClientDto newDto;
		if (rs.next()) {
			newDto = new ClientDto();

			newDto.setClient_no(rs.getInt("client_no"));
			newDto.setClient_id(rs.getString("client_id"));
			newDto.setClient_pw(rs.getString("client_pw"));
			newDto.setClient_auth(rs.getString("client_auth"));
			newDto.setClient_join(rs.getString("client_join"));
			newDto.setClient_point(rs.getInt("client_point"));
		} else {
			newDto = null;
		}
		con.close();
		return newDto;
	}

	public void edit(ClientDto cdto) throws Exception {
		Connection con = getConnection();

		String sql = "UPDATE client Set client_pw=? WHERE client_id =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, cdto.getClient_pw());
		ps.setString(2, cdto.getClient_id());
		ps.execute(); //insert와 동일하게 수행(반환형 없으니까) 

		con.close();
	}

	public void delete(String client_id) throws Exception {
		Connection con = getConnection();
		String sql = "DELETE FROM client "
				+ "WHERE client_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, client_id);
		ps.execute();
		
		con.close();
		
		
	}

}
