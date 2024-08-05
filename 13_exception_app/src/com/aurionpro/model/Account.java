package com.aurionpro.model;

import com.aurionpro.exception.InsufficientBalanceException;

public class Account {

    private long accountNumber;
    private double balance;
    private String name;



	public Account(long accountNumber, double balance, String name) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
	}

	public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    
    public void credit(int amount) {
        if (amount <= 0) {
            System.out.println("Enter a valid amount to credit.");
            return;
        }
        balance += amount;
        System.out.println("Amount credited: " + amount);
    }

    
    public void debit(int amount) {
        if (amount <= 0) {
            System.out.println("Enter a valid amount to debit.");
            return;
        }
        if (balance < amount) {
            throw new InsufficientBalanceException(amount);
        }
        balance -= amount;
        System.out.println("Amount debited: " + amount);
    }

	
}

