package com.qa.day3.conditionals;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		System.out.println("Flowchart\n");
		
		Flowchart.flowchartStart();
		
		System.out.println("\n========================\n");
		
		Flowchart.numberCount();
		
		
		numberToString.Convert(2);
*/			
		
		Person firstPerson = new Person("Arnold","Rimmer", 30, "Second Technician");
        Person secondPerson = new Person("David","Lister", 28, "Second Technician");

        firstPerson.setFirstName("Arnold J.");
        secondPerson.setFirstName("Dave");

        System.out.println(firstPerson.getFirstName());   // -- output: Arnold J
        System.out.println(firstPerson.getSurname());
        System.out.println(firstPerson.getAge(0));        // Why have I had to add the zero ???
        System.out.println(firstPerson.getTitle());
        System.out.println(secondPerson.getFirstName());  // output: Dave
        System.out.println(secondPerson.getSurname());
        System.out.println(secondPerson.getAge(0));       // -- Why have I had to add the zero ???
        System.out.println(secondPerson.getTitle());

		firstPerson.passDetails();
		secondPerson.passDetails();
		
		
		
	}

}
