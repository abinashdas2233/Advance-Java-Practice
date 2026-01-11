package com.myntra.entity;

public class userDetails {
	private String userName;
	private String email;
	private String password;
	private long contactNo;
	public userDetails(String userName, String email, String password, long contactNo) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.contactNo = contactNo;
	}
	public userDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "UserDetails [userName=" + userName + ", email=" + email + ", password=" + password + ", contactNo="
				+ contactNo + "]";
	}
	

}
