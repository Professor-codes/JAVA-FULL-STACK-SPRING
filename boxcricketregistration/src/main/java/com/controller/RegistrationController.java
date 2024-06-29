package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.RegistrationBean;

@Controller
public class RegistrationController {

	@GetMapping("/registrationform")
	public String getRegistrationForm() {
		return "registrationForm";
	}

	@PostMapping("/registeruser")
	public String saveRegistrationForm(RegistrationBean registrationBean, Model model) {

		// System.out.println(registrationBean.getName());
		// System.out.println(registrationBean.getPlayertype());
		// System.out.println(registrationBean.getFood());
		// System.out.println(registrationBean.getDrink());

		boolean isError = false;

		if (registrationBean.getName() == null || registrationBean.getName().trim().length() == 0) {
			isError = true;
			model.addAttribute("nameError", "Please enter your name!");
		}
		if (registrationBean.getPlayertype() == null) {
			isError = true;
			model.addAttribute("playertypeError", "Please select type of player!");
		}
		if (registrationBean.getFood().equals("-1")) {
			isError = true;
			model.addAttribute("foodError", "Please select food preference!");
		}

		if (isError == true) {
			return "registrationForm";
		}

		model.addAttribute("playerData", registrationBean);

		return "registrationDetails";
	}

}
