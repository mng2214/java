package groupProject3;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

    /*Roller coster
Write a program that determines if the user can ride a rollercoaster.
To ride the rollercoaster, you must be at least 120 cm tall. You must also
be at least 9 years old.
If you under 18 years old your ticket cost 7$ if you older 18 your ticket
cost 12$.
Ask the user how tall and how old they are. Use a nested if statement to
determine if they can ride the rollercoaster.
If they can, print "Welcome aboard." and Ticket price
If they cannot, print "Sorry, you are not eligible to ride, you have to be at
least 120 cm ".
If they cannot, print "Sorry, you are not eligible to ride you are too young
". */

        System.out.println("how old are you?");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        System.out.println("whats your heights?");
        int heights = scan.nextInt();
        int ticketPriceUnderAge = 7, ticketPriceAdult = 12;


        if (heights >= 120) {
            if (age >= 9) {
                if (age <= 18) {

                    System.out.println("your price will be : " + ticketPriceUnderAge);
                } else {

                    System.out.println("your price will be : " + ticketPriceAdult);
                }

            } else {
                System.out.println("you have to be least 9 years old");
            }

        } else {
            System.out.println("you have to be at least 120 cm tall");
        }

    }

}
