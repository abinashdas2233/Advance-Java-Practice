package com.example;

public class Order {
	int orderId;
	String itemName;
	public Order(int orderId, String itemName) {
		super();
		this.orderId = orderId;
		this.itemName = itemName;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	//init method
	public void init() {
		System.out.println("Inside inti method");
	}
	
	//destroy method
	public void destroy() {
		System.out.println("Inside destroy method");
	}

}
