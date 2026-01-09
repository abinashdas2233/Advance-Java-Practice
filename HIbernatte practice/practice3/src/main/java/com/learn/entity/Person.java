package com.learn.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Person {
	@Id
	int id;
	String name;
	@OneToMany
	List<Bikes>bikeList;
	public Person() {
		super();
	}
	public Person(int id, String name, List<Bikes> bikeList) {
		super();
		this.id = id;
		this.name = name;
		this.bikeList = bikeList;
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
	public List<Bikes> getBikeList() {
		return bikeList;
	}
	public void setBikeList(List<Bikes> bikeList) {
		this.bikeList = bikeList;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", bikeList=" + bikeList + "]";
	}
	
	

}
