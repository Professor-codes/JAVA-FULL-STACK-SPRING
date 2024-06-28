package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.ValueBean;

@Controller
public class CalculateController {

	@GetMapping("/")
	public String addNumber() {
		return "input";
	}

	@PostMapping("/addvalue")
	public String result(ValueBean valueBean, Model model) {

		System.out.println(valueBean.getFirstvalue());
		System.out.println(valueBean.getSecondvalue());
		System.out.println(valueBean.getResult());

		model.addAttribute("valueData", valueBean);

		return "output";
	}

}
