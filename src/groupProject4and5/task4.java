package groupProject4and5;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter one number between 1 to 10:");
        int number = sc.nextInt();

        String tree = "";

        if(number > 0  &&  number <= 10){



            for (int i = number ; i > 0; i -- ) {
                for ( int k = 0; k < i; k++){
                    tree = "" + i;
                    System.out.print(tree);
                }
                System.out.println(" ");
            }
        }else{
            System.out.println("Wrong number entered!");
        }






    }
}
