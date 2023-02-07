package groupProject4and5;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {


//        int a = 19, b = 55, c = 31;
//        int amodule = a % 10, bmodule = b % 10, cmodule = c % 10;
//        int aten = 0, bten = 0, cten = 0;
//        for (int i = 0; i < a || i < b || i < c; i++) {
//            if (amodule >= 5 || bmodule >= 5 || cmodule >= 5) {
//                aten = a - amodule + 10;
//                bten = b - bmodule + 10;
//                cten = c - cmodule + 10;
//            } else if (amodule < 5 || bmodule < 5 || cmodule < 5) {
//                aten = a - amodule;
//                bten = b - bmodule;
//                cten = c - cmodule;
//            }
//        }
//        System.out.println(aten);
//        System.out.println(bten);
//        System.out.println(cten);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 int numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int module1=num1%10;
        int module2=num2%10;
        int module3=num3%10;
        int bucket=0;int bucket2=0;int bucket3=0;

        for(int i=0;i<num1||i<num2||i<num3;i++){
            if(module1>=5){
                bucket=num1-module1 +10;
            }else if(module1<5){
                bucket=num1-module1;
            }
            if(module2>=5){
                bucket2=num2-module2+10;
            }else if(module2<5){
                bucket2=num2-module2;
            }
            if(module3>=5){
                bucket3=num3-module3+10;
            } else if (module3<5) {
                bucket3=num3-module3;
            }

        }System.out.println(bucket);
        System.out.println(bucket2);
        System.out.println(bucket3);
        int sum=bucket+bucket2+bucket3;
        System.out.println("Sum of 3 round numbers is---> "+sum);

    }
}

