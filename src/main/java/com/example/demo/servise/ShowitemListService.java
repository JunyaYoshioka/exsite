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
	
	/**
	 * 商品一覧
	 * @return
	 */
	public List<Item> findAllItems() {
		return itemRepository.findAll();
	}
	
	
	/**
	 * @param id
	 * @return
	 */
	public Item showDetail(Integer id) {
		Item item = itemRepository.load(id);
		return item;
	}
	
	public List<Item> findByName(String name){
		return itemRepository.findByName(name);
	}
	
}
