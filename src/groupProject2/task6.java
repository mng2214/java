package groupProject2;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {


        System.out.println("Please enter text");
        Scanner inputText = new Scanner(System.in);
        String text = inputText.nextLine();
        System.out.println("please enter 1st number");
        int startNumber = inputText.nextInt();
        System.out.println("please enter 2nd number");
        int endNumber = inputText.nextInt();

        String result = text.substring(startNumber-1,endNumber);
        System.out.println(result);




    }
}
