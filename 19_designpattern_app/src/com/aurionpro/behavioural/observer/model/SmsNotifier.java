package com.aurionpro.behavioural.observer.model;

public class SmsNotifier implements INotifirer,INotify {


	
	
	public void notifiy(String operation,Account account,double amount) {
		
		if(operation=="credit") {
			System.out.println("Account no.: "+account.getAccountNumber()+"amount credited: "+amount+" current balance: "+account.getBalance()+" previus balance: "+(account.getBalance()-amount));
		return;
		}
		
		if(operation=="debit") {
			System.out.println("Account no.: "+account.getAccountNumber()+"amount debited: "+amount+" current balance: "+account.getBalance()+" previus balance: "+(account.getBalance()+amount));
		return;
		}
		
	}

	@Override
	public void notify(String string) {
		System.out.println(string);
		
	}

}
