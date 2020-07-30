package com.kh.spring09.controller;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring09.entity.MenuDto;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private SqlSession sqlSession;
	
	@GetMapping("/insert")
	public String insert() {
//		return "/WEB-INF/views/menu/insert.jsp";
		return "menu/insert";
	}
	
	@PostMapping("/insert")
//	public String insert(@RequestParam String name, @RequestParam int price) {
	public String insert(@ModelAttribute MenuDto menuDto) {
		sqlSession.insert("menu.insert", menuDto);
		
		return "redirect:insert";
	}
	//목록 처리
	//뷰(view)에 전달하고 싶은 데이터가 있다면
	//Model이라는 매개변수를 선언한 뒤 추가
	//model.addAttribute("이름",값);
	@GetMapping("/list")
	public String list(Model model) {
		List<MenuDto> list = sqlSession.selectList("menu.getList");
		model.addAttribute("list", list);
		return "menu/list";
		
		
	}
	
}





