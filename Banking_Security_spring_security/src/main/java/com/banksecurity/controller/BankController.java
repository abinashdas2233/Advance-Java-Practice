package com.banksecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tran")
public class BankController {
	@GetMapping("/deposite")
	public String deposite() {
		
		return "Deposite amount-"+String.valueOf(1000);
		
	}
	@GetMapping("/withdraw")
	public String withDraw() {
		return "withdraw amount-"+String.valueOf(1000);
	}
	@GetMapping("/contactus")
	public String contactUs() {
		return "contact us-"+"9668523794";
	}
	
	@GetMapping("/about")
 public String aboutUs() {
		return "Hdfc Bank";
	}
	

}
