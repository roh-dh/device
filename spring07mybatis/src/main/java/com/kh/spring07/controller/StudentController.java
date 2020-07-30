package com.kh.spring07.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring07.entity.StudentDto;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private SqlSession sqlsession;
	
	
	@GetMapping("/regist")
	public String regist() {
		return "/student/regist";
	}
	
	@PostMapping("/regist")
	public String regist(@ModelAttribute StudentDto studentDto) {
		
		sqlsession.insert("menu.insert", studentDto);
		return "redirect:regist";
	}
}

