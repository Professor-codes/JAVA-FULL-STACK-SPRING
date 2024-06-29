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
		
		model.addAttribute("playerData", registrationBean);
		
		return "registrationDetails";
	}

}
