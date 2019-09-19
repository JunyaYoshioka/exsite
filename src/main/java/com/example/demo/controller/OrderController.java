package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

	@RequestMapping("")
	public String order() {
		return "order_confirm";
	}
	
	@RequestMapping("/finished")
	public String finished() {
		return "order_finished";
	}
}
