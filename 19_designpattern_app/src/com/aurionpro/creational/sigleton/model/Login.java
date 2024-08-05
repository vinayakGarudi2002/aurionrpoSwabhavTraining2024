package com.aurionpro.creational.sigleton.model;

public class Login {
	
	private static Login login;
	
	
	private Login() {
		System.out.println("Login created");
	}
	
	//this function crates obj of login only when it is needed ,, so it refer as obj creation on demand or lazy ,method of obj creation
	public static Login getLogin() {
		if(login==null) {
			login=new Login();
		}
		
		return login;
	}
	
	public void status() {
		System.out.println("Login succs fully");
	}

}
