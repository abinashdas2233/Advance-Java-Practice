package com.example;

public class Car {
	private IEngine engine;

	
	

	

	public IEngine getEngine() {
		return engine;
	}

	public void setEngine(IEngine engine) {
		this.engine = engine;
	}
	public void displayVehicle() {
		engine.start();
	}
	

}
