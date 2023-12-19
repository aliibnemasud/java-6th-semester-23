package Lab_sheet_0.Problem_13;

/* 13. Create a class Shape with attributes color, area, shapeName and
a method draw(), calculateArea(),changeColor(). Create objects of
the class named Circle and Square. Set the access of the attributes
to private. */

class Shape {
    private String color;
    private double area;
    private String shapeName;

    public Shape(String color, String shapeName) {
        this.color = color;
        this.shapeName = shapeName;
    }

    public void draw() {
        System.out.println("Drawing " + shapeName);
    }

    public void calculateArea() {
        // This method will be overridden in subclasses
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for area
    protected void setArea(double area) {
        this.area = area;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color, "Circle");
        this.radius = radius;
        calculateArea();
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        setArea(area);
    }

    public double getRadius() {
        return radius;
    }
}

class Square extends Shape {
    private double side;

    public Square(String color, double side) {
        super(color, "Square");
        this.side = side;
        calculateArea();
    }

    @Override
    public void calculateArea() {
        double area = side * side;
        setArea(area);
    }

    public double getSide() {
        return side;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Square square = new Square("Blue", 4.0);

        circle.draw();
        System.out.println("Color of Circle: " + circle.getColor());
        System.out.println("Radius of Circle: " + circle.getRadius());
        System.out.println("Area of Circle: " + circle.getColor());

        square.draw();
        System.out.println("Color of Square: " + square.getColor());
        System.out.println("Side of Square: " + square.getSide());
        System.out.println("Area of Square: " + square.getColor());
    }
}

