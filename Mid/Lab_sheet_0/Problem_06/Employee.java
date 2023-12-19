package Lab_sheet_0.Problem_06;

/* 6. Create a class Employee with attributes name, employee ID, and
salary. Implement a method to calculate the annual salary of an
employee. Set the access of the attributes to private. */

public class Employee {
    private String name;
    private int employeeID;
    private double salary;

    // Constructor
    public Employee(String name, int employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        // Assuming the salary is already in annual format
        return 12 * salary;
    }
  
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 1001, 60000.0);        
        System.out.println("Annual Salary: $" + employee.calculateAnnualSalary());
    }
}

