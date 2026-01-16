package com.password.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class PasswordLog {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int userId;
	private String currentPassword;
	private String oldPassword;
	private String oldestPassword;
	public PasswordLog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PasswordLog(int id, int userId, String currentPassword, String oldPassword, String oldestPassword) {
		super();
		this.id = id;
		this.userId = userId;
		this.currentPassword = currentPassword;
		this.oldPassword = oldPassword;
		this.oldestPassword = oldestPassword;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCurrentPassword() {
		return currentPassword;
	}
	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getOldestPassword() {
		return oldestPassword;
	}
	public void setOldestPassword(String oldestPassword) {
		this.oldestPassword = oldestPassword;
	}
	@Override
	public String toString() {
		return "PasswordLog [id=" + id + ", userId=" + userId + ", currentPassword=" + currentPassword
				+ ", oldPassword=" + oldPassword + ", oldestPassword=" + oldestPassword + "]";
	}
	
	

}
