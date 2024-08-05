package com.aurionpro.creational.factory.model;

public class SavingAccountFactory implements IAccountFactory  {

	@Override
	public IAccount createAccount(int accountNumber, String name, double balance) {
		
		
		return new SavingAccount( accountNumber,  name,  balance);
	}

}
