package com.aurionpro.creational.sigleton.test;

import com.aurionpro.creational.sigleton.model.Login;

public class LoginTest {
	
	public static void main(String[] args) {
		Login login1=Login.getLogin();
		login1.status();
		
	
		
		Login login2=Login.getLogin();
		login2.status();
	}
	

}
