package Class_test_1_set_D;

/* Question 1:Complete the methods in Circle class. Also write the output of the code. */
class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        // write your code here
        return radius;
    }

    public void setRadius(double radius) {
        // write your code her
        this.radius = radius;
    }
    // Method to calculate the area of the circle.Circle area = 3.14*radius*radius

    public double calculateArea() {
        double area = 3.1416 * radius * radius;
        return area;
    }

    public double calculateCircumference() {
        double Circumference = 2 * 3.1416 * radius;
        return Circumference;
    }

    // write your code her

    public static void main(String[] args) {
        // Example usage of the Circle class
        Circle circle1 = new Circle(5.0);
        System.out.println("Circle Radius: " + circle1.getRadius());
        System.out.println("Circle Area: " + circle1.calculateArea());
        System.out.println("Circle Circumference: " + circle1.calculateCircumference());
    }
}