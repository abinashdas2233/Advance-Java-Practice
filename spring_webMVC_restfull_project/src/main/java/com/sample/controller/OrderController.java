package com.sample.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.bean.ZeptoOrder;
@RestController
public class OrderController {
	@PostMapping("/ordermove")
	public String acceptOrder(@RequestBody ZeptoOrder order) {
		
		System.out.println(order.toString());
		
		return "response from backend";
	}

}
