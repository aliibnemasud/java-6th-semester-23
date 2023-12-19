package Final;

class Exc2 {
    static void subroutine() {
        int d = 0;
        int a = 10 / d;
    }

}

class Test {
    // Exc2 ex = new Exc2();
    public static void main(String[] args) {
        try {
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[10]);
            System.out.println("This line is after error");
        } catch (ArrayIndexOutOfBoundsException e) {
            // catch deivide by zero error
            System.out.println("Divide by zero exception");
            System.out.println("This line is in the catch statement");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
        System.out.println("This line is after the catch statement");
    }
}
