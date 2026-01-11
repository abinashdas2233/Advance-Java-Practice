package com.amazonreseller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavigationController {
	@RequestMapping("/registration")
	public String redirectRegistrationPage() {
		return "RegistrationPage";

	}

	@RequestMapping("/home")
	public String redirectHome() {
		return "Home";

	}
	
	@RequestMapping("/create")
	public String redirectcreate() {
		return "createstock";

	}
	
	@RequestMapping("/update")
	public String redirectUpdate() {
		return "updatestock";

	}
	@RequestMapping("/delete")
	public String redirectDelete() {
		return "deletestock";

	}


}
