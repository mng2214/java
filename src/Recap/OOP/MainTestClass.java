package RecapJava.OOP;

public class MainTestClass extends AbstractPractice1 implements InterfacePractice,Interface2 {

    public static void main(String[] args) {

    }

    @Override
    public void run() {
        System.out.println("I am running");
    }

//    @Override
//    public void recap() {
//        System.out.println("it is recap");
//    }

    @Override
    public void stop() {
        System.out.println("I stopped");
    }
}
