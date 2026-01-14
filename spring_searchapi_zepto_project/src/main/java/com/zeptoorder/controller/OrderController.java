package com.zeptoorder.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zeptoorder.bean.Product;
import com.zeptoorder.request.SearchProduct;
import com.zeptoorder.service.OrderServices;

@RestController
public class OrderController {
	
	@Autowired
	OrderServices ors;
	
	@PostMapping("/postorder")
	public String postOrder(@RequestBody Product product) {
		
		System.out.println(product.toString());
		ors.postService(product);
		
		
		return "Done";
		
	}
	
	
	
	
	
	
	

}
