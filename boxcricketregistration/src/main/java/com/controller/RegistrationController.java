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

		// + : minimum 1 time and maximum n times
		String alphabetRegex = "[a-zA-Z]+";
		
		// common object for send data 
		model.addAttribute("registrationBean", registrationBean);

		// validation of name
		if (registrationBean.getName() == null || registrationBean.getName().trim().length() == 0) {
			isError = true;
			model.addAttribute("nameError", "Please enter your name!");
		} 
		// validation using regex for name
		else if (registrationBean.getName().matches(alphabetRegex) == false) {
			isError = true;
			model.addAttribute("nameError", "Enter valid name!");
		} 
		// prefilled value save for name
		else {
			// model.addAttribute("nameValue", registrationBean.getName());
			// write this insted of above while using common object
			// ${registrationBean.name} 
		}

		// validation for playertype
		if (registrationBean.getPlayertype() == null) {
			isError = true;
			model.addAttribute("playertypeError", "Please select type of player!");
		} 
		// prefilled value save for playertype
		else {
			model.addAttribute("playertypeValue", registrationBean.getPlayertype());
		}

		// validation for food
		if (registrationBean.getFood().equals("-1")) {
			isError = true;
			model.addAttribute("foodError", "Select food to continue!");
		} 
		// prefilled value save for food
		else {
			model.addAttribute("foodValue", registrationBean.getFood());
		}
		
		// validation for drink
		if(registrationBean.getDrink()==null) {
			isError=true;
			model.addAttribute("drinkError", "Select drink to continue!");
		}
		// prefilled value save for drink
		else {
			model.addAttribute("drinkValue", registrationBean.getDrink());
		}

		
		if (isError == true) {
			return "registrationForm";
		}

		model.addAttribute("playerData", registrationBean);

		return "registrationDetails";
	}

}
