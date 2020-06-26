package study.beans.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClientDao {
	
	//연결 메소드
	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		return DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
	}
	
	//등록 메소드
	public void regist(ClientDto cdto) throws Exception{
		Connection con = getConnection();//연결
		
		String sql = "INSERT INTO client VALUES("
				+ "client_seq.nextval, ?, ?, '일반회원', sysdate, 0)";//명령
		PreparedStatement ps = con.prepareStatement(sql);//전송객체
		ps.setString(1, cdto.getClient_id());//1번째 위치홀더(?)에 설정
		ps.setString(2, cdto.getClient_pw());//2번째 위치홀더(?)에 설정
		
		ps.execute();//실행!
		
		con.close();//종료
	}
	
	//조회 메소드
	public List<ClientDto> getList() throws Exception{
		Connection con = getConnection();//연결 시작
		
		String sql = "SELECT * FROM client ORDER BY client_no ASC";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<ClientDto> list = new ArrayList<>();//비어있는 List 준비
		while(rs.next()) {//데이터 개수만큼 반복
			ClientDto cdto = new ClientDto();//비어있는 객체 준비
			
			cdto.setClient_no(rs.getInt("client_no"));//client_no 복사
			cdto.setClient_id(rs.getString("client_id"));//client_id 복사
			cdto.setClient_pw(rs.getString("client_pw"));//client_pw 복사
			cdto.setClient_auth(rs.getString("client_auth"));//client_auth 복사
			cdto.setClient_join(rs.getString("client_join"));//client_join 복사
			cdto.setClient_point(rs.getInt("client_point"));//client_point 복사
			
			list.add(cdto);//객체를 리스트에 추가
		}
		
		con.close();//연결 종료
		
		return list;
	}

	//검색 메소드
	//- input : 검색어(keyword) -> String
	//- process: 
	//- output : 회원목록 -> List<ClientDto>
	public List<ClientDto> search(String keyword) throws Exception{
		Connection con = getConnection();
		
		String sql = "SELECT * FROM client WHERE instr(client_id, ?) > 0 "
						+ "UNION "
						+ "SELECT * FROM client WHERE instr(client_auth, ?) > 0";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ps.setString(2, keyword);
		ResultSet rs = ps.executeQuery();
		
		//rs의 데이터를 연결이 종료되기 전에 List<ClientDto>로 변환(convert)
		List<ClientDto> list = new ArrayList<>();
		while(rs.next()) {
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

	public ClientDto get(int client_no) throws Exception {
		Connection con = getConnection();
		
		String sql = "SELECT * FROM client WHERE client_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, client_no);
		ResultSet rs = ps.executeQuery();
		
//		ClientDto cdto = 객체 or null;
		ClientDto cdto;
		if(rs.next()) {
			cdto = new ClientDto();
			
			cdto.setClient_no(rs.getInt("client_no"));
			cdto.setClient_id(rs.getString("client_id"));
			cdto.setClient_pw(rs.getString("client_pw"));
			cdto.setClient_auth(rs.getString("client_auth"));
			cdto.setClient_join(rs.getString("client_join"));
			cdto.setClient_point(rs.getInt("client_point"));
		}
		else {
			cdto = null;
		}
		
		con.close();
		
		return cdto;
	}
	
	//로그인 메소드
	// - input : 회원정보(아이디, 비밀번호)
	// - output : 회원정보(모든정보 - 6개)
	public ClientDto login(ClientDto cdto) throws Exception{
		Connection con = getConnection();
		
		String sql = "SELECT * FROM client "
							+ "WHERE client_id=? and client_pw=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, cdto.getClient_id());
		ps.setString(2, cdto.getClient_pw());
		ResultSet rs = ps.executeQuery();
		
//		ClientDto newDto = 객체 or null;
		ClientDto newDto = null;
		if(rs.next()) {
			newDto = new ClientDto();
			
			newDto.setClient_no(rs.getInt("client_no"));
			newDto.setClient_id(rs.getString("client_id"));
			newDto.setClient_pw(rs.getString("client_pw"));
			newDto.setClient_auth(rs.getString("client_auth"));
			newDto.setClient_join(rs.getString("client_join"));
			newDto.setClient_point(rs.getInt("client_point"));
		}
		
		con.close();
		
		return newDto;
	}
	
	//정보 수정 메소드
	public void edit(ClientDto cdto) throws Exception {
		Connection con = getConnection();
		
		String sql = "UPDATE client SET client_pw=? WHERE client_id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, cdto.getClient_pw());
		ps.setString(2, cdto.getClient_id());
		ps.execute();//insert와 동일하게 수행(반환형 없으니까)
		
		con.close();
	}
	
	//탈퇴 메소드
	public void delete(String client_id) throws Exception{
		Connection con = getConnection();
		
		String sql = "DELETE client WHERE client_id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, client_id);
		ps.execute();//결과가 필요하지 않으므로 insert처럼 실행
		
		con.close();
	}
}











