package com.day2;

class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountType;  
    private static final double SAVINGS_MIN_BALANCE = 1000;
    private static final double OVERDRAFT_LIMIT = 5000; 

   
    public BankAccount(String accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
        
        if (accountType.equals("Savings") && balance < SAVINGS_MIN_BALANCE) {
            throw new IllegalArgumentException("Savings account must have a minimum balance of " + SAVINGS_MIN_BALANCE);
        }
    }

    
    public double getBalance() {
        return balance;
    }

   
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

   
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        
        
        if (accountType.equals("Savings") && (balance - amount) < SAVINGS_MIN_BALANCE) {
            throw new IllegalArgumentException("Savings account must maintain a minimum balance of " + SAVINGS_MIN_BALANCE);
        }
        
        
        if (accountType.equals("Current") && (balance - amount) < -OVERDRAFT_LIMIT) {
            throw new IllegalArgumentException("Overdraft limit exceeded.");
        }
        
        balance -= amount;
    }

   
    public void transfer(double amount, BankAccount targetAccount) {
        if (this == targetAccount) {
            throw new IllegalArgumentException("Cannot transfer to the same account.");
        }
        // Withdraw from the current account
        this.withdraw(amount);
        // Deposit into the target account
        targetAccount.deposit(amount);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }
}

