package com.aurionpro.isp.violation.model;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot Started Working");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot Stoped Working");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Robot Started Eating");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Robot Drinking");
	}

}
