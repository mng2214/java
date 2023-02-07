package RecapJava;

public class Constructor {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-What is constructor and what do you do with it ?

     That's a great question since I use constructor a lot in my automation framework. I would say that Constructor is a way to
     initialize instance variables.
       In other words, you are assigning the values for instance variables. --> NULL POINTER EXCEPTION

    2-Can you tell me the difference between constructor and methods?

     Constructor:                                                               Methods:
       *Doesn't have return type  public LoginPage()                           *It has return type  public void eat() --> String, boolean, int
       *Must have same name of the class                                       *May or may not have same class name --> public void LoginPage
                                                                                  public String loginPage

    3-Can you make the constructor private,static and final?

     To be honest, there is no point of making the constructor private unless you want to give extra protection for your instance variables
     BUT: As you know, in my UI automation I "CENTRALIZE" my driver with "SINGLETON PATTERN DESIGN". At this moment, i make my constructor private
     because I do not want 3th party to access my driver and manipulate it.

    4-What is the difference between this, this(), super,super()?

      this -->is a keyword which refers to the instance variables of class

      @FindBy(id="ahmet
      Webelement username;
      @FindBy(id='mehmet'
      Webelement password

       public void login(String username,String password){
       this.username="Ahmet'

       this() -->is a function that refers to same class constructor

       -->We can overload the constructor and call the one constructor inside of other constructor.
       -->this()-->it must be at the first line of the code.

       super -->is a keyword that refers to parent instance variables and methods

       super()-->is a function that refers to parent class constructor

        -->super()-->it must be at the first line of the code

        NOTE:To be able make a parent-child relationship -->We use Extends keyword



     */
    String name="Ahmet";
    int age;
    String eyeColor;

    public Constructor(){}

    public Constructor(String name, int age, String eyeColor) {
        this();
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void eat(String name){
        //this.name="Ahmet";
        System.out.println(name);
    }

    public static void main(String[] args) {
//        Constructor constructor=new Constructor("Aigul",25,"brown");
//        Constructor constructor2=new Constructor("Uma",21,"black");
//        constructor.setName("AIGULE");
        Constructor constructor=new Constructor();
        constructor.setName("Aigul");
        System.out.println(constructor.getName());
    }
}
