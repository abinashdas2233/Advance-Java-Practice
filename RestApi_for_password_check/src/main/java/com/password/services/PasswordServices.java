package com.password.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.password.bean.ResetPasswordBean;
import com.password.dao.ResetPasswordDao;
import com.password.entity.PasswordLog;
import com.password.exception.DuplicatePasswordException;



@Service
public class PasswordServices {
	@Autowired
	ResetPasswordDao repo;
	public String resetPassWord(ResetPasswordBean passwordbean) {
		String email=passwordbean.getEmail();
		PasswordLog log=repo.getPasswordLogEntity(email);
		
		
		String newPassword = passwordbean.getNewPassword();
		String currentPassword = log.getCurrentPassword();
		String oldPassword = log.getOldPassword();
		String oldestPassword = log.getOldestPassword();
		
		
		if (newPassword.equalsIgnoreCase(currentPassword)) {
			throw new DuplicatePasswordException("new password is same as current password");
		} 
		
		
		
		else {
			if (oldPassword == null) {
				return repo.updatePassword(newPassword, log);
			}
			else if (newPassword.equalsIgnoreCase(oldPassword)) {
				throw new DuplicatePasswordException("your password must not be your previous 3 passwords");
			} 
			else {
				if (oldestPassword == null) {
					return repo.updatePassword(newPassword, log);
				} 
				else if (newPassword.equalsIgnoreCase(oldestPassword)) {
					throw new DuplicatePasswordException("your password must not be your previous 3 passwords");
				} 
				else {
					return repo.updatePassword(newPassword, log);
				}
			}
		}
	}
		
		
	}


