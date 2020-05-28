package db.update;

import db.beans.ClientDao;
import db.beans.ClientDto;

public class Test03 {
	public static void main(String[] args) throws Exception {
//		준비 : 번호, 비밀번호 --> ClientDto(회원정보)
		ClientDto cdto = new ClientDto();
		cdto.setClient_no(1);
		cdto.setClient_pw("hellojava");
		
//		처리
		ClientDao cdao = new ClientDao();
		cdao.editPassword(cdto);
		
		System.out.println("비밀번호 변경 완료");
	}
}
