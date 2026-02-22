package com.kodewish.request;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.List;

public class User {

	@NotNull(message = "name cannot be null") // this field cannot be null
	private String name;

	private String username;
	@Size(min = 6, max = 8, message = "password cannot be less than 6 and cannot be greater than 8") // size of the
																										// password lie
																										// between 6-8
	private String password;
	@Min(18) // age should be within 18-30
	@Max(30)
	private int age;
	@Positive // salary field should be contain positive value & @Negative also present
	private Double salary;
	@Digits(integer = 3, fraction = 2) // for @Digit in accountBalance there should be balance like-333.33 like this
	private Double accountBalance;
	@NotBlank(message = "email cannot be blank")
	private String email;
	@Email(message = "It should be proper email formart") // this annotation check the proper email formart
	private String corporateEmail;
	@Past(message = "dob must be past date")
	private LocalDate dob;
	@Future(message = "UserExpiry should be  future date")
	private LocalDate userExpiry;
	private List<String> hobbies;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCorporateEmail() {
		return corporateEmail;
	}

	public void setCorporateEmail(String corporateEmail) {
		this.corporateEmail = corporateEmail;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public LocalDate getUserExpiry() {
		return userExpiry;
	}

	public void setUserExpiry(LocalDate userExpiry) {
		this.userExpiry = userExpiry;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public User(String name, String username, String password, int age, Double salary, Double accountBalance,
			String email, String corporateEmail, LocalDate dob, LocalDate userExpiry, List<String> hobbies) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.age = age;
		this.salary = salary;
		this.accountBalance = accountBalance;
		this.email = email;
		this.corporateEmail = corporateEmail;
		this.dob = dob;
		this.userExpiry = userExpiry;
		this.hobbies = hobbies;
	}

	public User() {
		super();
	}

}
