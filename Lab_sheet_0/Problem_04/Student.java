package Lab_sheet_0.Problem_04;

/* 4. Create a class Student with attributes roll number, name, and marks
in three subjects. Calculate the total marks and average marks for a
student using methods. Set the access of the attributes to private.
Implement the following methods besides the necessary methods.
- seeMarks
- seeDetails
- changeDetails
- changeMarks
- calculateMarks
- calculateAverageMarks
- changeName
- changeRollNumber
- enroll */

import java.util.Arrays;
public class Student {
    private int rollNumber;
    private String name;
    private int[] marks;

    // Constructor
    public Student(int rollNumber, String name, int[] marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    // Method to display marks
    public void seeMarks() {
        System.out.println("Marks: " + Arrays.toString(marks));
    }

    // Method to display student details
    public void seeDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + Arrays.toString(marks));
    }

    // Method to change student details
    public void changeDetails(int newRollNumber, String newName) {
        this.rollNumber = newRollNumber;
        this.name = newName;
    }

    // Method to change marks
    public void changeMarks(int[] newMarks) {
        this.marks = newMarks;
    }

    // Method to calculate total marks
    public int calculateTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // Method to calculate average marks
    public double calculateAverageMarks() {
        int totalMarks = calculateTotalMarks();
        return (double) totalMarks / marks.length;
    }

    // Method to change name
    public void changeName(String newName) {
        this.name = newName;
    }

    // Method to change roll number
    public void changeRollNumber(int newRollNumber) {
        this.rollNumber = newRollNumber;
    }

    // Method to enroll
    public void enroll(int rollNumber, String name, int[] marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args) {
        int[] marks = {85, 90, 95};
        Student student = new Student(101, "John Doe", marks);

        System.out.println("Initial Details:");
        student.seeDetails();

        System.out.println("\nChanging Details:");
        student.changeDetails(102, "Jane Smith");
        student.seeDetails();

        System.out.println("\nChanging Marks:");
        int[] newMarks = {90, 92, 88};
        student.changeMarks(newMarks);
        student.seeMarks();

        System.out.println("\nTotal Marks: " + student.calculateTotalMarks());
        System.out.println("Average Marks: " + student.calculateAverageMarks());

        System.out.println("\nChanging Name:");
        student.changeName("John Smith");
        student.seeDetails();

        System.out.println("\nChanging Roll Number:");
        student.changeRollNumber(103);
        student.seeDetails();
    }
}

