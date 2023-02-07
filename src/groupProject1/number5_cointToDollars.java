package GroupProject1;

public class number5_cointToDollars {
    public static void main(String[] args) {

        int Quarters = 5;  // input
        int Dimes = 4;
        int Nickels = 3;
        int Pennies = 2;

        int AmountQuarters = 25, AmountDimes = 10, AmountNickels = 5, AmountPennies = 1; // in cents
        int  totalDollars =  (Quarters * AmountQuarters + Dimes * AmountDimes + Nickels * AmountNickels + Pennies * AmountPennies)  ;
        System.out.println( "Total in dollars we have: $" + totalDollars * 0.01 ); // we * 0.01 to convert cents in dollars

    }
}
