package groupProject3;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        System.out.println("please enter number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

/*
        if (number % 2 == 0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }
*/
       String result = (number % 2 == 0)      ?      "EVEN" : "ODD"; //

       System.out.println(result);

/* if (number % 2 == 0)
            System.out.println("EVEN");
        else
            System.out.println("ODD");
*/


    }
}
