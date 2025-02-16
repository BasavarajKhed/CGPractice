package com.assignment;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Integer, Account> accounts = new HashMap<>();

   
    public void createAccount(int accountNumber, String customerName, double initialBalance) {
        if (!accounts.containsKey(accountNumber)) {
            Account newAccount = new Account(accountNumber, customerName, initialBalance);
            accounts.put(accountNumber, newAccount);
            System.out.println("Account created for " + customerName + " with account number " + accountNumber);
        } else {
            System.out.println("Account with number " + accountNumber + " already exists.");
        }
    }

    // Deposit money into an account
    public void deposit(int accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account number " + accountNumber + " not found.");
        }
    }

  
    public void withdraw(int accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account number " + accountNumber + " not found.");
        }
    }

   
    public void checkBalance(int accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println("Account balance for account number " + accountNumber + ": " + account.getBalance());
        } else {
            System.out.println("Account number " + accountNumber + " not found.");
        }
    }

  
    public void listAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            System.out.println("Listing all accounts:");
            for (Account account : accounts.values()) {
                account.displayAccountDetails();
            }
        }
    }
}

