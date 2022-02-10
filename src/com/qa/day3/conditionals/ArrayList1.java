package com.qa.day3.conditionals;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	
    public static void main(String[] args){
        List<String> sandwiches = new ArrayList<>();
        
        sandwiches.add("bread sandwich");
        sandwiches.add("pop tart");
        sandwiches.add("hot dog");

        System.out.println(sandwiches);
        
        System.out.println(sandwiches.get(0));
        
        sandwiches.set(0, "ice cream taco");
        System.out.println(sandwiches);
        
        for (int i = 0; i < sandwiches.size(); i++) {
            System.out.println(sandwiches.get(i));
        }
        
        for (String i : sandwiches){
            System.out.println(i);
        }
        
        List<Integer> faveNums = new ArrayList<>();
        
        faveNums.add(10);
        faveNums.add(1355417);
        faveNums.add(63);

        for (int i : faveNums){
            System.out.println(i);
        }
        
    }
}
