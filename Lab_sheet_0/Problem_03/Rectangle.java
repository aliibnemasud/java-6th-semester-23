package Lab_sheet_0.Problem_03;

/* 3. Create a class Rectangle with attributes length and width and
methods to calculate area and perimeter. Set the access of the
attributes to private. */

public class Rectangle {
    private double length;
    private double width;
    //  define constructor
    public Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }
    //  Write a method for calculate area
    void area(){        
        double area = width * length;
        System.out.println(area);
    };
    //  Write a method for calculate area
    void perimeter(){        
        double perimeter = 2 * (width + length);
        System.out.println(perimeter);
    };
    public static void main(String [] arg ){

        Rectangle obj = new Rectangle(2.5, 9);
        obj.area();
        obj.perimeter();
    };    
};
