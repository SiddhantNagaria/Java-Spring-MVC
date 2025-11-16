package com.spring.springmvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllers {

	@GetMapping("/index")
	public String indexJsp(Model model) {
		System.out.println("Welcome to First JSP Page");
		model.addAttribute("name", "Siddhant Nagaria");
		model.addAttribute("id", 5114659);
		
		List<String> fr = new ArrayList<String>();
		fr.add("rohan");
		fr.add("rahul");
		fr.add("rohit");
		model.addAttribute("friends",fr);
		return "index";
	}

	@GetMapping("/about")
	public String aboutJsp() {
		System.out.println("About JSP Page");
		return "about";
	}

	@GetMapping("/main")
	public String mainHtml() {
		return "redirect:/main.html";
	}
}
