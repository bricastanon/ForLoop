package com.pluralsight;

public class stringBuilder {
    public static void main(String[] args) {
        System.out.println("Hello world!");

// ---------------------------- Create a list of places where you want to travel -----------------------------
        StringBuilder myTravelList = new StringBuilder();
        myTravelList.append("Norway, ");
        myTravelList.append("Switzerland, ");
        myTravelList.append("Iceland ");
        System.out.println("Places I'd love to go: " + myTravelList);


    }
}
