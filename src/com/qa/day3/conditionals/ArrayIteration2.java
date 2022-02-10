package com.qa.day3.conditionals;

public class ArrayIteration2 {

    public static int twoDArray[] = new int[10];

    public static void main(String[] args) {

    	for(int i = 0; i < 10; i++) {
            twoDArray[i] = i;
            System.out.print(twoDArray[i]);
        }
        System.out.print("\n");
        System.out.print("\\===================================\\");
        System.out.print("\n");
    	
        for(int i = 0; i < twoDArray.length; i++) {
            	twoDArray[i] = i*10;
                System.out.print(twoDArray[i]);
            }
        }

	

}
