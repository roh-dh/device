package com.kh.spring06.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring06.entity.StudentDto;

@Controller
@RequestMapping("/student")
public class studentController {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@GetMapping("/regist")
	public String regist() {
		return "student/regist";
	}

	@PostMapping("/regist")
	public String regist(@ModelAttribute StudentDto studentdto) {

		String sql = "insert into student values(?,?,?,sysdate)";

		Object[] param = {studentdto.getName(), studentdto.getAge(), studentdto.getScore() };

		jdbcTemplate.update(sql, param);

		return "redirect:regist_finish";

	}

	@GetMapping("/regist_finish")
	public String regist_finish() {
		return "student/regist_finish";
	}

}
