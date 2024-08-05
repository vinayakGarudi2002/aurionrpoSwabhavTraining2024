package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.StudentForm;

public class StudentFormTest {
	
	

	public static void main(String[] args) {
		
		//StudentForm student= new StudentForm(); 
		
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter Name: ");
	        String name = scanner.nextLine();
	       // student.setName(name);
	        
	        System.out.println("Enter age: ");
	        byte age = (byte)scanner.nextInt();
	        //student.setAge(age);
	        
	        System.out.println("Enter Roll Number: ");
	        int rollNumber = scanner.nextInt();
	        //student.setRollNumber(rollNumber);
	        
	        System.out.println("Enter percentage: ");
	         double percentage = scanner.nextDouble();
	        //student.setPercentage(percentage);
	         
	         StudentForm student= new StudentForm(rollNumber,age,percentage,name); 
	        
	        
	        
	        System.out.println("Name of Student is: "+student.getName());
	        System.out.println("Age of Student is: "+student.getAge());
	        System.out.println("RollNumber of Student is: "+student.getRollNumber());
	        System.out.println("Percentage of Student is: "+student.getPercentage());
	        
	        
	        
	        
	        

	}

}
