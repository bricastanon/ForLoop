package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Inside a for loop.. you can create a counter vairable
        // Create a score variable
        //Have a score that keeps going up every iteration..
        //My mother is my inspiration. Score 1
        //My mother is my inspiration. Score 2..

        // BASIC LOOP
        for(int i = 0; i < 10; i++) {
            System.out.println("I love dogs!");
        }
        // COUNTING TO 5
        // Create a for loop that will print "My person of inspiration is (name) 5times
        int score = 1;
        for(int i = 0; i < 5; i++) {
            System.out.println("My person of inspiration is B. Score: " + score);
            score++;

        }
        // COUNTING BACKWARDS FROM 5
        int scoree = 5;
        // Create a for loop that will print "My person of inspiration is (name) 5times
        for(int i = 0; i < 5; i++) {
            System.out.println("My person of inspiration is Bri. Score: " + scoree);
            scoree--;
        }

        // WHILE LOOP EXAMPLE:
       int Score = 5;
        while (Score >= 0) {
            System.out.println("My person of inspiration is Heather. Score: " + Score);
            Score--;
        }
        }
    }
