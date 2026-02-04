package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.OrderProcess;

@RestController

public class OrderProcessController {
	
	@PostMapping("/processorder")
	public ResponseEntity orderProcess(@RequestBody OrderProcess order) {
		System.out.println(order.toString());
		
		return ResponseEntity.ok("request recived,response done");
		
	}

}
