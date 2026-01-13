package com.ajioorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ajioorder.bean.OrderInfo;
import com.ajioorder.service.OrderServices;

@Controller
public class OrderController {
	@Autowired
	OrderServices orderserv;
	
	@RequestMapping("/orderpage")
	public String redirectOrderPage() {
		return "orderform";
	}
	@PostMapping("/ordersubmit")
	public String acceptOrder(@ModelAttribute OrderInfo order) {
		System.out.println(order);
		orderserv.storeData(order);
		return "ordersuccess";
	}

}
