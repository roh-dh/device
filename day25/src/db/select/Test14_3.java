package db.select;

import java.util.List;
import java.util.Scanner;

import db.beans.ClientDao;
import db.beans.ClientDto;

public class Test14_3 {
	public static void main(String[] args) throws Exception {
//		목표 : ClientDao를 이용하여 검색(search)을 수행
		String column = "client_auth";
		String keyword = "일반";
		int duration = 365;//최근 1년(일주일:7, 한달:30, 6개월:180, ...)
		
		ClientDao cdao = new ClientDao();
		List<ClientDto> list = cdao.search(keyword, column, duration);
		
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