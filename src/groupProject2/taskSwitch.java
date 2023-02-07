package groupProject2;

import java.util.Scanner;

public class taskSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter x");
        int x = sc.nextInt();

        System.out.println("plesae enter y");
        int y = sc.nextInt();

        int tempValue = x;
        x = y;
        y = tempValue;

        System.out.println(" x = " + x);
        System.out.println(" y = " + y);

    }
}
