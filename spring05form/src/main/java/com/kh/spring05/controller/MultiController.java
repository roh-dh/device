package com.kh.spring05.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/multi")
public class MultiController {

	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
	
	//fruit=apple&fruit=bannana&fruit=strawberry 형태의 파라미터
	@PostMapping("/test")
//	public String test2(@RequestParam String[] fruit) {
	public String test2(@RequestParam List<String> fruit) {
		for(String f : fruit) {
			System.out.println("과일 이름 : " + f);
		}
		return "redirect:test";
}
}