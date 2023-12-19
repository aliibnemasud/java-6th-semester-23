package Lab_sheet_0.Problem_11;

/* 11. Create a class Product with attributes name, price, and quantity.
Implement a method to calculate the total value of a product. Set the
access of the attributes to private. */

public class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate the total value of the product
    public double calculateTotalValue() {
        return price * quantity;
    }    

    public static void main(String[] args) {
        Product product = new Product("Laptop", 1000.0, 5);
        
        double totalValue = product.calculateTotalValue();
        System.out.println("Total Value: $" + totalValue);
    }
}

