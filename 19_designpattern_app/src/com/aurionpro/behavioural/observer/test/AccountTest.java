package com.aurionpro.behavioural.observer.test;

import java.util.Scanner;

import com.aurionpro.behavioural.observer.model.Account;
import com.aurionpro.behavioural.observer.model.EmailNotifier;
import com.aurionpro.behavioural.observer.model.SmsNotifier;
import com.aurionpro.creational.factory.model.IAccount;

public class AccountTest {
	
	public static void main(String[] args) {
		Account account = new Account(1234,"vinayak",12000);
		
		
		
//		account.registerNotifier(new SmsNotifier());
//		account.registerNotifier(new EmailNotifier());
		
		account.deposit(1200);
		account.withdraw(1000);
		
		performTransaction(account);

	}
	
	private static void performTransaction(Account bankAccount) {
		  
		  Scanner scanner = new Scanner(System.in);
		  
		  boolean quitStatus=false;
			
			displayAccountDetails(bankAccount);
			
			 while (!quitStatus) {
		            System.out.println("Choose an option:");
		            System.out.println("1. View Balance");
		            System.out.println("2. Credit Amount");
		            System.out.println("3. Debit Amount");
		            System.out.println("4. Exit");

		            int choice = scanner.nextInt();
		            switch (choice) {
		                case 1:
		                    System.out.println("Balance: " + bankAccount.getBalance());
		                    break;
		                case 2:
		                    System.out.print("Enter amount to credit: ");
		                    double creditAmount = scanner.nextDouble();
		                  
		                    	bankAccount.deposit(creditAmount);
		                   
		                    break;
		                case 3:
		                    System.out.print("Enter amount to debit: ");
		                    double debitAmount = scanner.nextDouble();
		                    
		                 
		                    	bankAccount.withdraw(debitAmount);
		                   
		                    break;
		                case 4:
		                	quitStatus = true;
		                    System.out.println("Thank you for banking with us!");
		                    break;
		                default:
		                    System.out.println("Invalid option, please try again.");
		                    break;
		            }
		        }	
	}

	private static void displayAccountDetails(Account bankAccount) {
		System.out.println(bankAccount);
		
	}

}
