package com.ajioorder.bean;

public class OrderInfo {
	private String name;
	private double price;
	private String address;
	public OrderInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderInfo(String name, double price, String address) {
		super();
		this.name = name;
		this.price = price;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Order [name=" + name + ", price=" + price + ", address=" + address + "]";
	}
	

}
