package com.qa.day3.conditionals;

public class Conditionals1 {

    public static void main(String[] args) {

        int catCount = 0;
        boolean notEnoughCats = true;

        while(notEnoughCats) {
            System.out.println("Another cat");
            catCount++;

            if(catCount > 5) {
                notEnoughCats = false;
            }
        }

        System.out.println("Too many cats what do I do");
    }

}
