package RecapJava;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-What is Wrapper Class?

     -->It is a process to convert data into different forms

     -->primitive data --> OBJECT --> Autoboxing

     -->Object data --> PRIMITIVE -->Unboxing

    2-How many ways of wrapper class do you know?

        Autoboxing: It is conversion from primitive to object
        Unboxing: it is conversion from object to primitive

     */

    public static void main(String[] args) {

        List<Integer> number=new ArrayList<>();
        int nbr=1;
        //nbr. primitives do not have any method
        number.add(nbr);
        number.get(0); // this is called AUTOBOXING

        int number2=(int)number.get(0);
        int number3=Integer.parseInt("5");

    }



}
