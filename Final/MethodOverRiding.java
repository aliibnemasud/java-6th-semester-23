package Final;

class MethodOverRiding {
    public void animalSound() {
        System.out.println("Hello");
    }
}

class Pigg extends MethodOverRiding {

    // This is over riding...
    public void animalSound() {
        System.out.println("We we....");
    }

    // This is method overloading
    public void animalSound(int animalNumber) {
        System.out.println(animalNumber + " Ding Dong....!!!");
    }

    public void animalSound(double dogAge, int dogNumber) {
        System.out.println("Age: "+ dogAge + " Number of dog: "+ dogNumber);
    }
}

class Main {
    public static void main(String[] arg) {
        Pigg pig1 = new Pigg();
        pig1.animalSound();
        pig1.animalSound(52);
        pig1.animalSound(52, 12);
    }
}