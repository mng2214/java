package RecapJava.OOP;

public interface Interface2 {

    void stop();

    //SHOW OFF: default keyword to have regular method inside of interface

    public default void move(){
        System.out.println("i am a regular method");
    }



}
