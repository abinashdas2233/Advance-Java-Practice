package com.kodewish.request;



import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

public class User {

   @NotNull(message = "name cannot be null")
    private String name;

    private String username;
    private String password;
    private int age;
    private Double salary;
    private Double accountBalance;
    private String email;
    private String corporateEmail;
    private LocalDate dob;
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
