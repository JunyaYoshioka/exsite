package com.example.demo.domain;

import java.util.List;

public class OrderItem {
	
	//注文商品のid
	private Integer id;
	//商品のid
	private Integer itemId;
	//注文情報のid
	private Integer orderId;
	//ピザの枚数
	private Integer quantity;
	//ピザのサイズ
	private String size;
	//データーベースにはない値
	//itemのオブジェクト
	private Item item;
	//注文したトッピングの情報が入っている
	private List<OrderTopping> orderToppimngList;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public List<OrderTopping> getOrderToppimngList() {
		return orderToppimngList;
	}
	public void setOrderToppimngList(List<OrderTopping> orderToppimngList) {
		this.orderToppimngList = orderToppimngList;
	}
	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", itemId=" + itemId + ", orderId=" + orderId + ", quantity=" + quantity
				+ ", size=" + size + ", item=" + item + ", orderToppimngList=" + orderToppimngList + "]";
	}
	
	
	
}
