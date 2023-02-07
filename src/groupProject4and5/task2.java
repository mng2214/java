package groupProject4and5;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        System.out.println("please enter first number: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("please enter second number: ");
        int secondNumber = scanner.nextInt();

        int sum = 0;

        for (int i = firstNumber; i < secondNumber; i++) {
            if (i % 3 == 0 && i % 11 == 0 && i > 0) {
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + sum);


    }
}
