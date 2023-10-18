package Practice_sheet_3;

public class Cat {
    public String color = "White";
    public String action = "sitting";
    // your code here

    // Define constructor no parameter 
    public Cat(){        
    }
    // Define constructor one parameter color
    public Cat(String color){
        this.color = color;       
    }
    // Define constructor for two parameter 
    public Cat(String color, String action){
        this.color = color;
        this.action = action;
    }

    // Define a method for print cat
    public void changeColor(String color){        
       this.color = color;
    }

    // Define a method for print cat
    public void printCat(){        
        System.out.println(this.color+" cat is "+this.action);
    };
};

