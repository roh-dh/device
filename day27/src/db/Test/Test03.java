package db.Test;

import db.beans.dao.MemberDao;
import db.beans.dto.MemberDto;

public class Test03 {
	public static void main(String[] args) throws Exception{
//		아이디 찾기 프로그램
//		준비 : 회원정보(MemberDto)
		
		MemberDto mdto = new MemberDto();
		mdto.setMember_nick("노로롱");
		mdto.setMember_birth("1993-07-30");
		
//		처리
		MemberDao mdao = new MemberDao();
		String id = mdao.findId(mdto);
		System.out.println("id = " + id);
		
		if(id==null) {
			System.out.println("찾으시는 정보에 해당하는 아이디가 없습니다.");
		}else {
				System.out.println("찾으시는 아이디는 "+id+"입니다");
			}
		}
	}

