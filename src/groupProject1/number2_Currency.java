package GroupProject1;

import java.util.Scanner;

public class number2_Currency {
    public static void main(String[] args) {

        int UkraineToUsd = 27, Ukrian ;                   // Ukrainian
        int MongoliaToUsd = 3412, USDMongolia = 1;        // Mongolian
        int MoldovaToUsd = 19, USDMoldova = 1;            //  Moldovian
        int KyrgyzToUsd = 84, USDKyrgyz = 1;              // Kyrgyztan Money
        int KazahstanToUsd = 462, USDKazahstan = 1;       //  Kazahstan Moeney

        System.out.println("Please enter how much Ukranian money you was to covert into $ : ");
        Scanner USDUkraine = new Scanner(System.in);
        System.out.println("Its Crazy!! its gonna be : " + USDUkraine.nextInt() * UkraineToUsd + " of a local money!");

    }
}
