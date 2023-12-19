package Practice_sheet_2;

public class Dog {
    private String color = "Black";
    // your code here

    // Define Constructor
    public Dog(String color){
     this.color = color;
    }
    // Method for change color.
    public void changeColor(String color) {
        this.color = color;
    }
    //  Method for barking dog print. 
    public void bark() {
        System.out.println(this.color + " dog is barking");
    }
}

// Complete the Dog class so the main method above produces the following
// output:

/*
 * Red dog is barking
 * Blue dog is barking
 * Brown dog is barking
 */
