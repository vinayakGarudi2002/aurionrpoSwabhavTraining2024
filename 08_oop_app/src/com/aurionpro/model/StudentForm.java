package com.aurionpro.model;

public class StudentForm {
	
	private int rollNumber;
	private byte age;
	private double percentage;
	private String name;
	
	
	
	
	public StudentForm(int rollNumber, byte age, double percentage, String name) {
		this.rollNumber = rollNumber;
		this.age = age;
		this.percentage = percentage;
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
