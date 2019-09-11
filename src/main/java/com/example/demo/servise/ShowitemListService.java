package com.example.demo.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Item;
import com.example.demo.repository.ItemRepository;

@Service
public class ShowitemListService {
	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> findAllItems() {
		return itemRepository.findAll();
	}
}
