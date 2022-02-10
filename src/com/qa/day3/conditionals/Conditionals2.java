package com.qa.day3.conditionals;

public class Conditionals2 {

    public static int playCount = 0;
    public static boolean playing = true;

    public static void main(String[] args) {
        do {
            System.out.println("Playing");
            playCount++;

            if(playCount > 3) {
                playing = false;
            }
        } while(playing);

        System.out.println("Game Over!");
    }
}
