package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SessionController {

	@GetMapping("/login")
	public String login() {
		return "login.jsp";
	}

	@GetMapping("/signup")
	public String signup() {
		return "signup.jsp";
	}
	
	@GetMapping("/forgetPassword")
	public String forgetPassword() {
		return "forgetPassword.jsp";
	}

}
