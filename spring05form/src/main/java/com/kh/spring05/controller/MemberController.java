package com.kh.spring05.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring05.entity.MemberDto;

@Controller
@RequestMapping("/member")//공용 주소 매핑
public class MemberController {

//	@RequestMapping(value = "/join", method=RequestMethod.GET)
	@GetMapping("/join")
	public String join() {
		return "join";
	}
//	방식1 : servlet 감성 그대로
//	@RequestMapping(value = "/join", method=RequestMethod.POST)
/*	@PostMapping("/join")
	public String join2(HttpServletRequest req) {
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String nick = req.getParameter("nick");
		
		System.out.println("id = " +id);
		System.out.println("pw = " +pw);
		System.out.println("nick = " +nick);
		return "join_finish";
	}*/
	
// 방식2: @RequestParam 사용	
/*	@PostMapping("/join")
	public String join2( 
			@RequestParam String id, 
			@RequestParam String pw, 
			@RequestParam(required = false) String nick) {
		System.out.println("id = " +id);
		System.out.println("pw = " +pw);
		System.out.println("nick = " +nick);
		
		return "join_finish";
	}*/
	
// 방식3: 클래스 주고 자동으로 받게 하기: @ModelAttribute
	@PostMapping("/join")
	public String join2(@ModelAttribute MemberDto mdto) {
		System.out.println("id = "+mdto.getId());
		System.out.println("pw = "+mdto.getPw());
		System.out.println("nick = "+mdto.getNick());
		
		return "join_finish";
	}
	
	
}



