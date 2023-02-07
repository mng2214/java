package RecapJava.OOP;

public class InheritanceRecap {

    /*
    POSSIBLE INTERVIEW QUESTION:

    1-What do you know about inheritance and how do you inherit two classes?

    -->Inheritance is a way to make a connection(relationship) between classes.

    -->To be able to inherit two classes, we use "EXTENDS" key word.

    2-Why and where do you use inheritance in your project?

    -->We need inheritance because: we would like to have less amount of code.(reducing the execution time) during the run.
    -->it will be more safe and clear, efficient code to maintain easily.

    AUTOMATION: We centralize our @BeforeMethod and @AfterMethod annotations in "TESTBASE" class.And I extends all of the test classes to
    "TEST BASE" class which reduces the amount of code, save time and increase the readability.

     */
    public String name;
    int age;
    String hairColor;

    public  void lunch(){
        System.out.println("Ahmet will have lunch soon");
    }

}
