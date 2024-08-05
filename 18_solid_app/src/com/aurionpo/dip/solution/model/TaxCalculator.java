package com.aurionpo.dip.solution.model;

public class TaxCalculator {
	
	private ILogger logger;


	
	public int calculate(int amount , int rate) {
		int tax=0;
		
		try {
			tax=amount/rate;
			return tax;
		}catch(Exception e) {
			//new ILogger().log("rate can not be zero");
			new DBLogger().log("Divde by zero");
			new FileLogger().log("Divde by zero");
		}
		
		return tax;
	}

}
