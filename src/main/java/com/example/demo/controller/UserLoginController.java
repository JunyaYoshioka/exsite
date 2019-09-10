package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;
import com.example.demo.form.RegisterUserForm;
import com.example.demo.servise.RegisterUserService;

@Controller
@RequestMapping("/login")
public class UserLoginController {
	@Autowired
	private RegisterUserService registerUserService;
	
	@ModelAttribute
	public RegisterUserForm loginAdministratorForm() {
		return new RegisterUserForm();
	}
	
	@RequestMapping("")
	public String toLogin() {
		return "login";
	}
	
	
	@RequestMapping("/register")
	public String Register() {
		return "redirect:/registerUser";
	}
	
	@RequestMapping("/userLogin")
	public String UserLogin(RegisterUserForm form, BindingResult result, Model model) {
		
		User us = registerUserService.findByEmailAndPassword(form.getEmail(), form.getPassword());
		if(us == null) {
			
			model.addAttribute("errorMessage", "メールアドレスまたはパスワードが不正です。");
			System.out.println(model);
			return toLogin();
		}
		return "redirect:/showItemList";
	}
}
