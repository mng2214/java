package groupProject3;

import java.util.Scanner;

public class project3extra2 {
    public static void main(String[] args) {

        System.out.println("please enter number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        
        if (number == 1){
            System.out.println("Monday");
        }if (number ==2 ) {
            System.out.println("Tuesday");
        }if (number ==3 ) {
            System.out.println("Wednesday");
        }if (number ==4 ) {
            System.out.println("Thursday");
        }if (number ==5 ) {
            System.out.println("Friday");
        }if (number ==6 ) {
            System.out.println("Saturday");
        }if (number ==7 ) {
            System.out.println("Sunday");
        }else {
            System.out.println("number is out of range");
        }
    }
}
