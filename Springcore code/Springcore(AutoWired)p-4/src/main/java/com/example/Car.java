package com.example;

public class Car {
	private Engine engine;
	
	

	public Car() {
		super();
	}

	public Car(Engine engine) {
		super();
		System.out.println("car constructor");
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	 public void drive() {
	        engine.start();   
	        System.out.println("Car is moving");
	 }

}
