package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;

@Controller
public class SessionController {

	// login method
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	// sign up method
	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}

	// forget password method
	@GetMapping("/forgetPassword")
	public String forgetPassword() {
		return "forgetPassword";
	}

	// save method
	@PostMapping("/saveuser")
	public String saveUser(UserBean userBean, Model model) {

		System.out.println(userBean.getName());
		System.out.println(userBean.getEmail());
		System.out.println(userBean.getPassword());

		model.addAttribute("userData", userBean);

		return "home";
	}

}
