package Class_test_1_set_C;

/* Question 1: Complete the methods in student class so we can get the following output.
Invalid Age
Age is valid
Very good GPA
Excellent GPA */

public class Student {
    private String name;
    private int age;
    private double grade;

    public void setAge(int age) {
        // write your code here
        if (age > 30) {
            System.out.println("Invalid Age");
        } else {
            this.age = age;
            System.out.println("Age is valid");
        }
    }
    public void setGrade(double grade) {
        // write your code here
        this.grade = grade;
        if (grade > 3.25) {
            System.out.println("Excellent GPA");
        } else if (grade >= 3.00 && grade < 3.5) {
            System.out.println("Very good GPA");
        }
    }

    public static void main(String[] args) {
        Student Siyam = new Student();
        Student Abdul_Ahad = new Student();
        Siyam.setAge(60);
        Abdul_Ahad.setAge(30);
        Siyam.setGrade(3.25);
        Abdul_Ahad.setGrade(3.5);
    }
}
