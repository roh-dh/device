package db.Test;

import db.beans.dao.MemberDao;
import db.beans.dto.MemberDto;

public class Test02 {
	public static void main(String[] args) throws Exception {

// 로그인 프로그램

// 준비 : (아이디,비밀번호) --> 회원정보(MemberDto)  
		MemberDto mdto = new MemberDto();
		mdto.setMember_id("testuser");
		mdto.setMember_pw("test1234");

//		처리
		MemberDao mdao = new MemberDao();
		boolean success = mdao.login(mdto);
		
//		출력
		if(success) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}
}
