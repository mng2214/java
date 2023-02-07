package groupProject3;

import java.util.Scanner;

public class project3extra3 {
    public static void main(String[] args) {

        System.out.println("please enter your salary");
        Scanner scan = new Scanner(System.in);
        int salary = scan.nextInt();

        System.out.println("please enter number of yours you worked");
        int year = scan.nextInt();

        double bonusFiveYear = 0.05, bonusTenYear = 0.1, bonusFifteenYear = 0.2;

        if (year >= 15  ){
            System.out.println(salary*bonusFifteenYear+salary);
        }else if ( year >= 10) {
            System.out.println(salary*bonusTenYear+salary);
        }else if (year >= 5) {
            System.out.println(salary*bonusFiveYear+salary);
        }
    }
}
