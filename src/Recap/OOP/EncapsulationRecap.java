package RecapJava.OOP;

public class EncapsulationRecap {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-What is encapsulation ? why do you use it?

    -->Encapsulation is a way to PROTECT/HIDE/Restrict data from third party/other users,classes

    -->We use "PRIVATE" keyword to make the data encapsulated/protected
      -->It is a way to make your data not accessible and manipulable by others
      -->It is a way of restriction the data from users
      -->it is a way to limit the users
      -->It is a way to hide data from users
      -->It is a way to protect data from users

    2-How can you access the data from encapsulation?

      -->To be able to access the data that encapsulated, you can "GETTERS AND SETTERS"

    3-If encapsulation is hiding the data from users and with getters and setters they can still access it ? then
    what is the point of using encapsulation if they can still access it

        Actually, you can acess the data like you said, but you cannot make a specific implementation for specific
        condition to limit the users for your data accessibility. If you want me give an example, Lets say I have a book and
        this book has 300 pages. I would like to access the specific pages by providing the page number. With encapsulation
        I can limit the pages input between 0-300. It means users cannot manipulate my data by providing 301 or -1 which breaks
        code. They can still access the method but they cannot access my implementation.

     AUTOMATION:We use it in our PAGES classes and also for Singleton Pattern Design and POJO class

     @FindBy(xPath())
     private WebElement element;
     */

    private String name="Ahmet";
    private int age=31;
     String gender="Male";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.startsWith("A")||name.startsWith("a")){
            this.name = name;
        }else{
            System.out.println("You cannot change the name unless it starts with A or a");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0 && age<80){
            this.age = age;
        }else{
            System.out.println("Please check the age");
        }

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void speak(){
        System.out.println("Speak");
    }






















}
