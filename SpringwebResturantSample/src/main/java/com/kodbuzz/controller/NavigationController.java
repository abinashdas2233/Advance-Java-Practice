package com.kodbuzz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NavigationController {
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("displaylogin");
		return mv;
	}

}
