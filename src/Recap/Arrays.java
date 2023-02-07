package RecapJava;

import java.util.List;

public class Arrays {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    many technical questions are related with arrays

    1- What is the difference between Arrays and Array List?

      -Array is a storage for primitives and Object
      -Array is fixed size
      -Array has Multidimensinal form --> Object[][] --> Data Provider
      -Array has a length function --> length
      -Array cannot be manipulated(you cannot play with it).There is no method

    HOMEWORK:Write an implementation that initiliaze int array and fidn the:

     1-The smallest Number
     2-THe largest Number

      {100,300,200,450,350}
      OUTPUT: THe smallest number is 100 and The largest number is 450


      HOMEWORK2:String str="Hello Java is so good"

      output:olleH
             avaJ
             si
             os
             doog

      TIPS: You should consider to use Split MEthod and Nested Loop


     */
    public static void main(String[] args) {

        /*
        Write an implementation that initiliaze int array and find:
         1-Sum of the even number
         2-SUm of the add number
         3-What is the difference between them
         int[] array={1,2,3,8,12,65,76,5,22,17}
         */
        int sumEven=0;
        int sumOdd=0;
        int difference=0;
        int[] array={1,2,3,8,12,65,76,5,22,17};

        for(int number:array){
            if(number%2==0){
                sumEven+=number;
            }else{
                sumOdd+=number;
            }
        } //29 -29
        System.out.println(java.util.Arrays.toString(array));
        difference=sumEven-sumOdd;
        System.out.println(sumEven);
        System.out.println(sumOdd);
        System.out.println(difference);
        difference=(sumEven-sumOdd)>=0 ? sumEven-sumOdd:sumOdd-sumEven;
        System.out.println(difference);












    }
}
