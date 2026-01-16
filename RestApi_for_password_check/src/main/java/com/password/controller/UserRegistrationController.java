package com.password.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.password.bean.User;
import com.password.entity.UserInfo;
import com.password.services.RegistrationServices;

@RestController
public class UserRegistrationController {
	@Autowired
	RegistrationServices rs;
	
	@PostMapping("/register")
	public String userRegister(@RequestBody User user) {
		UserInfo ui=new UserInfo();
		ui.setFirstName(user.getFirstName());
		ui.setLastName(user.getLastName());
		ui.setEmail(user.getEmail());
		ui.setPassword(user.getPassword());
		ui.setPhone(user.getPhone());
		
		rs.registerUser(ui);
		
		System.out.println(user.toString());
		
		return "Registration Done";
		
	}

}
