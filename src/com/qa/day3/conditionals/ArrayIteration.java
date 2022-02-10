package com.qa.day3.conditionals;

public class ArrayIteration {

    public static int twoDArray[] = new int[10];

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            twoDArray[i] = i;
        }
    	
        for(int i = 0; i < twoDArray.length; i++) {
                System.out.print(twoDArray[i]);
            }
        }

	

}
