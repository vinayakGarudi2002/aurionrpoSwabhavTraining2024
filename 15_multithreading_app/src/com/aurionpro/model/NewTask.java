package com.aurionpro.model;

import java.util.concurrent.Callable;

public class NewTask implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "I am in: "+(int)(Math.random()*100);
	}

}
