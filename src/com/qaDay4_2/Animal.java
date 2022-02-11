package com.qaDay4_2;

public class Animal {
	
	private String animalName;
    private String type;
	private int age;
	private String colour;
	
	public Animal(String animalName, String type, int age, String colour) {
		super();
		this.animalName = animalName;
		this.type = type;
		this.age = age;
		this.colour = colour;
	}
    
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}


	
	public String passDetails() {
		System.out.println(animalName + " " + type + " " + age + " and is the colour " + colour) ;
		return null;
	}
	
	@Override
	public String toString() {
		return animalName + " " + type + " age " + age
				+ " and is " + colour + "]";
	}
}




