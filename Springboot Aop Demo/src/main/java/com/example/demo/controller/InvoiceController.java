package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DemoServices;

@RestController
@RequestMapping("/note")
public class InvoiceController {
	
	@Autowired
	DemoServices services;
	
	@GetMapping("/demo")
	public String displayMessage() {
		
		return services.display();
		
		
	}


}
