package B16MentoringWithArtur;

public class mentoring_1 {
    /*
    MENTORING 3/4/23
    ----------------------------------------------------------------------------------------------------
    1 jdk jre jvm  explanating
    2 is java 100% oop language? if not why?
    3 data types? how many?
    4 ASCII Table what is it why do we use it?
    5 What is the difference between (.) and (==)?
    6 What is String and how do you declare?
    7 String Methods?
             1-INDEXOF()-->IT GIVES YOU THE INDEX NUMBER OF CHARACTER.IT RETURNS INT
             2-LENGTH() -->IT GIVES YOU THE SIZE OF THE DATA(VALUE).IT RETURNS INT
             3-CONCAT() -->IT IS A WAY TO COMBINE TWO OR MORE VALUES.(CONCAT() OR "+").IT RETURNS STRING
             4-SPLIT() --> IT IS A WAY TO CUT THE WORDS FROM SPECIFIC SPOT.IT RETURNS STRING ARRAY
             5-STARTSWITH()-->IT CHECKS THE VALUE STARTS WITH A SPECIFIC CHARACTERS/WORDS.IT RETURNS BOOLEAN
             6-ENDSWITH() -->IT CHECKS THE VALUE ENDS WITH A SPECIFIC CHARACTERS/WORDS.IT RETURNS BOOLEAN
           * 7-SUBSTRING()-->IT IS A WAY TO GET SPECIFIC CHARACTERS/WORDS FROM STRING.IT RETURNS STRING
           * 8-CHARAT() -->IT GIVES YOU THE CHARACTER OF A SPECIFIC INDEX SPOT.IT RETURNS CHAR
         *** 9-CONTAINS()-->IT CHECKS THE VALUE HAS THE DATA THAT YOU ARE LOOKING FOR.IT RETURNS BOOLEAN
         *** 10-TRIM() -->IT REMOVES THE SPACES FROM BEGINNING , FROM END
           * 11-REPLACE() -->IT REPLACES THE SPECIFIC CHARACTER/WORDS IN STRING.IT RETURNS STRING
         *** 12-EQUALS() -->IT COMPARES TWO VALUES OF VARIABLE.IT RETURNS BOOLEAN
           * 13-EQUALIGNORECASE() -->IT COMPARES TWO VALUES OF VARIABLE WITHOUT CASE SENSITIVITY.
          ** 14-VALUEOF() -->IT CONVERTS THE DIFFERENT DATA TYPE TO STRING TYPE.IT RETURNS STRING
          *  15-ToUpper/ToLower-->it changes the characters to upper or lower case.It returns String
    8 what is Unary operators? ++  pre -- post
    9 java arithmetic operators + - * / %   Math.()
    10 OperatorPrecedence ? NumericPromotion?
    11 logical operators > < =< >=  True false table?
    12 if ter conditions
    ----------------------------------------------------------------------------------------------------
    TASKS:
    1 Write a program where user input char and programs checks if its Upper or lower case
    2 User input 1 word. Build a logic where system gonna accept this word in a lowercase only and save it to String variable 'str'
    3 from tast 2. take 1st and last char from variable and comapare. check if first char in a range of 97 to 107 and last char is in a range of 115-122.
    4 gived 2 words in a string. save them into 2 different string var
    5 get a first work and replace 1st char with a last char of a second word
    6 2 variables change  with creatign 3rd one
    7 2 variables change with out creatign 3rd one

     */
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        a = a + b; //5
        b = a - b ; // 2
        a = a - b ; //3
        System.out.println(a);
        System.out.println(b);

    }







    /*
    JAVA
-----
2-15-2023
-----------------------------------------------------------------------------------------------
SDET
Computer
OS --> operating system
Algorithym
Pseudocode
Binary
    bit --> every '0' or '1' is one bit
    byte --> 11100110
ASCII Table -->
Sorting types
Why Java?
Programming languages
===============================
-JDK  --> Java Development Kit
-JRE --> Java Runtime Environment
-JVM --> Java Virtual Machine
===============================
FILE Extension
chicago.png
.txt
.pdf
.ppt
.doc
.exe
.zip
...
.java
==================================
Keyboard Shortcuts
command + a --> select all
command + c --> copy
command + v -->  paste
command + x --> cut
command + z --> un-do
command + p --> print
command + q --> quit
command + b --> make the text BOLD
command + u --> underline the text
command + f --> find/search
command + o --> open/start
command + w --> close current window
command + s --> save
screenshot
prtsc --> entire screen's screnshot
window + shift + s --> partial screen shot option
command + shift + 4 --> partial screen shot option
command + shift + 3  --> entire screen's screnshot
command + shift + 5 --> partial screen shot option
BUG ---> DEFECT
2-15-2023
-----------------------------------------------------------------------------------------------
SDET
Computer
OS --> operating system
Algorithym
Pseudocode
Binary
    bit --> every '0' or '1' is one bit
    byte --> 11100110
ASCII Table -->
Sorting types
Why Java?
Programming languages
===============================
-JDK  --> Java Development Kit
-JRE --> Java Runtime Environment
-JVM --> Java Virtual Machine
===============================
FILE Extension
chicago.png
.txt
.pdf
.ppt
.doc
.exe
.zip
...
.java
==================================
Keyboard Shortcuts
command + a --> select all
command + c --> copy
command + v -->  paste
command + x --> cut
command + z --> un-do
command + p --> print
command + q --> quit
command + b --> make the text BOLD
command + u --> underline the text
command + f --> find/search
command + o --> open/start
command + w --> close current window
command + s --> save
screenshot
prtsc --> entire screen's screnshot
window + shift + s --> partial screen shot option
command + shift + 4 --> partial screen shot option
command + shift + 3  --> entire screen's screnshot
command + shift + 5 --> partial screen shot option
========
in the print statement; if you start with text, rest will be behave as text
    -meaning it will be attached to the beginning text
    Ex: System.out.println("10 is " + 5 + 5); RESULT OF THIS --> 10 is 55
* Java know math*
* Code will run from top to bottom and left to right
- if you have mathematical operation before text, it will be done first and added to the text in the print statement
Following statement will not work:  System.out.println("Study" - 8);
    -because, you cannot substract number from text
CodeFish
  [9:11 PM]
========Java Class Syntax Rules======
-you need to use ‘class’ keyword to create java Class
-class name can be any word you choose
-Name should start with capital letter
-if there are multiple words on the class name they have to be written
 together(No Space)
-for better visibility/reading purpose multiple words should
	follow camelcase
	Ex: HelloWorld
Message classnotes
Channel classnotes
========Java Class Syntax Rules======
-you need to use 'class' keyword to create java Class
-class name can be any word you choose
-Name should start with capital letter
-if there are multiple words on the class name they have to be written
 together(No Space)
-for better visibility/reading purpose multiple words should
	follow camelcase
	Ex: HelloWorld
	2-25-2023
	-----------------------------------------------------------------------------------------------
comparison operators
logical comparison
unary operators
String basics
Scanner
----------------------------
comparison operators
    *All of the comparison operators will return boolean result
    ==
    4 == 4 --> TRUE
    --------------
    !=
    4 != 4 --> FALSE
    'c' != 'm' --> TRUE
    --------------
    >
    'c' > 'd' --> FALSE
    9  > 99 --> false
    7 > 1   --> TRUE
    ----------------------
    <
    6 < 8 --> TRUE
    ----------------------
    >=
    age >= 8 --> TRUE   ----> age > 7  ---> 7 < age
    8 >  8 --> FALSE
    ----------------------
    <=
    7 <= 7 --> TRUE
    8 <= 9 --> TRUE
    8 <= 6 --> FALSE
logical comparison
    && --> AND
    visa  &&   ticket  ---> RESULT
     T          T      ----> T
     F          F      -----> F
     T          F     ------> F
     F          T     ------> F
    ----------
    || --> OR
    cash   OR    Card   --> RESULT
    T             T     --> T
    F             F     --> F
    T             F     --> T
    F             T     --> T
======Unary Operators===========
    int flower = 5;
    // if you want to increase or add 1 more flower
    flower = flower + 1;  ---> flower += 1;
// if you want to decrease or subtract 1 from flower
    flower = flower -1; --> flower -= 1;
=============Unary Operators==================
    INCREMENT --> will increase value by 1
    DECREMENT --> will decrease value by 1
    ++  ---> Increnment operator
    --  ---> Decrement operator
    int flower = 5;
    sout(flower++);
    flower++; ---> it will increase flower value by only one and will reassign to the flower
    sout(flower); --> 7
    flower--; ---> it will decrease flower value by only one and will reassign to the flower
    sout(flower); --> 5
    POST increment --> varibale++;
    POST decrement --> variable--;
    java will use value from previous assignment and increase or decrease.
-----------------------------------
    PRE increment --> ++variable;
    PRE decrement --> --variable;
    java will increase or decrease value and use it in the current implementation.
    int flower = 12;
    sout(++flower); 13
-----------------------------------
    String --> text
    String is an implemented class in java to represent text/char squences.
    String class is of of the special class in java
    *String is 'immutable' --> not changable unless you give new value
    --primitives---
    int   nameOfVariable = 12;
    boolean
    char
    int a;
--------------------
    String text = "Test";
    String name1 = new String();
    name1 = "Jessi";
    String name2 = new String("Diana");
    3-1-2023
    	-----------------------------------------------------------------------------------------------
methods
String equality
if statement
-------------------------
scanner --> used for char
Scanner input = new Scanner(System.in);
    input.next().charAt(4); --> get a char at position 4
-------------------------
indexing --> position
    "java"  --> if you count numbers of chars, you would say there are 4 chars on this string
     0123 --> indexing
-------------------------
String methods:
    concat();  --> parameter type --> string / returns --> string
    >>charAt();  --> parameter type --> integer / returns --> char
    length();  --> parameter type --> no parameter need to give  / returns --> integer
    >>indexOf(); --> parameter type --> char, char and integer, string / returns --> integer
    toUppercase(); -> parameter type -> no param / returns --> string
    toLowercase(); -> parameter type -> no param / returns --> string
    startWith() --> parameter type -> string / returns --> boolean
    endsWith() --> parameter type -> string / returns --> boolean
    contains()  --> parameter type -> string / returns --> boolean
    equals();  --> parameter type -> string / returns --> boolean
    equalsIgnorecase(); parameter type -> string / returns --> boolean
    substring(); --> parameter type -> integer / returns --> string
    replace(); you can replace one cahr with another char
                you can replace string with another string
                parameter type -> char/string / returns --> string
        String str = "java"; --> replace letter 'a' --with--> $ --> "j$v$"
        str.replace('a', '$');
    trim(); parameter type -> none / returns --> string
            Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 6-digit number:");
        int number= scanner.nextInt();
        int digit6=number%10;
        number=number/10;
        int digit5=number%10;
        number=number/10;
        int digit4=number%10;
        number=number/10;
        int digit3=number%10;
        number=number/10;
        int digit2=number%10;
        number=number/10;
        int digit1=number%10;
        number=number/10;
        int multiplicationOfDigits=digit1*digit2*digit3*digit4*digit5*digit6;
        int sumOfDigits=digit1+digit2+digit3+digit4+digit5+digit6;
        System.out.println("Multiplication of all digits is "+multiplicationOfDigits);
        System.out.println("The Sum of all digits is "+sumOfDigits);
     */
}
