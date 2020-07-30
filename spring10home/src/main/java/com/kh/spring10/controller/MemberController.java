package com.kh.spring10.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring10.entity.MemberDto;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private SqlSession sqlSession;
	
	@GetMapping("/join")
	public String join() {
		return "member/join";
	}
	
	@PostMapping("/join")
	public String join(@ModelAttribute MemberDto memberDto) {
		
		//아이디에 해당하는 회원이 이미있는지 조회
		//- 있으면 정보가 나오고 없으면 null
		MemberDto find =sqlSession.selectOne(
				"member.get", memberDto.getMember_id()); 
		
		if(find==null) {
			sqlSession.insert("member.insert", memberDto);
			return "redirect:join_finish";
			
		} else {
			return "redirect:join?error";
		}
		

	}
	
	@GetMapping("/join_finish")
	public String join_finish() {
		return "member/join_finish";
		
	}
}
