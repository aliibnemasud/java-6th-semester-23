package Lab_sheet_0.Problem_10;

/* 10. Create a class Bank with a list of bank accounts. Implement
methods to add an account, remove an account, and find an account
by account number.Set the access of the attributes to private. */

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    // Method to add an account
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    // Method to remove an account by account number
    public void removeAccount(int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                accounts.remove(account);
                return;
            }
        }
        System.out.println("Account with account number " + accountNumber + " not found.");
    }

    // Method to find an account by account number
    public BankAccount findAccountByNumber(int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        BankAccount account1 = new BankAccount(1001, "John Doe", 5000.0);
        BankAccount account2 = new BankAccount(1002, "Jane Smith", 8000.0);

        bank.addAccount(account1);
        bank.addAccount(account2);

        // Find account by account number
        BankAccount foundAccount = bank.findAccountByNumber(1002);
        if (foundAccount != null) {
            System.out.println("Account found: " + foundAccount.getAccountHolderName());
        } else {
            System.out.println("Account not found.");
        }

        // Remove an account
        bank.removeAccount(1001);

        // Try to find the removed account
        foundAccount = bank.findAccountByNumber(1001);
        if (foundAccount != null) {
            System.out.println("Account found: " + foundAccount.getAccountHolderName());
        } else {
            System.out.println("Account not found.");
        }
    }
}

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}

