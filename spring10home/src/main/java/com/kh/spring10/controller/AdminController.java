package com.kh.spring10.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring10.entity.MemberDto;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private SqlSession sqlSession;
	
	
	//view에 전달하고싶은 데이터가 있으면 
	//Model이라는 변수를 선언하고 추가
	@GetMapping("/list")
	public String list(Model model) {
		List<MemberDto> list = sqlSession.selectList("member.getList");
		model.addAttribute("list", list);
		return "admin/list";
		
	}
	
	
}
