package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Item;
import com.example.demo.domain.Topping;
import com.example.demo.servise.ShowItemDetailService;
import com.example.demo.servise.ShowitemListService;

@Controller
@RequestMapping("/showDetail")
public class ShowDetailController {
	@Autowired
	public ShowitemListService showitemListService;
	
	@Autowired
	public ShowItemDetailService showItemDetailService;
	
	

	/**
	 * 商品詳細
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("")
	public String showDetail(String id, Model model) {
		Item item = showitemListService.showDetail(Integer.parseInt(id));
		
		
		List<Topping> toppingList = showItemDetailService.findTopiing();
		
		model.addAttribute("item", item);
		model.addAttribute("toppingList", toppingList);
		
		return "item_detail";
	}
	
	
	
}
