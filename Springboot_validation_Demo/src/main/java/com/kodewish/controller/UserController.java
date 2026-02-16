package com.kodewish.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewish.request.User;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping("/customer")
public class UserController {
	@NotNull
	@PostMapping("/userdata")
	public String sendData(@RequestBody @Valid User user) {
		
		
		return "data posted Successfully";
	}

}
