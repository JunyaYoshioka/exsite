package com.example.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;
import com.example.demo.form.RegisterUserForm;
import com.example.demo.servise.RegisterUserService;

@Controller
@RequestMapping("/registerUser")
public class RegisterUserController {
	@Autowired
	private RegisterUserService registerUserService;
	
	@ModelAttribute
	private RegisterUserForm insertRegisterUserForm() {
		return new RegisterUserForm();
	}
	
	@RequestMapping("")
	public String Register() {
		return "register_user";
	}
	
	
	@RequestMapping("/toRegister")
	public String toRegister() {
		return "register_user";
	}
	
	/**
	 * ユーザー登録する
	 * @param form
	 */
	@RequestMapping("/insert")
	public String insert(@Validated RegisterUserForm form, BindingResult result) {
		
		//パスワードと確認パスワードが一致しなかった時に"パスワードが一致していません"と表示させる
		if(!form.getPassword().equals(form.getInputConfirmationPassword())) {
			System.out.println(form.getInputConfirmationPassword());
			result.rejectValue("password" ,null, "パスワードが一致していません");
		}
		
		
		User userEmail = registerUserService.findByEmail(form.getEmail());
		if(userEmail != null) {
			result.rejectValue("email" ,null, "メールアドレスは既に登録されています。");
		}
		
		
		if(result.hasErrors()) {
			return toRegister();
		}
		
		User user = new User();
		BeanUtils.copyProperties(form, user);
		registerUserService.insert(user);
		return "redirect:/login";
	}
}
