package groupProject2;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println("please enter 3 random words: ");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        System.out.println("Got it! Thanks. Now please 1 integer ");
        int numberInput = input.nextInt();


        int number1 = numberInput, number2 = number1 + 1, number3 = number2 + 1;
        String n1toString = "" + number1;
        String n2toString = "" + number2;
        String n3toString = "" + number3;

        int space1 = sentence.indexOf(" " );
        int space2 = sentence.lastIndexOf(" ");

        String word1 = sentence.substring(0,space1);
        String word2 = sentence.substring(space1 + 1,space2);
        String word3 = sentence.substring(space2 + 1 );

        String resultOne = word1.replace(word1.substring(0,1), n1toString);
        String resultTwo = word2.replace(word2.substring(0,1),n2toString);
        String resutlThree = word3.replace(word3.substring(0,1),n3toString);

        System.out.println(resultOne + " " + resultTwo + " " + resutlThree );

    }
}
