package Lab_sheet_0.Problem_07;

/* 7. Create a class Car with attributes make, model, speed and year.
Implement methods to start the car and stop the car.Set the access of
the attributes to private.
Also implement the following methods -

- goFast
- goSlow
- useBrake
- changeGear
- goRight
- goLeft
- goBackward */

public class Car {
    private String make;
    private String model;
    private int speed;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.speed = 0;
        this.year = year;
    }

    // Method to start the car
    public void startCar() {
        System.out.println("Car started.");
    }

    // Method to stop the car
    public void stopCar() {
        System.out.println("Car stopped.");
    }

    // Method to accelerate (go faster)
    public void goFast() {
        speed += 10;
        System.out.println("Speed increased. Current speed: " + speed);
    }

    // Method to decelerate (go slower)
    public void goSlow() {
        speed -= 10;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println("Speed decreased. Current speed: " + speed);
    }

    // Method to use the brake
    public void useBrake() {
        System.out.println("Brake applied.");
    }

    // Method to change gear
    public void changeGear(int gear) {
        System.out.println("Changed to gear " + gear);
    }

    // Method to turn right
    public void goRight() {
        System.out.println("Car turned right.");
    }

    // Method to turn left
    public void goLeft() {
        System.out.println("Car turned left.");
    }

    // Method to go backward
    public void goBackward() {
        System.out.println("Car moving backward.");
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2021);

        // Start the car
        myCar.startCar();

        // Accelerate
        myCar.goFast();

        // Change gear
        myCar.changeGear(2);

        // Turn right
        myCar.goRight();

        // Slow down
        myCar.goSlow();

        // Stop the car
        myCar.stopCar();
    }
}
