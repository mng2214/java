package GroupProject1;

import java.util.Scanner;

public class number6_coins_v1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);                                                // we can get input from user he can enter 2.36
        System.out.println("\033[0;36m[Please enter amount in dollars and cents :");
        double inDollars = scan.nextDouble(), cents = inDollars * 100;

        int inCents = (int)cents;                                                             // we gonna convert DOUBLE to INT
        int AmountQuarters = 25, AmountDimes = 10, AmountNickels = 5, AmountPennies = 1;      // in cents

        int quarters = inCents / AmountQuarters;                                              //quarters
        int qRemaining = inCents % AmountQuarters, dimes = qRemaining / AmountDimes;          // we found how many dimes
        int dRemaining = qRemaining - (dimes* AmountDimes), nickles = dRemaining / AmountNickels;       // we found how many nickles
        int pRemaining = dRemaining % AmountNickels, pennies = pRemaining / AmountPennies;       // we found how many pennies




        System.out.println("In " + inDollars + "$ we have " + quarters +  " quarters "+ dimes + " dimes " + nickles + " nickles " + pennies + " pennies ");
    }
}
