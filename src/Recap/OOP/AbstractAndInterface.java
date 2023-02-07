package RecapJava.OOP;

public class AbstractAndInterface {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    ABSTRACT:

    1-What is abstract and can you clarify it with little bit more details?

   -->Abstract is a way to organize the methods with only necessary information(template).It means people can
   see the template of the methods and "OVERRIDE" this based on their requirements.
   ****We do not have a body for abstract methods(*******) because every class which extends to the abstract class
   CAN MAKE THEIR OWN IMPLEMENTATION BY OVERRIDING"*******

    2-Why do you need to have abstract class in your project?

    *For many methods, we need developers to make their own implementation in the company.
    so they can create abstract class for the template of specific method and let people call it based on their requirement.(override and implement)

    *YOU CANNOT CREATE AN OBJECT FROM ABSTRACT CLASS.TO BE ABLE TO ACCESS ALL OF THE METHODS YOU HAVE TO OVERRIDE IT AND EXTENDS THE CLASS

    3-Where do you use abstract class in your project?

    I would definitely say that I use general oop concept in everywhere of my project.

    4-Can you have normal and abstract method inside of abstract class?

        Yes, you can have both abstract and regular methods inside of abstract class

    5-Can you create an object from abstract class?If no, how are you going to access all of the methods from class

        *YOU CANNOT CREATE AN OBJECT FROM ABSTRACT CLASS.TO BE ABLE TO ACCESS ALL OF THE METHODS YOU HAVE TO OVERRIDE IT AND EXTENDS THE CLASS


    INTERFACE:

     1-What is interface?

     -->Interface is a blueprint of the object like class which has special methods than can be overridden to make new implementation.(BUT INTERFACE IS NOT
     A CLASS)

      -->We use "IMPLEMENTS" key word to make the class connected with INTERFACE.

     2-Why do you need interface if you have abstract already?

     ***BECAUSE INTERFACE HAS MORE FEATURES IN TERMS OF ACCESSING THE MULTIPLE PARENTS AT THE SAME TIME BY OVERRIDING THE METHODS.


     ***3-What is the difference between Abstract and Interface? *********THE MOST COMMON QUESTION*************

        INTERFACE:
        1-Interface is declared with "INTERFACE" keyword public interface mainpage()
        2-Interface can have only public abstract methods.(SHOW OFF:default keyword is exception-->you can create regular method with that)
        3-To make a connection with interface, we need to use "IMPLEMENTS" keyword
      **4-In interface you can implement the class as many as you want(multiparents) and one time extends(should come first)
      5-When you initiliaze a variable in interface as default it is final static
      6-Methods must be public abstract
      7-Interface cannot have CONSTRUCTOR **

        ABSTRACT:
        1-Abstract is declared with "ABSTRACT" keyword public abstract class mainpage()
        2-Abstract may or may not have regular methods as well
        3-To make a connection with abstract, we need to use "EXTENDS" keyword
        4-In abstract you can extend the class ONCE.
        5-When you declare a variable in abstract there is no default key word
        6-You can have any access modifiers for the methods
        7-Abstract can have constructor.

           AUTOMATION: I USE INTERFACE IN AUTOMATION:

               -->COLLECTIONS (LIST,SET)
               -->MAP -->POJO CLASS for API automation
               -->WEBDRIVER is an interface and we use it for SELENIUM
     */
}
