package com.kodewish.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.kodewish.Request.Student;

@RestController
public class MainController {
	
	@PostMapping("/link")
	public void Display(@RequestBody Student s) {
		System.out.println("Displaying schedule demo");
		System.out.println(s.getNaame()+"->"+s.getId());
	}
	@Scheduled(initialDelay = 2000,fixedDelay = 3000)
	public void wish() {
		System.out.println("Good morning");
	}

}
