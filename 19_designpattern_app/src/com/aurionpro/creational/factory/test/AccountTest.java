package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.AccountFactory;
import com.aurionpro.creational.factory.model.AccountType;
import com.aurionpro.creational.factory.model.IAccount;

public class AccountTest {
	
	public static void main(String[] args) {
		IAccount account = AccountFactory.cretateAccount(AccountType.Saving, 12345, "vinayak", 2000);
		System.out.println("Accouunt Detail");
		System.out.println(account);
		account.credit(1200);
		account.debit(1000);
		System.out.println("Accouunt Detail");
		System.out.println(account);
		
		System.out.println("");
		System.out.println("Creating second Account");
		account = AccountFactory.cretateAccount(AccountType.Current, 12345, "sham", 2000);
		System.out.println("Accouunt Detail");
		System.out.println(account);
		account.credit(1200);
		account.debit(1000);
		System.out.println("Accouunt Detail");
		System.out.println(account);
	}
	
}
