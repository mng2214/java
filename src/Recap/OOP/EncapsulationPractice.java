package RecapJava.OOP;

public class EncapsulationPractice {

    public static void main(String[] args) {
        EncapsulationRecap encapsulationRecap=new EncapsulationRecap();
        encapsulationRecap.gender="Female";
        encapsulationRecap.setName("Mehmet");
        encapsulationRecap.setName("Aizana");
        System.out.println(encapsulationRecap.getName());
        encapsulationRecap.setAge(101);
        System.out.println(encapsulationRecap.getAge());
        encapsulationRecap.setAge(75);
        System.out.println(encapsulationRecap.getAge());
    }
}
