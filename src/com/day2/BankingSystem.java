package com.day2;

import java.util.List;
import java.util.ArrayList;

public class BankingSystem {
	public static void main(String[] args) {

		Customer customer = new Customer("John Doe", "C12345");

		BankAccount savingsAccount = new BankAccount("SA1001", 1500, "Savings");
		BankAccount currentAccount = new BankAccount("CA1001", 3000, "Current");

		customer.addBankAccount(savingsAccount);
		customer.addBankAccount(currentAccount);

		System.out.println("Initial Balances:");
		System.out.println("Savings Account: " + savingsAccount.getBalance());
		System.out.println("Current Account: " + currentAccount.getBalance());

		try {
			customer.transferFunds("SA1001", "CA1001", 500);
			System.out.println("\nAfter transfer of 500 from Savings to Current:");
			System.out.println("Savings Account: " + savingsAccount.getBalance());
			System.out.println("Current Account: " + currentAccount.getBalance());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		try {
			customer.transferFunds("CA1001", "SA1001", 10000); // Trying to overdraft beyond limit
		} catch (Exception e) {
			System.out.println("\nError: " + e.getMessage());
		}
	}
}
