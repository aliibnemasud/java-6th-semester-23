package Final;

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getName());

        Student s2 = new Student("Selim");
        System.out.println(s2.getName());

        Student s3 = new Student("Likhon Dado");
        System.out.println(s3.getName());

        System.out.println(s3.numberOfStudents);
    }
}

class Student {
    String name = "default name";
    public static int numberOfStudents;

    Student() {

    }

    public String getName() {
        numberOfStudents++;
        return name;
    }
    // ConstructorOverloading
    Student(String name) {
        this.name = name;
    }

}
