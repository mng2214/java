package RecapJava;

public class StringAndMethods {

    /*
    INTERVIEW QUESTIONS:

    1-Most of the technical parts are related with String methods

    2-WHat is the difference between (.equals) and (==)

    The big difference between .eauals and == is about the location and value comparison.
    *.equals is a way to compare two variables based on the "VALUES" of it.

     String name="Ahmet";            -->String pool   __>values Ahmet
     String name2=new String("Ahmet")  -->Heap Memory  -->Ahmet

     sout(name.equals(name2) ==> TRUE
     sout(name==name2)      ==> FALSE

     *(==) is a way to compare two variables based on the "LOCATION" of it

    3-What is String and How do you declare?(Can you declare a string)

    TIPS:Once you are explaning anything in IT.Try to use Tecnical terms. (I initiliaze the STring with the value of Ahmet)
    Declaration -->It is all about creating the variable without assigning any value (STring name;)
    Initiliazation-->It is all about creating the variable with assigning the value (String name ="Ahmet"


    METHODS:

      1-length()-->counts of the characters
      2-equals()-->it compares the value of the variable -->return boolean
      3-charAt()-->it gives you the character of the specific indext. (word.charAt(2)--> 'r'
      4-substring()-->It is a way to get specific part of the String.
      5-concat()-->It is a way to add the two or more characters/words together
      6-replace()-->it is a way to replace the specific characters with any other characters or nothing ($35,136)
    * 7-contains()-->it checks the word has the specific characters or not.
      8-UpperTo,LowerTo-->It makes the whole word either upper case or lower case
      9-Split --> it is a way to split the words from specific location.( I love Java).split(" ") --> I, love, java -->String array
      10-trim() -->It is a way to remove the spaces from beginning and end
      11-indexOf()-->It is a way to get the index of the characters (Ahmet) --> indexOf('t')-->4

    What is the difference between contains and equals ?
     <div ><'Ahmet'>

     .= Ahmet(%100 match up)               contains('Ah or 'Ahm' or Ahme ,Ahmet)

    AUTOMATION:

     -->I WOULD %100 KNOW :

        -->equals                      -->contains
        -->substring                   -->upperTO, lowerTo
        -->replace                     -->Trim



     */
}
