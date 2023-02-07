package GroupProject1;

import java.util.Scanner;

public class number6_coins_v2 {
    public static void main(String[] args) {
        System.out.println("\033[0;36m enter number ");
        Scanner scan = new Scanner(System.in);

        double dollars = scan.nextDouble();

        int penn, nickl, dime,quater;
        penn=1; nickl=5; dime=10; quater=25;
        double dollars1 = dollars * 100;
        int amount = (int)dollars1;

        int quaterPart = amount / quater, leftOver1 = amount % quater;
        int dimePart = leftOver1 / dime;
        int leftOver2 = leftOver1 % dime,nicklPart = leftOver2 / nickl;
        int leftOver3 = leftOver2 % nickl, pennPart = leftOver3 / penn;

        System.out.println("$"+dollars+" will make "+ quaterPart +" quarters "+dimePart+ " dime "+ nicklPart+ " nickles and "+pennPart+" pennies" );
    }
}
