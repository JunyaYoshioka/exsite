package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.SoppingCartForm;
import com.example.demo.servise.ShoppingCartServise;

@Controller
@RequestMapping("/shoppingCart")
public class ShoppingCartController {
	@Autowired
	private ShoppingCartServise shoppingCartServise;
//	
//	/**
//	 * 確認画面に画面遷移する
//	 * @return
//	 */
//	@RequestMapping("")
//	public String showShoppingCart() {
//		return "cart_list";
//	}
	
	@RequestMapping("/addCart")
	public String addCart(SoppingCartForm form, Integer userId, Model model) {
		shoppingCartServise.addCart(form, userId);
		
		return "cart_list";
	}
}
