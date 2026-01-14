package com.zeptoorder.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ZeptoOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String itmName;
	private String qty;
	private String price;
	private String description;
	public ZeptoOrder(String itmName, String qty, String price, String description) {
		super();
		this.itmName = itmName;
		this.qty = qty;
		this.price = price;
		this.description = description;
	}
	@Override
	public String toString() {
		return "ZeptoOrder [itmName=" + itmName + ", qty=" + qty + ", price=" + price + ", description=" + description
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
	public ZeptoOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

}
