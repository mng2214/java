package groupProject3;

import java.util.Scanner;

public class project3extra1 {
    public static void main(String[] args) {

        /*
1. Take three numbers from the user and print the greatest number.
		Test Data
		Input the 1st number: 25
		Input the 2nd number: 78
		Input the 3rd number: 87
		Expected Output :
		The greatest: 87
2. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
Test Data
Input number: 3
Expected Output :
Wednesday
3. A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years. If employee has been working more than 10 years, company will give 10% bonus.
If Employee has more than 15 years, they will get 20% bonus.
Ask user for their salary and year of service and print the net bonus amount.
4. Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
         */

        System.out.println("please enter first number");
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();

        System.out.println("please enter second number");
        int secondNumber = scan.nextInt();

        System.out.println("please enter second number");
        int thirdNumber = scan.nextInt();
/*
        if (firstNumber > secondNumber || firstNumber > thirdNumber){
            System.out.println("Greatest number is " +firstNumber );
        }else if (secondNumber>thirdNumber){
            System.out.println("Greatest number is " +secondNumber );
        }else {
            System.out.println("Greatest number is "+ thirdNumber);}
            S
*/

        int result = (firstNumber > secondNumber || firstNumber > thirdNumber) ?  firstNumber : secondNumber > thirdNumber ? secondNumber : firstNumber ;
        System.out.println("Greatest number is " + result);



    }
}
