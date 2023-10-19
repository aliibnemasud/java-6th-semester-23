package Class_test_1_set_A;

/* Question 1: See the following code and answer the questions carefully. Create an object of the
BankAccount class. Set account balance as 10000.00 and set the account holder name as your
name from the main method. Then print your name and salary from main method. */

class BankAccount {
    private double accountBalance;
    private String accountHolderName;

    public void setBalance(double balance) {
        accountBalance = balance;
    }
    public void setName(String name) {
        accountHolderName = name;
    }
    public String getName() {
        return accountHolderName;

    }
    public double getBalance() {
        return accountBalance;
    }
}

public class Bank {
    public static void main(String[] args) {
        // Write your code here
        BankAccount Selim = new BankAccount();
        Selim.setBalance(10000.00);
        Selim.setName("Selim Reza");
        System.out.println(Selim.getName());
        System.out.println(Selim.getBalance());
    }
}
