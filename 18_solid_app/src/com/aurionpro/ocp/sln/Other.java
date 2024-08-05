package com.aurionpro.ocp.sln;

public class Other implements IFestivalInterest {

	private double interest;
	

	public Other() {
		super();
		this.interest = 6.5;
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
