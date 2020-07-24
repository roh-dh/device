package com.kh.spring03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //컨트롤러임을 명시(등록)
public class TestController {

	//	메소드를 만들어서 요청에 대한 처리내용을 작성
	// - 메소드는 무조건 public으로 구현
	// - 반환데이터는 반드시 연결될 주소가 포함
	// - 매개변수는 있어도 되고 없어도 된다.
	// - 이름은 마음대로

	@RequestMapping(value = "/comebackhome")
	public String home() {
		return "/WEB-INF/views/home.jsp";
	}

	@RequestMapping(value = "/test")
	public String test() {
		return "/WEB-INF/views/hohaho.jsp";
	}
	@RequestMapping(value = "/yahoo")
	public String yahoo() {
		return "WEB-INF/views/yahoo.jsp";
	}
}
