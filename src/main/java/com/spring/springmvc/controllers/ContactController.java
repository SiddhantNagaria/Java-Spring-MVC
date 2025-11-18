package com.spring.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String handleForm(@RequestParam("email") String userEmail, @RequestParam("userName") String userName,
			@RequestParam("password") String pwd, Model model) {

		model.addAttribute("email", userEmail);
		model.addAttribute("username", userName);
		model.addAttribute("password", pwd);
		return "success";
	}
}
