package com.practicee.serversidevalidation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practicee.serversidevalidation.entities.Login;

import jakarta.validation.Valid;


@Controller
public class MyController {
	
	@RequestMapping("/")
	public String Home(Model model) {
		System.out.println("** Home method");
		model.addAttribute("logindata", new Login());
		return "loginform";
	}
	
	@PostMapping("/process")
	public String Process(@Valid @ModelAttribute("logindata") Login logindata, BindingResult validationResult) {
		System.out.println(logindata);
		
		if (validationResult.hasErrors()) {
			System.out.println(validationResult);
			return "loginform";
		}
		
		return "success";
	}
}
