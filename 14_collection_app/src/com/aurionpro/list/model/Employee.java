package com.aurionpro.list.model;

public class Employee {
	
	int employeeId;
	String name;
	double salary;
	public Employee(int employeeId, String name, double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}
	public int getemployeeId() {
		return employeeId;
	}
	public void setemployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getsalary() {
		return salary;
	}
	public void setsalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Student [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
