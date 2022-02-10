package com.qaDay4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		System.out.println("Flowchart\n");
		
		Flowchart.flowchartStart();
		
		System.out.println("\n========================\n");
		
		Flowchart.numberCount();
		
		
		numberToString.Convert(2);
*/			
		
		Person firstPerson = new Person("Arnold","Rimmer", 0, "Second Technician");
        Person secondPerson = new Person("David","Lister", 1000028, "Second Technician");
        Person thirdPerson = new Person("Cat","", 6, "Ships Cat - Stowaway");
        Person fourthPerson = new Person("Holly","5", 1000005, "Ships Main Computer System");

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
        System.out.println(thirdPerson.getFirstName());  // output: Dave
        System.out.println(thirdPerson.getSurname());
        System.out.println(thirdPerson.getAge(0));       // -- Why have I had to add the zero ???
        System.out.println(thirdPerson.getTitle());
        System.out.println(fourthPerson.getFirstName());  // output: Dave
        System.out.println(fourthPerson.getSurname());
        System.out.println(fourthPerson.getAge(0));       // -- Why have I had to add the zero ???
        System.out.println(fourthPerson.getTitle());

		firstPerson.passDetails();
		secondPerson.passDetails();
		thirdPerson.passDetails();
		fourthPerson.passDetails();
		
		
		
	}
	// this does not do anything as I cannot get it to work, it does not recognise firstPerson??
	@Override
	public String toString() {
		return "Main [getClass()=" + firstPerson.getFirstName() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
