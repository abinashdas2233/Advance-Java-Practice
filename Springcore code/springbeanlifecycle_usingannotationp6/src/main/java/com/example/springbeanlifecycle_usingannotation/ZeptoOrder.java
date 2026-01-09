package com.example.springbeanlifecycle_usingannotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class ZeptoOrder {
	int orederId;
	String customerName;
	public int getOrederId() {
		return orederId;
	}
	public void setOrederId(int orederId) {
		this.orederId = orederId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public ZeptoOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ZeptoOrder(int orederId, String customerName) {
		super();
		this.orederId = orederId;
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "ZeptoOrder [orederId=" + orederId + ", customerName=" + customerName + "]";
	}
	
	//init method
	@PostConstruct
	public void start() {
		System.out.println("Inside start method");
	}
	//Destroy method
	@PreDestroy
	public void destroy() {
		System.out.println("inside end method");
	}

}
