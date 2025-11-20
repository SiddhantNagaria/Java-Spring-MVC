package com.spring.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	@RequestMapping("/one")
	public String one() {
		System.out.println("this is handler - ONE");
		return "redirect:/two";
	}
	
	@RequestMapping("/three")
	public RedirectView three() {
		System.out.println("this is handler - THREE");
		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(false);
		redirectView.setUrl("https://www.google.com");
		return redirectView;
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("this is handler  TWO ");
		return "contact";
	}
}
