package com.spring.springmvc.threeLayerArch.exceptions;

public class UserNotFoundException extends RuntimeException{
	public UserNotFoundException(String msg) {
		super(msg);
	}
}
