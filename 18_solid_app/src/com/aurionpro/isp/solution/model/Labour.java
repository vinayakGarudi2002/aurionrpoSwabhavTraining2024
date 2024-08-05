package com.aurionpro.isp.solution.model;

public class Labour implements IWorker , ILunchTime {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Started Working");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Stoped Working");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Started Eating");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Drinking");
	}

}
