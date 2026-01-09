package com.example;

public class Items {
	private String srlNo;
	private String itemName;
	private int price;
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSrlNo() {
		return srlNo;
	}
	public void setSrlNo(String srlNo) {
		this.srlNo = srlNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Items(String srlNo, String itemName, int price) {
		super();
		this.srlNo = srlNo;
		this.itemName = itemName;
		this.price = price;
	}
	

}
