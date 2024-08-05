package com.aurionpro.creational.factory.model;

public interface IAccountFactory {
	
	

	IAccount createAccount(int accountNumber, String name, double balance);

}
