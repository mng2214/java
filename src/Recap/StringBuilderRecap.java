package RecapJava;

public class StringBuilderRecap {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-What is the difference between String and String Builder?

    -->They are both useful for the project in terms of mutability and immutability
    -->String is immutable
    -->String builder is mutable
    -->String builder has different methods --> append,reverse...(Show off yourself -->then do it for second way)

    2-What is the difference between String Builder and String Buffer?

    -->StringBuffer and HashTable --> are synchronized --> AND SLOWER
    -->Map,List,Set,String,StringBuilder -->non-Synchronized --> AND FASTER

    NOTE:Mutable is all about giving functions/actions/manipulations without "RE-ASSIGNING"

    NOTE2:Immutability is all about giving/functions/actions/manipulations WITH "RE-ASSIGNING"

    N

    3-What is PassByValue and PassByReference ?

    PassByValue and PassByReference is all about the way that you pass the data

    -->if you call the method and pass the value directly(stringbuilder.run("AHMET").It means you are passing by Value
    String name="Ahmet"
    -->if you call the method and pass the value with reference(stringbuilder.run(name).It means you are passing by reference

     */

    public static void eat(int number){

        System.out.println(number);
    }

    public static void main(String[] args) {

        String name="Ahmet";
       name= name.toUpperCase().replace("H","*").concat("techtorial").concat("recap");
        System.out.println(name);
       // System.out.println(name.toUpperCase().replace("h","*")); //A*MET

        StringBuilder stringBuilder=new StringBuilder("Ahmet");
        stringBuilder.replace(1,2,"*").append("techtorial").append("recap");
        System.out.println(stringBuilder.replace(1,2,"*"));  //A*met

    StringBuffer stringBuffer=new StringBuffer();
    int amount=20;
    eat(5); //pass by value
        eat(amount);//pass by reference








        }
}
