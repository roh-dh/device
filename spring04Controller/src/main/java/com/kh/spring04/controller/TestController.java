package com.kh.spring04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping(value = "/")
	public String root() {
		return "index";
		
	}
	
}
