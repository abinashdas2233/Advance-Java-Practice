package com.zeptoorder.bean;

public class Product {
	private String itmName;
	private String qty;
	private String price;
	private String description;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String itmName, String qty, String price, String description) {
		super();
		this.itmName = itmName;
		this.qty = qty;
		this.price = price;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Product [itmName=" + itmName + ", qty=" + qty + ", price=" + price + ", description=" + description
				+ "]";
	}
	public String getItmName() {
		return itmName;
	}
	public void setItmName(String itmName) {
		this.itmName = itmName;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
