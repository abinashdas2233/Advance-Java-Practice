package com.zomatologin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogInController {
	@RequestMapping("/login")
	public String redirectLogin() {
		//redirect to login page
		System.out.println("inside controller");
		return "loginpage";
	}

}
