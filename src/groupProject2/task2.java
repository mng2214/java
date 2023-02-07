package groupProject2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {


        System.out.println("Please enter ONLY 5 digit number!");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int length = String.valueOf(number).length();
        System.out.println("The length of your input is " + length);

        if (length == 5) {
            int one,two,three,four,five,six,a,b,c,d,e,multi,sum;
            five = number % 10; a = number / 10;
            four = a % 10; b = a / 10;
            three = b % 10; c = b / 10;
            two = c % 10; d = c / 10;
            one = d % 10; e = d / 10;

            System.out.println("Here is reverse edition below" );
            System.out.println("" + five + four + three + two + one);

    }else{
            System.out.println("Please enter ONLY!!! 5 digit number");
        }
        }

}
