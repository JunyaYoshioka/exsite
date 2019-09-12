package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Item;
import com.example.demo.form.ItemForm;
import com.example.demo.servise.ShowitemListService;

@Controller
@RequestMapping("/showItemList")
public class ShowItemListController {
	
	@Autowired
	private ShowitemListService itemListService;
	
	@ModelAttribute
	private ItemForm itemForm() {
		return new ItemForm();
	}
	
	/**
	 * 商品一覧
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("")
	public String findAllItems(Model model) {
		List<Item> itemList = itemListService.findAllItems();
		model.addAttribute("itemList", itemList);
		return "item_list";
	}
	
	/**
	 * 検索
	 * @param name
	 * @param model
	 * @return
	 */
	@RequestMapping("/serch")
	public String serchItemList(String name, Model model) {
		List<Item> itemList = itemListService.findByName(name);
		if(itemList.size() == 0) {
			return "item_list";
		}
		
		model.addAttribute("itemList", itemList);
		return "item_list";
	}
}
