package com.aurionpro.ocp.sln;

public class Diwali implements IFestivalInterest {
	
	private double interest;
	

	public Diwali() {
		super();
		this.interest = 8.5;
	}


	public double getInterest() {
		return interest;
	}


	public void setInterest(double interest) {
		this.interest = interest;
	}


	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return interest;
	}

}
