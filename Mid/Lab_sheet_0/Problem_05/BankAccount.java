package Lab_sheet_0.Problem_05;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than 0.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful. Current balance: " + balance);
            } else {
                System.out.println("Insufficient funds. Withdrawal amount exceeds current balance.");
            }
        } else {
            System.out.println("Invalid withdrawal amount. Amount must be greater than 0.");
        }
    }

    // Method to get account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Method to get account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Method to get account balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1001, "John Doe", 5000.0);

        System.out.println("Account Details:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(1000.0);
        account.withdraw(2000.0);
        account.withdraw(5000.0);
    };
};

