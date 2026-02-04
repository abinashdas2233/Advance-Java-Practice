package com.banksecurity.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tran")
public class BankController {
	@PostMapping("/deposite")
	public String deposite() {
		
		return String.valueOf(1000);
		
	}

}
