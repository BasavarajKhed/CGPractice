package com.assignment;

public class Account {
	private int accountNumber;
	private String customerName;
	private double balance;

	public Account(int accountNumber, String customerName, double initialBalance) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = initialBalance;
	}

//	public void deposit(double amount) {
//		if (amount > 0) {
//			balance += amount;
//			System.out.println("Deposited " + amount + " to account " + accountNumber);
//		} else {
//			System.out.println("Invalid deposit amount.");
//		}
//	}
//
//	public void withdraw(double amount) {
//		if (amount > 0 && amount <= balance) {
//			balance -= amount;
//			System.out.println("Withdrew " + amount + " from account " + accountNumber);
//		} else if (amount > balance) {
//			System.out.println("Insufficient balance for withdrawal.");
//		} else {
//			System.out.println("Invalid withdrawal amount.");
//		}
//	}

	public double getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void displayAccountDetails() {
		System.out.println("Account Number: " + accountNumber + ", Name: " + customerName + ", Balance: " + balance);
	}
}
