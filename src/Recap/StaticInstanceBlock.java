package RecapJava;

public class StaticInstanceBlock {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-What is static as a keyword and why do you use it?

    -->Static(as keyword) is a way to make the methots accessible without **********CREATING AN OBJECT**********

        --> AUTOMATION: BROWSER UTILS METHODS.
    -->Disadvantage of using Static: YOU CANNOT OVERRIDE THE STATIC METHODS.

    -->Disadvantage os using Static:YOu cannot call the non-static methods inside of static methods.

       @BeforeAll --> public static void setup()
        mainpage mainpage =new Mainpage
        minpage.run()

    2-What is static block?

    -->is the block that can be called once(ONE TIME IT WORKS)
    -->IT ALWAYS EXECUTES THE FIRST and ONE TIME

    3-What is static variable?

    -->it makes the variable belongs to the class.(YOU CANNOT OVERRIDE THE STATIC METHODS BECAUSE STATIC MAKES THE METHODS BELONG TO THE CLASS"
    -->It makes the variable sharable --> common for each object
    -->It can be accessed by other classes without creating and object. Just with the name of class.

    4-What is instance block?

     -->IT is a block can be called as many as you have objects.

     */

    static int food=20;



   public  void eat(){
       food--;
       System.out.println("I am eating");
       System.out.println(food);
   }


    static {
        System.out.println("I am a static block");
    }

    {
        System.out.println("I am a instance block");
    }

}
