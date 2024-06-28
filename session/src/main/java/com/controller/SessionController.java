package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;

@Controller
public class SessionController {

	// login method
	@GetMapping("/login")
	public String login() {
		return "login.jsp";
	}

	// signup method
	@GetMapping("/signup")
	public String signup() {
		return "signup.jsp";
	}

	// forgetpassword method
	@GetMapping("/forgetPassword")
	public String forgetPassword() {
		return "forgetPassword.jsp";
	}

	// save method
	@PostMapping("/saveuser")
	public String saveUser(UserBean userBean) {
		
		System.out.println(userBean.getName());
		System.out.println(userBean.getEmail());
		System.out.println(userBean.getPassword());
		
		return "login.jsp";
	}

}
