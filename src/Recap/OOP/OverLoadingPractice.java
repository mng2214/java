package RecapJava.OOP;

public class OverLoadingPractice {

    private String come(int age,String brand){
        System.out.println(age + brand);
        return "hello";
    }

    protected int come(double amount, String name){
        System.out.println(amount + name);
        return 12;
    }
     // --> SAME CLASS , DIFFERENT METHOD SIGNATURE(NAME+PARAMETERS) AND YOU CAN OVERLOAD FINAL,STATIC,PRIVATE

}
