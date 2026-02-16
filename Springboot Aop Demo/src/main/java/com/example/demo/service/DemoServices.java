package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoServices {
	
	public String display() {
		return "success response from backend to client";
	}

}
