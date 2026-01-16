package com.password.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.password.dao.RegistrationDao;
import com.password.entity.UserInfo;

@Service
public class RegistrationServices {
	@Autowired
	RegistrationDao ds;
	
	public String registerUser(UserInfo us) {
		ds.userRegister(us);
		
		return "register done";
	}

}
