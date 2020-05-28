package db.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Product 테이블에 있는 데이터에 접근(CRUD)하는 클래스 
 */
public class ProductDao {
	
	//연결 기능
	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
//		Connection con = DriverManager.getConnection(
//												"jdbc:oracle:thin:@localhost:1521:xe", "product", "oracle");
//		return con;
		return DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "product", "oracle");
	}

	//등록 기능
	//INSERT INTO product values(product_seq.nextval, 
	//'스크류바', '아이스크림', 1200, '2020-05-01', '2020-10-01');
	public void regist(String name, String type, int price, String made, String expire) throws Exception {
		Connection con = this.getConnection();
		
		String sql = "INSERT INTO product values(product_seq.nextval, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, name);
		ps.setString(2, type);
		ps.setInt(3, price);
		ps.setString(4, made);
		ps.setString(5, expire);
		
		ps.execute();
		
		con.close();
	}
	public void regist(ProductDto pdto) throws Exception {//pdto = 상품 정보가 담긴 객체
		Connection con = this.getConnection();
		
		String sql = "INSERT INTO product values(product_seq.nextval, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, pdto.getName());
		ps.setString(2, pdto.getType());
		ps.setInt(3, pdto.getPrice());
		ps.setString(4, pdto.getMade());
		ps.setString(5, pdto.getExpire());
		
		ps.execute();
		
		con.close();
	}
	
	//개수 확인 기능
	public int getCount() throws Exception {
		Connection con = this.getConnection();
		
		String sql = "SELECT count(*) cnt FROM product";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		rs.next();
		int count = rs.getInt(1);//rs.getInt("cnt");
		
		con.close();
		
		return count;
	}

	//상품 목록 조회 기능
	//이름 : getList
	//결과 : 상품 목록 == List<ProductDto>
	//준비물 : X
	public List<ProductDto> getList() throws Exception {
		Connection con = this.getConnection();
		
		String sql = "SELECT * FROM product ORDER BY no ASC";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		//rs는 con.close()까지만 쓸 수 있으며 연결은 가급적 빨리 종료하는 것이 좋다(성능상)
		//-> rs에 있는 데이터를 제 3의 저장소를 만들어서 복제하고 연결을 종료한 뒤 복제된 저장소를 반환
		//-> 복제할 데이터 저장소는 어떻게 설계할 것인가?(표를 어떤 형태로 저장할 것인가)
		//-> 특징 :
		//		- 데이터 개수를 알 수 없다(배열은 안됨)
		//		- 순서가 중요한가? 예 (List)
		//		- List 안에는 뭐가 들어가는가? ProductDto(상품)
		
		List<ProductDto> list = new ArrayList<>();//데이터들을 보관할 목록 저장소 생성
		while(rs.next()) {//데이터 개수만큼 반복하도록 지시
			ProductDto pdto = new ProductDto();//데이터 1개를 복사할 객체를 생성
			
//			int no = rs.getInt("no");//번호를 꺼낸다
//			pdto.setNo(no);//번호를 pdto에 설정한다
			pdto.setNo(rs.getInt("no"));//번호를 꺼내서 pdto에 설정한다
			pdto.setName(rs.getString("name"));//이름을 꺼내서 pdto에 설정한다
			pdto.setType(rs.getString("type"));//유형을 꺼내서 pdto에 설정한다
			pdto.setPrice(rs.getInt("price"));//가격을 꺼내서 pdto에 설정한다
			pdto.setMade(rs.getString("made"));//제조일을 꺼내서 pdto에 설정한다
			pdto.setExpire(rs.getString("expire"));//유통기한을 꺼내서 pdto에 설정한다
			
			list.add(pdto);//준비된 저장소에 옮겨담은 데이터 객체를 추가한다
		}
		
		con.close();
		
		//연결이 종료된 후 복제한 저장소를 반환
		return list;
	}
}

