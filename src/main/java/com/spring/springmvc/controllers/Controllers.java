package com.spring.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllers {

	
	@GetMapping("/index")
	public String indexJsp () {
		System.out.println("Welcome to First JSP Page");
		return "index";
	}
	
	@GetMapping("/main")
	public String mainHtml() {
		return "redirect:/main.html";
	}
}
