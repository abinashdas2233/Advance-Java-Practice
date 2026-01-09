package com.example;

public class PetrolEngine implements Engine{
	

	public PetrolEngine() {
		super();
		System.out.println("petrol engine constructor");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Petrol engine start");
		
	}

}
