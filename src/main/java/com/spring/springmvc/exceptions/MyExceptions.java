package com.spring.springmvc.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class MyExceptions {

	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionHandlerNull(Model m) {
		m.addAttribute("msg","Null Pointer Exception Occured");
		return "null_page";
	}
	@ExceptionHandler(value = NumberFormatException.class)
	public String exceptionHandlerNumberFomat(Model m) {
		m.addAttribute("msg","Null Pointer Exception Occured");
		return "null_page";
	}
	@ExceptionHandler(value = Exception.class)
	public String exceptionHandlerGenericException(Model m) {
		m.addAttribute("msg","Generic Exception Occured");
		return "null_page";
	}
}
