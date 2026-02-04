package com.kodewish.Request;

public class Student {
	private int id;
	private String naame;
	private String address;
	public Student(int id, String naame, String address) {
		super();
		this.id = id;
		this.naame = naame;
		this.address = address;
	}
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNaame() {
		return naame;
	}
	public void setNaame(String naame) {
		this.naame = naame;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
