package com.learn.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	int id;
	String name;
	int yop;
	public Student(int id, String name, int yop) {
		super();
		this.id = id;
		this.name = name;
		this.yop = yop;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", yop=" + yop + "]";
	}
	

}
