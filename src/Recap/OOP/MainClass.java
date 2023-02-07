package RecapJava.OOP;

public class MainClass extends AbstractPractice1 {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        Bike bike=new Bike();
        Car car =new Car();

        vehicle.brand="TOYOTA";

       // AbstractPractice1 abstractPractice1=new AbstractPractice1();
        //you cannot create an object from abstract and interface.
        MainClass mainClass=new MainClass();
        mainClass.run();
    }


    @Override
    public void run() {
        System.out.println("the vehicle is running");
    }
}
