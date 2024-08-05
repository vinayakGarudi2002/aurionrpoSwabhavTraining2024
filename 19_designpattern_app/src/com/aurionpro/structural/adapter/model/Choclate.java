package com.aurionpro.structural.adapter.model;

public class Choclate  implements IItems {
	
	private String name;
	private double mrp;
	
	

	public Choclate(String name, double mrp) {
		super();
		this.name = name;
		this.mrp = mrp;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getMrp() {
		return mrp;
	}


	public void setMrp(double mrp) {
		this.mrp = mrp;
	}


	@Override
	public String getItemName() {
		
		return name;
	}

	@Override
	public double getItemPrice() {
		// TODO Auto-generated method stub
		return mrp;
	}

}
