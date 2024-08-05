package com.aurionpro.structural.facade.mode;

public class IndianHotel implements IHotel {

	@Override
	public IMenu getMenu() {
		// TODO Auto-generated method stub
		return new IndianMenu();
	}

}
