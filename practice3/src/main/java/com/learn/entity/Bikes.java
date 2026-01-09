package com.learn.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Bikes {
	@Id
	int model;
	String brand;
	@ManyToOne
	Person person;
	public Bikes(int model, String brand, Person person) {
		super();
		this.model = model;
		this.brand = brand;
		this.person = person;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Bikes [model=" + model + ", brand=" + brand + ", person=" + person + "]";
	}
	

}
