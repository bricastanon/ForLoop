package com.pluralsight;
import java.util.Scanner;
public class TheaterReservation {
    public static void main(String[] args) {
// STRINGS LOOP
        System.out.println("Hello world!");
        Scanner reader = new Scanner(System.in);

        System.out.println("What is your first name? ");
        String firstname = reader.nextLine();

        System.out.println("What is your last name? ");
        String lastname = reader.nextLine();

        System.out.println("What date will you be coming? (MM/dd/yyyy) ");
        String date = reader.nextLine();
        //int tickets = 0;
        System.out.println("How many tickets would you like? ");
        int tickets = reader.nextInt();

        if (tickets <= 2) {
           System.out.println(tickets + " ticket");
       }
        else {
           System.out.print(tickets + " tickets");
       }
        System.out.print(" reserved for " + date + " under " + lastname + ", " + firstname);
        // Remseys example for ticket(s):
       // System.out.println((tickets <= 1 ? "Ticket" : "Tickets") + " reserved for " + date + " etc");



       // ---------------------------STRING LOOP EXAMPLE -----------------------------
      /*  System.out.println("Please enter your first and last name:");
        String fullname = reader.nextLine();
        String[] split = fullname.split(" ");
        String fullName = split[0];
       // String firstName = split[0];
       // String lastName = split[1];
        System.out.println("Fullname: " + fullname);
        //System.out.println("Last name: " + lastName);
        System.out.println("What date are you coming? ");
        String date = reader.nextLine();
        String[] split2 = date.split(" ");
        String Date = split[0];
        System.out.println("Date: " + date);
        System.out.println("How many tickets would you like? ");
        String tickets = reader.nextLine();
        String[] split3 = tickets.split(" ");
        String ticketNumber = split[0];
        System.out.println("Tickets: " + tickets);
        System.out.println(tickets + " tickets resereved for " + date + " under " + fullname); */
    }
}
