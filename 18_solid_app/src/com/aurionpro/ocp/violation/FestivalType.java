package com.aurionpro.ocp.violation;

public enum FestivalType {
	
	
	NEWYEAR(8),DIWALI(8.5),holi(7.5),Other(6.5);
	
	private double  intrestRate;

	public double getIntrestRate() {
		return intrestRate;
	}

	public void setIntrestRate(double intrestRate) {
		this.intrestRate = intrestRate;
	}

	private FestivalType(double intrestRate) {
		this.intrestRate = intrestRate;
	}

}
