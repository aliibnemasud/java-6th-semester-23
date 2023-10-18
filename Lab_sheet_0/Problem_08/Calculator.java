package Lab_sheet_0.Problem_08;

/* 8. Create a class Calculator with methods for addition, subtraction,
multiplication, and division. Set the access of the attributes to private. */

public class Calculator {
    private double result;

    // Method to perform addition
    public double addition(double num1, double num2) {
        result = num1 + num2;
        return result;
    }

    // Method to perform subtraction
    public double subtraction(double num1, double num2) {
        result = num1 - num2;
        return result;
    }

    // Method to perform multiplication
    public double multiplication(double num1, double num2) {
        result = num1 * num2;
        return result;
    }

    // Method to perform division
    public double division(double num1, double num2) {
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            System.out.println("Division by zero is not allowed.");
            result = Double.NaN;  // Return Not-a-Number for division by zero
        }
        return result;
    }    

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double num1 = 10.0;
        double num2 = 5.0;

        System.out.println("Performing operations on " + num1 + " and " + num2);

        double additionResult = calculator.addition(num1, num2);
        System.out.println("Addition result: " + additionResult);

        double subtractionResult = calculator.subtraction(num1, num2);
        System.out.println("Subtraction result: " + subtractionResult);

        double multiplicationResult = calculator.subtraction(num1, num2);
        System.out.println("Multiplication result: " + multiplicationResult);

        double divisionResult = calculator.division(num1, num2);
        System.out.println("Division result: " + divisionResult);
    }
}

