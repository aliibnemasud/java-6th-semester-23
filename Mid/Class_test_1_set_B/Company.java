package Class_test_1_set_B;

/* Question 1: Implement the method in Employee class as per the main method. */
class Employee {
    private double employeeSalary;
    private String employeeName;
    private int employeeID;
    // write your code here

    public void setSalary(double salary) {
        this.employeeSalary = salary;
    }

    public void setID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(String name) {
        this.employeeName = name;
    }

    public String getName() {
        return employeeName;
    }

    public int getID() {
        return employeeID;
    }

}

public class Company {
    public static void main(String[] args) {
        Employee Ahmodullah = new Employee();
        Ahmodullah.setSalary(30000.00);
        Ahmodullah.setName("Ahmodullah");
        Ahmodullah.setID(12322);
        System.out.println(Ahmodullah.getName() + " " + Ahmodullah.getID());
    }

}
