package com.qaDay4_2;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Animal("Lenny","Lion", 4, "sandy brown");
		Animal animal2 = new Animal("Percy","Penguin", 2, "Black/White");

		animal.passDetails();
		animal2.passDetails();
		
		System.out.println(animal.toString());
		System.out.println(animal2.toString());
		}


	
}
