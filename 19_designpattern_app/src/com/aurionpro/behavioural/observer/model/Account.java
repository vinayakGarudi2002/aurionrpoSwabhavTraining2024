package com.aurionpro.behavioural.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	
	private int accountNumber;
	private String Name;
	private double balance;
	List<INotifirer> notifires;
	
	List<INotify> notifyres;
	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		Name = name;
		this.balance = balance;
		this.notifires = new ArrayList<INotifirer>();
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public List<INotifirer> getNotifires() {
		return notifires;
	}
	public void setNotifires(List<INotifirer> notifires) {
		this.notifires = notifires;
	}
	
	public void deposit(double amount) {
		if(amount<0) {
			System.out.println("Enter Valid Amount");
			notification("Transaction Failed");
			return;
		}
		double prevBalance = balance;
		balance = amount + balance;
		
		notification("amount credited: "+amount+" current balance: "+balance+" previus balance: "+prevBalance);
	}
	
	
	public void withdraw(double amount) {
		if(amount<0) {
			System.out.println("Enter Valid Amount");
			notification("Transaction Failed");
			return;
		}
		
		if(amount>balance) {
			System.out.println("Insufficient balance");
			notification("Transaction Failed");
			return;
		}
		double prevBalance = balance;
		balance =   balance-amount;
		
		notification("amount debited: "+amount+" current balance: "+balance+" previus balance: "+prevBalance);
	}
	
	
	private void notification(String string) {
		for(INotifirer notifier:notifires) {
			notifier.notify(string);
		}
		
	}
	private void notificaton(String opreation) {
		for(INotifirer notifier:notifires) {
			//notifier.notifiy():
		}
		
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", Name=" + Name + ", balance=" + balance + ", notifires="
				+ notifires + "]";
	}
	public void registerNotifier(INotifirer notifier) {
		notifires.add(notifier);
	}
	
	public void registerNotifier(INotify notifier) {
		notifyres.add(notifier);
	}
	
	
	

}
