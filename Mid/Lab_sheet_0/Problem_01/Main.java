package Lab_sheet_0.Problem_01;

/* 1. Create a class Person with attributes name, age, and gender. Set the
access of the attributes to private. Create an object of this class and
display its details. Also, create the function for each of the Person
members like Walk, Talk, See, Hear. */
class Person {
    private String name;
    private int age;
    private String gender;
    //  create constructor for this person
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //  Create a method
    public void displayDetails (){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Gender: "+ gender);
    }
    //  Create a method
    public void walk (){
        System.out.println(name+ "is walking....");
    }
    //  Create a method
    public void talk (){
        System.out.println(name+ "is talking....");
    }
    //  Create a method
    public void see (){
        System.out.println(name+ "is seeing....");
    }
    //  Create a method
    public void hear (){
        System.out.println(name+ "is hearing....");
    }
}



public class Main {
    public static void main(String [] arg){
        Person Siyam = new Person("Siyam", 21, "Male");
        Siyam.displayDetails();
        Siyam.walk();
        Siyam.talk();
        Siyam.see();
        Siyam.hear();
    };
    
};



