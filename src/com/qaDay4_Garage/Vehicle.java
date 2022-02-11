package com.qaDay4_Garage;

import java.util.List;

public class Vehicle {

	private double repair_cost;
	private String type;
	private int wheels;
	private String colour;
	private Boolean hasEngine;

	// Constructor
    public Vehicle(double repair_cost, String type, int wheels, String colour, Boolean hasEngine) {
		//super();
    	this.repair_cost = repair_cost;
		this.type = type;
		this.wheels = wheels;
		this.colour = colour;
		this.hasEngine = hasEngine;
	}
	//getters and setters
	public double getRepair_Cost() {
		return repair_cost;
	}
	public void setRepair_Cost(double repair_cost) {
		this.repair_cost = repair_cost;
	}
	//getters and setters
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Boolean getHasEngine() {
		return hasEngine;
	}
	public void setHasEngine(Boolean hasEngine) {
		this.hasEngine = hasEngine;
	}
	@Override
	public String toString() {
		return "Repair cost = £" + repair_cost + "]";
	}
	public static Object add(List<String> vehicles) {
		// TODO Auto-generated method stub
		return "Repair cost = £" + "]";
	}
    
}
