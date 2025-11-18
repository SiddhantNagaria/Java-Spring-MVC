package com.spring.springmvc.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

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
		model.addAttribute("friends", fr);
		return "index";
	}

	@GetMapping("/about")
	public String aboutJsp() {
		System.out.println("About JSP Page");
		return "about";
	}

//	@GetMapping("/main")
//	public String mainHtml() {
//		return "redirect:/index.html";
//	}

	@GetMapping("/help")
	public ModelAndView helpJsp() {
		System.out.println("this is help page");
		ModelAndView mav = new ModelAndView();
		// setting data
		mav.addObject("name", "rahul");
		mav.addObject("roll", 123);
		LocalDateTime now = LocalDateTime.now();
		mav.addObject("time", now);
		// set view
		mav.setViewName("help");
		return mav;
	}

	@GetMapping("/jspel")
	public ModelAndView jspelJSp() {
		System.out.println("this is jspel page");
		ModelAndView mav = new ModelAndView();
		// setting data
		mav.addObject("name", "rahul");
		mav.addObject("roll", 123);
		LocalDateTime now = LocalDateTime.now();
		mav.addObject("time", now);
		// set view
		mav.setViewName("help");
		// marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(34);
		list.add(56);
		list.add(87);
		mav.addObject("marks", list);
		return mav;
	}
}
