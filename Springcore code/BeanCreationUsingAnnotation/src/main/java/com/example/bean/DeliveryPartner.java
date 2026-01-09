package com.example.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DeliveryPartner {

    @Value("DP101")
    private String patnerId;

    @Value("Zomato Delivery")
    private String name;

	@Override
	public String toString() {
		return "DeliveryPartner [patnerId=" + patnerId + ", name=" + name + "]";
	}
}

	
	


