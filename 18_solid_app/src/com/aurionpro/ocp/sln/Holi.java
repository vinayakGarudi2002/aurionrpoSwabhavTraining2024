package com.aurionpro.ocp.sln;

public class Holi implements IFestivalInterest {

	private double interest;
	

	public Holi() {
		super();
		this.interest = 7.5;
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
