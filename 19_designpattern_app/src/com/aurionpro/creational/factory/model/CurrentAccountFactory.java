package com.aurionpro.creational.factory.model;

public class CurrentAccountFactory implements IAccountFactory  {

	@Override
	public IAccount createAccount(int accountNumber, String name, double balance) {
		
		
		return new CurrentAccount( accountNumber,  name,  balance);
	}

}