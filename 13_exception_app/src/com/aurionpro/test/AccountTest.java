package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.exception.InsufficientBalanceException;
import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = null;

        while (true) {
            System.out.println("\n1. Create Account");
            System.out.println("2. Credit Amount");
            System.out.println("3. Debit Amount");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    long accountNumber = scanner.nextLong();
                    System.out.print("Enter initial balance: ");
                    double balance = scanner.nextDouble();
                    System.out.print("Enter account holder's name: ");
                    scanner.nextLine();  // consume newline
                    String name = scanner.nextLine();
                    account = new Account(accountNumber, balance, name);
                    System.out.println("Account created successfully.");
                    break;

                case 2:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                        break;
                    }
                    System.out.print("Enter amount to credit: ");
                    int creditAmount = scanner.nextInt();
                    account.credit(creditAmount);
                    break;

                case 3:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                        break;
                    }
                    System.out.print("Enter amount to debit: ");
                    int debitAmount = scanner.nextInt();
                    try {
                        account.debit(debitAmount);
                    } catch (InsufficientBalanceException e) {
                        System.out.println("Insufficient balance to debit " + debitAmount);
                    }
                    break;

                case 4:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                        break;
                    }
                    System.out.println("Current balance: " + account.getBalance());
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
