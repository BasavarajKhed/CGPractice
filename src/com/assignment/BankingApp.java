package com.assignment;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the Simple Banking Application");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. List All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Customer Name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double initialBalance = scanner.nextDouble();
                    bank.createAccount(accountNumber, customerName, initialBalance);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextInt();
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(accountNumber, depositAmount);
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextInt();
                    System.out.print("Enter Withdrawal Amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    bank.withdraw(accountNumber, withdrawalAmount);
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextInt();
                    bank.checkBalance(accountNumber);
                    break;

                case 5:
                    bank.listAllAccounts();
                    break;

                case 6:
                    System.out.println("Thank you for using the banking application.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

