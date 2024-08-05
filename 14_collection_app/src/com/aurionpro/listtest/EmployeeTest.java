package com.aurionpro.listtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.list.model.Employee;
import com.aurionpro.list.model.EmployeeComparator;
import com.aurionpro.list.model.EmployeeComparator.EmployeeIdComparator;

public class EmployeeTest {

	public static void main(String[] args) {


		// refactor code using functions
				List<Employee> employees = new ArrayList<Employee>();
				
				Scanner scanner = new Scanner(System.in);
				boolean exitStatus=false;
//				while(!exitStatus) {
//					
//			        System.out.println("Enter Name: ");
//			        String name = scanner.next();
//			        
//			        System.out.println("Enter Id: ");
//			        int id = scanner.nextInt();
//			        
//			        System.out.println("Enter Salary: ");
//			        int salary = scanner.nextInt();
//			        
//			        
//			        
//			        employees.add(new Employee(id,name,salary));
//					
//			        System.out.println("Enter -1 to exit");
//			        int stauts=scanner.nextInt();
//					if(stauts==-1) {
//						exitStatus=true;
//			        	break;
//			        }
//				}
//				
				employees.add(new Employee(123,"sham",9800));
				employees.add(new Employee(623,"sam",9900));
				employees.add(new Employee(323,"ram",6900));
				
				System.out.println("Un Sorted Employees");
				
				for(Employee employee:employees) {
					System.out.println(employee);
				}
				
				System.out.println("Sorting Employees base on Id");
				
				//Collections.sort(Employees,new EmployeeRollNumberComparator());
				
				Collections.sort(employees,new EmployeeComparator.EmployeeIdComparator());
				
				for(Employee employee:employees) {
					System.out.println(employee);
				}
				
		        System.out.println("Sorting Employees base on Salary");
				
		        Collections.sort(employees,new EmployeeComparator.EmployeeSalaryComparator());
				
				for(Employee employee:employees) {
					System.out.println(employee);
				}
				
				    System.out.println("Sorting Employees base on Name");
					
				    Collections.sort(employees,new EmployeeComparator.EmployeeNameComparator());
					
					for(Employee employee:employees) {
						System.out.println(employee);
					}



	}

}
