package db.insert;

import java.util.Scanner;

import db.beans.ClientDao;
import db.beans.ClientDto;

public class Test09 {
	public static void main(String[] args) throws Exception {
//		준비 : ClientDto 한 개(아이디, 비밀번호)
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 비밀번호를 입력");
		
		ClientDto cdto = new ClientDto();
		cdto.setClient_id(sc.nextLine());
		cdto.setClient_pw(sc.nextLine());
		
		sc.close();
		
//		처리
		ClientDao cdao = new ClientDao();
		cdao.regist(cdto);
		
	}
}