import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class quest {
    public static void main(String[] args) {



        int[] myArray = new int[7];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter number for array: ");
            myArray[i] = scanner.nextInt();
        }
        boolean unique = false;
        for (int i = 0; i < myArray.length; i++) {
            unique = true;
            for (int j = 0; j < myArray.length; j++) {
                if (i != j && myArray[i] == myArray[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println("The first unique value is: \n " + myArray[i]);

            }
        }
        if (!unique) {
            System.out.println("Array doesn't have any unique element");
        }






    }


}