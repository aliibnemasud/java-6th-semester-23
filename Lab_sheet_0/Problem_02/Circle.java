package Lab_sheet_0.Problem_02;

/* 2. Create a class Circle with attributes radius and methods to calculate
area and circumference. Set the access of the attributes to private */

public class Circle {
    private double radius;
    private final double pi = 3.1416;
    // create a constructor
    public Circle(double radius){
        this.radius = radius;
    }
    // create a method for calculate circumference.
    public void circumference(){
        double result = 2 * pi * radius;
        System.out.println(result);
    }
    public static void main (String [] arg){
        Circle obj = new Circle(2.5);
        obj.circumference();        
    };
};
