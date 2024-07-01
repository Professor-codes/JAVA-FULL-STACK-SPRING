package com.controller;

import com.bean.UserBean;
import com.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SessionController {

	@Autowired
	UserDao userDao;
	
	@GetMapping("/signup")
	public String getSignupPage() {
		return "ecomSignup";
	}

	@PostMapping("/usersignup")
	public String userSignup(UserBean userBean, Model model) {
		
		// error statement
		boolean isError = false;

		// regex statement
		String nameRegex = "[a-zA-Z]+";
		String emailRegex = "[a-z0-9]+@[a-z]{5}+\\.[a-z]{2,3}";
		String passwordRegex = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[.@*$#].*[.@*$#])[a-zA-Z0-9.@*$#]+$";

		// validation
		if (userBean.getUsername() == null || userBean.getUsername().trim().length() == 0) {
			isError = true;
			model.addAttribute("userNameError", "Please enter your name.");
		} else if (userBean.getUsername().matches(nameRegex) == false) {
			isError = true;
			model.addAttribute("userNameError", "Enter valid name.");
		} else {
			model.addAttribute("userNameValue", userBean.getUsername());
		}

		if (userBean.getEmail() == null || userBean.getEmail().trim().length() == 0) {
			isError = true;
			model.addAttribute("userEmailError", "Please enter your email.");
		} else if (userBean.getEmail().matches(emailRegex) == false) {
			isError = true;
			model.addAttribute("userEmailError", "Enter valid email.");
		} else {
			model.addAttribute("userEmailValue", userBean.getEmail());
		}

		if (userBean.getPassword() == null || userBean.getPassword().trim().length() == 0) {
			isError = true;
			model.addAttribute("userPasswordError", "Please enter your password.");
		} else if (userBean.getPassword().matches(passwordRegex) == false) {
			isError = true;
			model.addAttribute("userPasswordError", "Enter valid password.");
		} else {
			model.addAttribute("userPasswordValue", userBean.getPassword());
		}

		if (isError == true) {
			return "ecomSignup";
		}
		
		// database connection
		userDao.insertUser(userBean);
		
		return "home";
	}

}
