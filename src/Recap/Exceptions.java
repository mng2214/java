package RecapJava;

public class Exceptions {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-How do you handle the exceptions?

    exception:Unexpected behaviour(errors)

    We can handle the exceptions with TRY and CATCH, THROWS

    2-Can you use more than one catch block ? How about try block?

     Yes, we can catch more than 1 exceptions, but we can have only 1 try block

    3-What do you know about final, finalize, finally keyword? (COmmon *****)

        final=is a keyword to make the variable or method or class unchangeable(last version)
        final String name="Ahmet"
        name="mehmet"//you cannot do this

        finalize=is a method which works with Garbage collector to make sure it is manually worked. (System.gc()) --->Manually call gc

        finally=Is a block that comes after try and catch block to do final execution.(no matter what it will work)

         AUTOMATION:Database connection=turn on the connection in my before annotation.Whenever you scenario execution is done, you have to disconnect from
         the data for security purpose.(safety). finally(database.disconnect)

    4-What is the difference between throw and throws?

       Both throw and throws are the concept of exception handling in which throws I used explicitly(out of block) throw an exception from a method
       or any block of code

       public void exception() throws ArithmeticOperator{
       }
       public void exception2(){
         new throw ArithmeticOperator

        ** While throws are used next to the method signature(outside of block)
        **Throw is used inside of the block

     */

    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(1000);

        String number="221914423";

        //convert the given string to int
        //need to parse the string
        //Integer.parseInt(number) ==> numberFormatException

        try {//put the implementation that is possibly will give you an error(exception)
            System.out.println("First type of exception");
            int result = Integer.parseInt(number);
            int result2=5/1;
            System.out.println(result2);
            System.out.println("hello");
           System.out.println(result);
        }catch (NumberFormatException ex){
            System.out.println("Hey there is number format exception here ");
        }catch (ArithmeticException ar){
            System.out.println("Hey there is a arithmetic exception");
        }
        finally {
            System.out.println("I will work no matter what even though the try block fails");
            System.out.println("WE COMPLETED THE JAVA RECAP FOR ALUMNI");
        }

        try{
            Thread.sleep(1000);
        }catch (IllegalArgumentException ex){
            System.out.println("THe number is negative");
        }

        Exceptions exceptions=new Exceptions();
      //  exceptions.testing();


    }

    public void testing(){

         int number1=100;
         int number2=20;

         if(number1>number2){
             throw new RuntimeException();
         }

    }
















}
