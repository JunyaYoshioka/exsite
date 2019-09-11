package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Item;
import com.example.demo.servise.ShowitemListService;

@Controller
@RequestMapping("/showItemList")
public class ShowItemListController {
	
	@Autowired
	private ShowitemListService itemListService;
	
	
	
	@RequestMapping("")
	public String findAllItems(Model model) {
		List<Item> itemList = itemListService.findAllItems();
		model.addAttribute("itemList", itemList);
		return "item_list";
	}
}
