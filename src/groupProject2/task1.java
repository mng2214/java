package groupProject2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        System.out.println("Please enter ONLY 6 digit number!");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int length = String.valueOf(number).length();
        System.out.println("The length of your input is "+ length);

        if (length == 6) {
            int one,two,three,four,five,six,a,b,c,d,e,multi,sum;
            six = number % 10; a = number / 10;
            five = a % 10; b = a / 10;
            four = b % 10; c = b / 10;
            three = c % 10; d = c / 10;
            two = d % 10; e = d / 10;
            one = e % 10;
            sum = (one + two + three + four + five + six);
            multi = (one * two * three * four * five * six);
            System.out.println("Multiplication of all digits is " + multi);
            System.out.println("The Sum of all digits is " + sum);

        } else {
            System.out.println("Please enter ONLY 6 digit number!");
        }
    }
}
