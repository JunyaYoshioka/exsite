package com.example.demo.domain;

public class OrderTopping {

	//注文トッピングのid
	private Integer id;
	//トッピング自体のid
	private Integer toppngId;
	//注文商品のid
	private Integer orderItemId;
	//トッピングのオブジェクト
	private Topping topping;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getToppngId() {
		return toppngId;
	}
	public void setToppngId(Integer toppngId) {
		this.toppngId = toppngId;
	}
	public Integer getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}
	public Topping getTopping() {
		return topping;
	}
	public void setTopping(Topping topping) {
		this.topping = topping;
	}
	@Override
	public String toString() {
		return "OrderTopping [id=" + id + ", toppngId=" + toppngId + ", orderItemId=" + orderItemId + ", topping="
				+ topping + "]";
	}
	
	
	
	
}
