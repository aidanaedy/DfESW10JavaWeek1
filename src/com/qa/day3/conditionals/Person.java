package com.qa.day3.conditionals;

public class Person {


	    private String firstName;
	    private String surname;
		private int personAge;
		private String title;

	    public Person(String firstName, String surname, int age, String title) {
	        this.firstName = firstName;
	        this.surname = surname;
	        this.personAge = age;
	        this.title = title;
	    }

	    public String getSurname() {
	        return surname;
	    }

	    public void setSurname(String surname) {
	        this.surname = surname;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	    
	    public void setAge(int age) {
	        this.personAge = age;
	    }
	    public int getAge(int age) {
	        return personAge;
	    }
	    
		public void setTitle(String title) {
			this.title = title;
		}

		public String getTitle() {
			return title;
		}  

		
		public String passDetails() {
				System.out.println("Mr " + firstName + " " + surname + " " + personAge + " Years old, and he is " + title) ;
				return "0";
			
		}
		
	    
}
	
	
