package com.aurionpro.isp.violation.model;

public class Labour implements IWorker {

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
