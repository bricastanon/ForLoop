package com.pluralsight;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
public class StringLoopWB {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner reader = new Scanner(System.in);

        String myMessage = "You guys are \n amazing!\n The \"BEST GROUP EVER\"";
        System.out.println("Do you you all like the lessons? (Yes/No)");
        System.out.println(""); // means new line
        String answer = reader.nextLine();
        //Comparing string
        boolean areLessonsLiked = false;
        if (answer.equalsIgnoreCase("Yes")) {
            System.out.println("So happy to hear that");
            areLessonsLiked = true;
        }
        if (!areLessonsLiked) {
            System.out.println("Please tell me how I can improve the lessons");
        }

        // System.out.println(myMessage);


        String firstname = "Brianna";
        int amountOfLettersInFirstname = firstname.length();
        System.out.println(amountOfLettersInFirstname);
        System.out.println(firstname.toUpperCase());
        System.out.println(firstname.toLowerCase());
        System.out.println(firstname.startsWith("D"));
        // ^^this is true or false (would be false cause its "D" and not "B")
        String substring = firstname.substring(0,3);
        System.out.println(substring);
        // ^^ prints the first 3 letters of my name**

        // Give someone here in the class a compliment...
        //Use there firstname in variable and make their name uppercase.
        String firstName = "Tori";
        System.out.println(firstName.toUpperCase() + " is a sweetie");

// EXAMPLE for charAt --------------------------------------------------------------------
    // "Programming is both an art and a science."
    // charAt(23);  charAt(4); charAt(25);
        String trackingCode = "Programming is both an art and a science.";
        String test = "Programming is both an art and a science.";
        System.out.println(test.charAt(23) + " " + test.charAt(4) + " " + test.charAt(25));

        int foundTheLetter = test.indexOf("x");
            if(foundTheLetter <0) {

            }
// BUILD WHERE IT SAYS LAST 4 OF SOCIAL: -----------------------------------------------
        String test1 = "111-11-1111";
        String [] test2 = test1.split("-");
        System.out.println("Last 4 of social: " + test2[2]);
// ANOTHER WAY TO SHOW LAST 4 OF SOCIAL: ------------------------------------------
        String ssn = "111-11-1111";
        int dashPosition = ssn.indexOf("-");
        String last4ssn = ssn.substring(dashPosition + 4);
        System.out.println("Last 4 of social: " + last4ssn);

// CONVERTING TO A NUMBER --------------------------------------------------------
        String iHaveThisAmountOfMoney = "323432.435";
        float money = Float.parseFloat(iHaveThisAmountOfMoney);
        System.out.printf("$%.2f", money);

// CONVERTING A STRING INTO A DATE
        String userInput;
        DateTimeFormatter formatter;
        userInput = "28 Jun 1999";
        formatter = DateTimeFormatter.ofPattern("d MMM yyyy");
        LocalDate birthDay = LocalDate.parse(userInput, formatter);
        System.out.println("\n" + birthDay);
    }
}
