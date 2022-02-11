package com.qaDay4_Garage;



public class Car extends Vehicle {

	// Fields
	private String make;
	private String model;
	private int age;
	private double engineSize;
	
	// Constructor	
	public Car(double repair_cost, String type, int wheels, String colour, Boolean hasEngine, String make, String model, int age,
			double engineSize) {
		super(repair_cost, type, wheels, colour, hasEngine);
		//this.repair_cost = repair_cost;
		this.make = make;
		this.model = model;
		this.age = age;
		this.engineSize = engineSize;
	}
	//getters and setters
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", age=" + age + ", engineSize=" + engineSize + "]";
	}



}
	
	

