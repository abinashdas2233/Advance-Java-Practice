package com.myntra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myntra.entity.userDetails;

@Controller
public class ProfileController {
	@RequestMapping("/registerpage")
	public String redirectRegisterPage() {
		System.out.println("inside redirect method");
		return "register";
	}
	
	@PostMapping("/registerForm")
	public String userRegisterAuthentication(@ModelAttribute userDetails user, Model model) {

	    String userId = ProfileController.generateUserId(
	                        user.getUserName(),
	                        user.getContactNo());
	    System.out.println("user id"+userId);
	    model.addAttribute("displayUserId", userId);
	    return "logginSuccess";
	}

	public static String generateUserId(String name, long contactNumber) {

        if (name == null || name.trim().isEmpty() || contactNumber <= 0) {
            return "INVALID_INPUT";
        }

        // Convert long to String
        String contactStr = String.valueOf(contactNumber);

        // Take first 3 letters of name
        String namePart = name.trim()
                              .substring(0, Math.min(3, name.length()))
                              .toUpperCase();

        // Take last 4 digits of contact number
        String contactPart = contactStr.substring(contactStr.length() - 4);

        return namePart + "_" + contactPart;
    }
	

}
