package com.qa.day3.conditionals;

public class Flowchart {

	public static void flowchartStart() {
		
	       for(int i = 100; i <= 200; i++) {
	            if(i%2 == 0) {
	            	System.out.println("-");
	               //continue;
	            }
	            if(i%2 != 0) {
	            	System.out.println("*");
	                //break;
	            }
	            //System.out.println(i);
	        }
		       
	}

	public static void numberCount() {
		// TODO Auto-generated method stub
	       for(int b = 0; b <= 10; b++) {
		       for(int c = 0; c <= 10; c++) {
  			    	   System.out.println(c);	
		       }
	       	}
		
	}
}
