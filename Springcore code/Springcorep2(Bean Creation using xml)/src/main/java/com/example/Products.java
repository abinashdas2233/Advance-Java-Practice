package com.example;

public class Products {
	private String srlNo;
	private String prodName;
	private int price;
	public String getSrlNo() {
		return srlNo;
	}
	public void setSrlNo(String srlNo) {
		this.srlNo = srlNo;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Products(String srlNo, String prodName, int price) {
		super();
		this.srlNo = srlNo;
		this.prodName = prodName;
		this.price = price;
	}
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

}
