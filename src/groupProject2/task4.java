package groupProject2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        System.out.println("please enter 3 random words: ");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        int space1 = sentence.indexOf(" " );
        int space2 = sentence.lastIndexOf(" ");
        System.out.println(space1);
        System.out.println(space1);

        String word1 = sentence.substring(0,space1);
        String last1 = "" + word1.charAt(space1-1);
        int lastIndex1 = word1.length()-1;


        String word2 =  sentence.substring(space1+1,space2 );
        String last2 = "" + word2.charAt(word2.length() - 1);
        int lastIndex2 = word1.length()+word2.length();


        String word3 = sentence.substring(space2 + 1 );
        String last3 = "" + word3.charAt(word3.length() - 1);
        int lastIndex3 = word1.length()+word2.length()+word3.length()+1;

        System.out.println(lastIndex1 + " --> index number of " + last1);
        System.out.println(lastIndex2 + " --> index number of " + last2);
        System.out.println(lastIndex3 + " --> index number of " + last3);


        int sumOfIndex =  lastIndex1 + lastIndex2 + lastIndex3;
        System.out.println("the sum: " + sumOfIndex);

        }
    }

