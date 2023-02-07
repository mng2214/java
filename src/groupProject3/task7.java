package groupProject3;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        System.out.println("please enter ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("leap year");

            }else {
            System.out.println("NOT A LEAP");
        }
    }
}
