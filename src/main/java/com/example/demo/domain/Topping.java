package com.example.demo.domain;

public class Topping {
	
	private Integer id;
	
	/** トッピングの名前 */
	private String name;
	/** Mサイズの価格 */
	private Integer priceM;
	/** Lサイズの価格 */
	private Integer priceL;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPriceM() {
		return priceM;
	}
	public void setPriceM(Integer priceM) {
		this.priceM = priceM;
	}
	public Integer getPriceL() {
		return priceL;
	}
	public void setPriceL(Integer priceL) {
		this.priceL = priceL;
	}
	@Override
	public String toString() {
		return "Topping [id=" + id + ", name=" + name + ", priceM=" + priceM + ", priceL=" + priceL + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getPriceM()=" + getPriceM() + ", getPriceL()=" + getPriceL()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
}
