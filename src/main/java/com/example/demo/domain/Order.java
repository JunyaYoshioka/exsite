package com.example.demo.domain;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Order {
//orderを管理しているid
	private Integer id;
	// 登録している人のid
	private Integer userId;
	// 商品の注文後か注文前かの情報が入る
	/** 状態 */
	private Integer status;
	// カートの中に入っている合計金額
	/** 合計金額 */
	private Integer totalPrice;
	// 注文が確定された日
	/** 注文日 */
	private Date orderDate;
	//
	/** 宛先指名 */
	private String desinationName;
	/** 宛先Eメール */
	private String desinationEmail;
	/** 宛先郵便番号 */
	private String desinationZipcode;
	/** 宛先住所 */
	private String desinationAddress;
	/** 宛先TEL */
	private String desinationTel;
	/** 配達時間 */
	private Timestamp deliveryTime;
	/** 支払い方法 */
	private Integer paymentMethod;
	/** ユーザー */
	private User user;
	private List<OrderItem> orderItemList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getDesinationName() {
		return desinationName;
	}

	public void setDesinationName(String desinationName) {
		this.desinationName = desinationName;
	}

	public String getDesinationEmail() {
		return desinationEmail;
	}

	public void setDesinationEmail(String desinationEmail) {
		this.desinationEmail = desinationEmail;
	}

	public String getDesinationZipcode() {
		return desinationZipcode;
	}

	public void setDesinationZipcode(String desinationZipcode) {
		this.desinationZipcode = desinationZipcode;
	}

	public String getDesinationAddress() {
		return desinationAddress;
	}

	public void setDesinationAddress(String desinationAddress) {
		this.desinationAddress = desinationAddress;
	}

	public String getDesinationTel() {
		return desinationTel;
	}

	public void setDesinationTel(String desinationTel) {
		this.desinationTel = desinationTel;
	}

	public Timestamp getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Timestamp deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public Integer getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(Integer paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(List<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", status=" + status + ", totalPrice=" + totalPrice
				+ ", orderDate=" + orderDate + ", desinationName=" + desinationName + ", desinationEmail="
				+ desinationEmail + ", desinationZipcode=" + desinationZipcode + ", desinationAddress="
				+ desinationAddress + ", desinationTel=" + desinationTel + ", deliveryTime=" + deliveryTime
				+ ", paymentMethod=" + paymentMethod + ", user=" + user + ", orderItemList=" + orderItemList + "]";
	}

}
