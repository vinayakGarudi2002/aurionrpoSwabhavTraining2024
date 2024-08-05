package com.aurionpro.creational.factory.model;

public class AccountFactory {
	
	public static IAccount cretateAccount(AccountType account,int accountNumber, String name, double balance) {
		IAccount newAccount =null;
		
		if(AccountType.Saving==account) {
			newAccount= new SavingAccount( accountNumber,  name,  balance);
		}
         if(AccountType.Current==account) {
        	 newAccount= new CurrentAccount( accountNumber,  name,  balance);
		}
         
         
         //pass refernce of function 
		return newAccount;
	}

}
