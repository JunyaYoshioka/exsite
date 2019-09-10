package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/showItemList")
public class ShowItemListController {
	
	@RequestMapping("")
	public String index() {
		return "item_list";
	}
}
