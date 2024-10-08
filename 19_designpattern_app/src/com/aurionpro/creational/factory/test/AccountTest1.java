package com.aurionpro.creational.factory.test;

import java.util.Scanner;

import com.aurionpro.creational.factory.model.AccountFactory;
import com.aurionpro.creational.factory.model.AccountType;
import com.aurionpro.creational.factory.model.CurrentAccountFactory;
import com.aurionpro.creational.factory.model.IAccount;
import com.aurionpro.creational.factory.model.IAccountFactory;
import com.aurionpro.creational.factory.model.SavingAccountFactory;

public class AccountTest1 {
	
	public static void main(String[] args) {
		
		IAccountFactory accountMaker=new SavingAccountFactory();
		
		IAccount account = accountMaker.createAccount(1234, "Vinayak", 20000);
		
		performTransaction(account);
		
		
         accountMaker=new CurrentAccountFactory();
		
		 account = accountMaker.createAccount(1234, "Vinayak", 20000);
		
		  performTransaction(account);
		
	}
	
	
	

private static void performTransaction(IAccount bankAccount) {
	  
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
	                  
	                    	bankAccount.credit(creditAmount);
	                   
	                    break;
	                case 3:
	                    System.out.print("Enter amount to debit: ");
	                    double debitAmount = scanner.nextDouble();
	                    
	                 
	                    	bankAccount.debit(debitAmount);
	                   
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




private static void displayAccountDetails(IAccount bankAccount) {
	
	System.out.println(bankAccount);
	
}

}

