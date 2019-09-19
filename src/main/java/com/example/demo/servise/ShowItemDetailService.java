package com.example.demo.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Topping;
import com.example.demo.repository.ToppingRepository;

@Service
public class ShowItemDetailService {

	@Autowired
	public ToppingRepository toppingRepository;
	
	public List<Topping> findTopiing(){
		List<Topping> toppingDetaolList = toppingRepository.findAllTopping();
		return toppingDetaolList;
	}
}
