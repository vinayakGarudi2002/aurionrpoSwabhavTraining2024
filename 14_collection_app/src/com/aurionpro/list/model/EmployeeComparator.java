package com.aurionpro.list.model;

import java.util.Comparator;

public class EmployeeComparator {
	
	public static class EmployeeNameComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee Employee1, Employee Employee2) {
			// TODO Auto-generated method stub
		
			return Employee1.getName().compareTo(Employee2.getName());
		}

	}
	
	public static class EmployeeSalaryComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee Employee1, Employee Employee2) {
			// TODO Auto-generated method stub
			if(Employee1.getsalary()>Employee2.getsalary()) {
				return 1;
			}
			
			if(Employee1.getsalary()<Employee2.getsalary()) {
				return -1;
			}
			return 0;
		}

	}
	
	public static class EmployeeIdComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee Employee1, Employee Employee2) {
			// TODO Auto-generated method stub
			if(Employee1.getemployeeId()>Employee2.getemployeeId()) {
				return 1;
			}
			
			if(Employee1.getemployeeId()<Employee2.getemployeeId()) {
				return -1;
			}
			return 0;
		}

	}


}
