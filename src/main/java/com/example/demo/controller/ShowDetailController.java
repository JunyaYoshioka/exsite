package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Item;
import com.example.demo.servise.ShowitemListService;

@Controller
@RequestMapping("/showDetail")
public class ShowDetailController {
	@Autowired
	public ShowitemListService showitemListService;
	
	

	@RequestMapping("")
	public String showDetail(String id, Model model) {
		Item item = showitemListService.showDetail(Integer.parseInt(id));
		model.addAttribute("item", item);
		return "item_detail";
	}
}
