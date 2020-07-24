package com.kh.spring05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring05.entity.boardDto;


@Controller
@RequestMapping("/board")
public class BoardController {

	@GetMapping("/write")
	public String write() {
		return "write";
	}
	
	@PostMapping("/write")
	public String write2(@ModelAttribute boardDto bdto) {
		System.out.println("type : "+bdto.getBoard_type());
		System.out.println("title : "+bdto.getBoard_title());
		System.out.println("content : "+bdto.getBoard_content());
		
		return "redirect:content";
	}

	@GetMapping("/content")
	public String content() {
		return "content";
	}
}
