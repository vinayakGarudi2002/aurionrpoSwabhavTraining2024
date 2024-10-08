package com.aurionpro.structural.adapter.model;

public class HatAdapter implements IItems {
	
	private Hat hat;
	
	

	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}
	
	

	public Hat getHat() {
		return hat;
	}



	public void setHat(Hat hat) {
		this.hat = hat;
	}



	@Override
	public String getItemName() {
		
		return hat.getShortName()+" "+hat.getLongName();
	}

	@Override
	public double getItemPrice() {
		// TODO Auto-generated method stub
		return hat.getBasePrice();
	}

}
