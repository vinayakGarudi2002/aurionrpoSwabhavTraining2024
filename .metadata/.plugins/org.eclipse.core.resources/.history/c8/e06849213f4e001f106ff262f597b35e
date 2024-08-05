package com.aurionpo.dip.violation.model;

public class TaxCalculator {
	
	private DBLogger dblogger;

	public TaxCalculator(DBLogger dblogger) {
		super();
		this.dblogger = dblogger;
	}
	
	public int calculate(int amount , int rate) {
		int tax=0;
		
		try {
			tax=amount/rate;
			return tax;
		}catch(Exception e) {
			new DBLogger().log("rate can not be zero");
		}
		
		return tax;
	}

}
