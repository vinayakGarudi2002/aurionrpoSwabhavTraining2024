package com.aurionpro.ocp.sln;

public class NewYear implements IFestivalInterest{

	private double interest;
	

	public NewYear() {
		super();
		this.interest = 8;
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
