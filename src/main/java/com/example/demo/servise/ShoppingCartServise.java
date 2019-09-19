package com.example.demo.servise;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Order;
import com.example.demo.domain.OrderItem;
import com.example.demo.domain.OrderTopping;
import com.example.demo.form.SoppingCartForm;
import com.example.demo.repository.OrderItemRepository;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.OrderToppingRepository;

@Service
public class ShoppingCartServise {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private OrderItemRepository orderItemRepository;
	
	@Autowired
	private OrderToppingRepository orderToppingRepository;

	public void addCart(SoppingCartForm form, Integer userId) {

		Order order = new Order();
		order.setUserId(1);
		order.setStatus(0);
		order.setTotalPrice(0);

		OrderItem orderItem = new OrderItem();
		orderItem.setQuantity(Integer.parseInt(form.getQuantity()));
		orderItem.setSize(form.getSize());
		orderItem.setItemId(Integer.parseInt(form.getItemId()));

		List<Order> orderList = orderRepository.findOrderByuserAndStatus(1, 0);
		System.out.println(orderList.size());

		if (orderList.size() == 0) {

			Order orderDomain = orderRepository.insert(order);
			orderItem.setOrderId(orderDomain.getId());

			OrderItem orderItemDomain = orderItemRepository.insert(orderItem);
			// オーダートッピング
			List<OrderTopping> orderToppingList = new ArrayList<>();
			OrderTopping orderTopping = new OrderTopping();

			if (form.getOrderToppingList() != null) {

				for (Integer toppngId : form.getOrderToppingList()) {
					orderTopping.setToppngId(toppngId);
					orderToppingList.add(orderTopping);
					orderTopping.setOrderItemId(orderItemDomain.getId());
					orderToppingRepository.insert(orderTopping);
				}

			}

		} else {
			Order orderDomain = orderList.get(0);

			orderItem.setOrderId(orderDomain.getId());
			OrderItem orderItemDomain = orderItemRepository.insert(orderItem);
			List<OrderTopping> orderToppingList = new ArrayList<>();
			OrderTopping orderTopping = new OrderTopping();

			if (form.getOrderToppingList() != null) {

				for (Integer toppngId : form.getOrderToppingList()) {
					orderTopping.setToppngId(toppngId);
					orderToppingList.add(orderTopping);
					orderTopping.setOrderItemId(orderItemDomain.getId());
					orderToppingRepository.insert(orderTopping);
				}
			}

		}
	}

}