package com.day2;

import java.util.ArrayList;
import java.util.List;

class Customer {
	private String name;
	private String customerID;
	private List<BankAccount> bankAccounts;

	// Constructor to initialize customer details and bank accounts
	public Customer(String name, String customerID) {
		this.name = name;
		this.customerID = customerID;
		this.bankAccounts = new ArrayList<>();
	}

	// Method to add a bank account for the customer
	public void addBankAccount(BankAccount account) {
		bankAccounts.add(account);
	}

	// Method to find a bank account by account number
	public BankAccount findAccountByNumber(String accountNumber) {
		for (BankAccount account : bankAccounts) {
			if (account.getAccountNumber().equals(accountNumber)) {
				return account;
			}
		}
		return null; // Account not found
	}

	// Method for the customer to transfer funds between their own accounts
	public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount) {
		BankAccount fromAccount = findAccountByNumber(fromAccountNumber);
		BankAccount toAccount = findAccountByNumber(toAccountNumber);

		if (fromAccount == null || toAccount == null) {
			throw new IllegalArgumentException("One or both account numbers are invalid.");
		}

		// Transfer funds between the two accounts
		fromAccount.transfer(amount, toAccount);
	}
}
