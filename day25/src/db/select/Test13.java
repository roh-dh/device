package db.select;

import java.util.List;

import db.beans.ClientDao;
import db.beans.ClientDto;

public class Test13 {
	public static void main(String[] args) throws Exception {
//		목표 : ClientDao를 이용한 조회(가능하면 정렬 순서까지 지정)
		
		ClientDao cdao = new ClientDao();
		List<ClientDto> list = cdao.getList();
		
		for(ClientDto cdto : list) {
			System.out.print(cdto.getClient_no() + " / ");
			System.out.print(cdto.getClient_id() + " / ");
			System.out.print(cdto.getClient_pw() + " / ");
			System.out.print(cdto.getClient_auth() + " / ");
			System.out.print(cdto.getClient_join() + " / ");
			System.out.print(cdto.getClient_point() + " / ");
			System.out.println();
		}
	}
}
