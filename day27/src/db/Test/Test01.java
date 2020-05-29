package db.Test;

import db.beans.dao.MemberDao;
import db.beans.dto.MemberDto;

public class Test01 {
	public static void main(String[] args) throws Exception {
//	회원가입
//	준비 : memberDto
	MemberDto mdto = new MemberDto();
	mdto.setMember_id("dh93");
	mdto.setMember_pw("shfhfhfhf2345");
	mdto.setMember_nick("노로로a");
	mdto.setMember_phone("01052323286");
	mdto.setMember_birth("1993-1211");
	
//	처리
	MemberDao mdao = new MemberDao();
	mdao.regist(mdto);
		
//	출력
	System.out.println("가입이 완료되었습니다.");
	
	}
}
