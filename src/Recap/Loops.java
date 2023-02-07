package RecapJava;

public class Loops {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-Many technical interview questions they require to use loops to solve the questions:

     LOOPS:It is a way to iterate(circles/cycles/one by one) the elements(values/variables).In other words: it is
     a cycle for the "REPETITIVE ACTIONS".

     WHAT TYPES OF LOOP:

         1-Do While --> No matter what it executes the code ONCE.

            do{
            sout(Please enter your username and password)
            }while(!name.equals("Ahmet")


         2-While   -->It is one of the ways of iterating the elements.
            int a=5;
         While(a>3){
         sout(hello)
         a--;
         }
            the condition must come before the action

        3-FOR --> It checks the condition and gives the variable at the beginning
          for(int i=0;i<word.length();i++{

        4-FOR EACH-->It is a next level version of FOR loop

          Whenever you need to iterate all items from arrays,list,set...)

         TIPS:When you need to start from specific numbers(1,2,3,5,6) instead of (0,1,2,3,5,6)

     AUTOMATION:
     1-WHere do you use loops in your framework?

        -->List<WebElement> alldata;

          for(WebElement data:alldata)
          { data.click}

        -->Set<String> allIds=driver.getWindowHandles();

     */

    public static void main(String[] args) {

        /*
        1-Declare a int value with 12345
        2-Reverse this number and multiply the digits

        TIPS:Before you start solving the task, communicate with interviewers.
          -->In this question you want me declare the int value with 12345 and want me reverse this and get the
          multplication of these digits is that correct ?

         *-->WHere should I start ?
         *-->How am i going to reverse 12345
         *-->How am i going to multiply the digits

         */

        int number=123454;

        //12345%10-->5  //12345/10 -->1234%10 -->4 -_> 1234/10 -->123%10 -->3 /10 12%10 --2 /10 0

        String reverse=""; // I need to store the digits in here

        int multiply=1;//I will start from 1 because 1 is useless in multiplication

        while(number!=0){
            int digit=number%10;//5 4 3 2 1
            multiply*=digit;//5
            reverse+=digit;
            number/=10;
        }
        System.out.println(reverse);
        System.out.println(multiply);
    }

    public void negative(){

        int value = -12345;
        int reverse = 0;
        int multiplication = 1;
        int value1 = value;

        if (value1 < 0) {
            value = -value;
        }

        while (value > 0) {
            int digit = value % 10;
            multiplication = multiplication * digit;
            reverse = reverse * 10 + digit;
            value /= 10;
        }

        if (value1 < 0) {
            reverse = -reverse;
            multiplication = -multiplication;
        }

        System.out.println("Reverse number is: " + reverse);
        System.out.println("Multiplication of it's digits is: " + multiplication);
    }

}
