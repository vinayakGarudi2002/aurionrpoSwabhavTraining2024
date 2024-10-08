package com.aurionpro.creational.factory.model;

public class SavingAccount implements IAccount {
	
	private int accountNumber;
	private String name;
	private double balance;
	

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public SavingAccount(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public void credit(double amount) {
		
		if(amount<0) {
			System.out.println("Entervalid amunt");
			return;
		}
		
		balance = balance+amount;
		
		System.out.println("Amount Credited Succesfully");
   

		
	}

	@Override
	public void debit(double amount) {
		if(amount<0) {
			System.out.println("Entervalid amunt");
			return;
		}
		if(balance<amount) {
			System.out.println("In sufficient  balance");
			return;
		}
		
		balance = balance-amount;
		
		System.out.println("Amount Debited Succesfully");
   
		
	}

	@Override
	public String toString() {
		return "SavingAccount [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}

}
