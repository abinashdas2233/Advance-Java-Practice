package com.amazonreseller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.amazonreseller.entity.UserDetails;

@Controller
public class UserAuthentication {
	@PostMapping("/registrationSubmit")
	public String RegistrationSubmit(@ModelAttribute UserDetails user,Model model) {
		System.out.println(user.toString());
		
		 String userId = UserAuthentication.generateUserId(
                 user.getUserName(),
                 user.getContactNo());
System.out.println("user id"+userId);
model.addAttribute("displayUserId", userId);
		
		return "registrationSuccess";
	}
	
	
	public static String generateUserId(String name, String contactNumber) {

        if (name == null || name.trim().isEmpty() || contactNumber.length() <= 0) {
            return "INVALID_INPUT";
        }

        // Convert long to String
        String contactStr =contactNumber;

        // Take first 3 letters of name
        String namePart = name.trim()
                              .substring(0, Math.min(3, name.length()))
                              .toUpperCase();

        // Take last 4 digits of contact number
        String contactPart = contactStr.substring(contactStr.length() - 4);

        return namePart + "_" + contactPart;
    }

}
