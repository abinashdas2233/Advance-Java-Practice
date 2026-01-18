package com.example.demo.request;

public class OrderProcess {
	private String itemName;
	private double amount;
	private String status;
	public OrderProcess() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderProcess(String itemName, double amount, String status) {
		super();
		this.itemName = itemName;
		this.amount = amount;
		this.status = status;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "OrderProcess [itemName=" + itemName + ", amount=" + amount + ", status=" + status + "]";
	}
	
	
	

}
