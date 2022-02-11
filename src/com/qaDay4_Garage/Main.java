package com.qaDay4_Garage;

import java.util.ArrayList;
import java.util.List;

public class Main {







	public static void main(String[] args) {
		// First is details for Car types
//double repair_cost, String type, int wheels, String colour, Boolean hasEngine, String make, String model, int age, double engineSize
		Car car1 = new Car(41.00, "Car", 4, "Black", true, "Ford", "Model-T", 1914, 0.25);
		Car car2 = new Car(25.00, "Car", 4, "Fiesta", true, "Ford", "Fiesta", 2012, 1.2);
		Car car3 = new Car(120.5, "Car", 4, "205", true, "Peugeut", "205", 1998, 1.4);
		Car car4 = new Car(362.23, "Car", 4, "Ibiza", true, "Seat", "Ibiza", 2019, 1.6);
		Car car5 = new Car(463.98, "Car", 4, "Corsa", true, "Vauxhall", "Corsa", 2018, 1.4);

		MotorBike motorBike1 = new MotorBike(133.00, "Motorbike", 2, "Silver", true, "Triumph", "250", 1990, 0.25);
		MotorBike motorBike2 = new MotorBike(475.98,"Motorbike", 2, "White", true, "Triumph", "ZR150", 1999, 0.5);
		MotorBike motorBike3 = new MotorBike(876.78, "Motorbike", 2, "Black", true, "Kawazaki", "250", 2005, 0.25);
		MotorBike motorBike4 = new MotorBike(28.50, "Motorbike", 2, "Purple", true, "Suzuki", "Kill Machine", 2017, 0.75);		
		MotorBike motorBike5 = new MotorBike(77.65, "Motorbike", 2, "Blue", true, "Honda", "Silver Dream", 2006, 0.5);
		
		Lorry lorry1 = new Lorry(46.80, "Lorry", 2, "Silver", true, "DAF", "250", 1990, 4);
		Lorry lorry2 = new Lorry(943.30, "Lorry", 4, "Mercedes", true, "Triumph", "ZR150", 1999, 5);
		Lorry lorry3 = new Lorry(1024.45, "Lorry", 4, "Citroen", true, "Kawazaki", "250", 2005, 4);
		Lorry lorry4 = new Lorry(354.00, "Lorry", 4, "Mercedes", true, "Suzuki", "Kill Machine", 2017, 4.5);		
		Lorry lorry5 = new Lorry(987.50, "Lorry", 4, "DAF", true, "Honda", "Silver Dream", 2006, 5.2);
		
		

		List<String> vehicles = new ArrayList<String>();
		Vehicle.add(vehicles).toString();
		
		
		List<String> cars = new ArrayList<String>();
		cars.add(car1.toString());
		cars.add(car2.toString());
		cars.add(car3.toString());
		cars.add(car4.toString());
		cars.add(car5.toString());
		
		List<String> motorBikes = new ArrayList<String>();
		motorBikes.add(motorBike1.toString());
		motorBikes.add(motorBike2.toString());
		motorBikes.add(motorBike3.toString());
		motorBikes.add(motorBike4.toString());
		motorBikes.add(motorBike5.toString());
		
		List<String> lorries = new ArrayList<String>();
		lorries.add(lorry1.toString());
		lorries.add(lorry2.toString());
		lorries.add(lorry3.toString());
		lorries.add(lorry4.toString());
		lorries.add(lorry5.toString());

		// was previously : System.out.println(car2.toString());
		
		System.out.println(cars);
		System.out.println(motorBikes);
		System.out.println(lorries);


		

 //       List<Integer> Vehicle = new ArrayList<>();
 //       for (int i : Vehicle){
 //           System.out.println(i);
 //       }

		
	}

}
/*

Using Vehicle as a base class, create three derived classes (Car, Motorbike, etc.). Each derived class should have its own attributes in addition to the normal Vehicle attributes.

Using a List<> implementation, store all your Vehicles in a Garage class.

Create a method in Garage that iterates through each Vehicle, calculating a bill for each type of Vehicle in a different way, depending on the type of Vehicle it is (this does not need to be complex).

Garage should have methods that add a Vehicle, remove a Vehicle by its ID or its type, fix a Vehicle (which calculates the bill) and to empty the Garage.

Garage should have a method to remove multiple Vehicles by their type.
*/