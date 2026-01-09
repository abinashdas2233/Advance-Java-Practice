package com.zomatologin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

		
		
		@RequestMapping("/login")
		public String redirectLogin() {
			//redirect to login page
			System.out.println("inside controller");
			return "loginpage";
		}

		@RequestMapping("/logdata")
		public String loginAuth(@RequestParam("userId")String userId,@RequestParam("password")String password) {
			//redirect to login page
			System.out.println("Name="+userId+ "password="+password);
			return "loginsuccess";
		}

}
