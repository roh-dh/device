package db.select;

import java.util.List;
import java.util.Scanner;

import db.beans.ClientDao;
import db.beans.ClientDto;

public class Test14_1 {
	public static void main(String[] args) throws Exception {
//		목표 : ClientDao를 이용하여 검색(search)을 수행
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 아이디 입력 : ");
		String keyword = sc.nextLine();
		sc.close();
		
		ClientDao cdao = new ClientDao();
		List<ClientDto> list = cdao.search(keyword);
		
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