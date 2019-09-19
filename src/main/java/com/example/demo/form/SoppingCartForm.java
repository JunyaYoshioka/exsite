package com.example.demo.form;

import java.util.List;

public class SoppingCartForm {

	/** アイテムID */
	private String itemId;
	private List<Integer> orderToppingList;
	private String size;
	private String quantity;
	
	
	
	public SoppingCartForm() {
		super();
	}
	public SoppingCartForm(String itemId, List<Integer> orderToppingList, String size, String quantity) {
		super();
		this.itemId = itemId;
		this.orderToppingList = orderToppingList;
		this.size = size;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ToppingForm [itemId=" + itemId + ", orderToppingList=" + orderToppingList + ", size=" + size
				+ ", quantity=" + quantity + "]";
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public List<Integer> getOrderToppingList() {
		return orderToppingList;
	}
	public void setOrderToppingList(List<Integer> orderToppingList) {
		this.orderToppingList = orderToppingList;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	
}
	
