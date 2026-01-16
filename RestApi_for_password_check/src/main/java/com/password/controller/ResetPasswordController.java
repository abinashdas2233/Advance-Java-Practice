package com.password.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.password.bean.ResetPasswordBean;
import com.password.services.PasswordServices;

@RestController
public class ResetPasswordController {
	@Autowired 
	PasswordServices psr;
	@PostMapping("/resetp")
	public String passwordReset(@RequestBody ResetPasswordBean pw) {
		System.out.println(pw.toString());
		String msg=psr.resetPassWord(pw);
		return msg;
		
	}

}
