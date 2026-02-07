package com.kodewish.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")

public class DemoController {
	
	@GetMapping("/univers")
	
	public String display() {
		
		return "request coming to backend";
		
	}

}
