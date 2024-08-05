package com.aurionpro.listtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.list.model.Student;
import com.aurionpro.list.model.StudentComparator;
import com.aurionpro.list.model.StudentNameComparator;
import com.aurionpro.list.model.StudentRollNumberComparator;
import com.aurionpro.list.model.StudentpercentageComparator;

public class StudentTest {

	public static void main(String[] args) {
	
		// refactor code using functions
		List<Student> students = new ArrayList<Student>();
		
		Scanner scanner = new Scanner(System.in);
		boolean exitStatus=false;
//		while(!exitStatus) {
//			
//	        System.out.println("Enter Name: ");
//	        String name = scanner.next();
//	        
//	        System.out.println("Enter Roll Number: ");
//	        int rollNumber = scanner.nextInt();
//	        
//	        System.out.println("Enter Percentage: ");
//	        int percentage = scanner.nextInt();
//	        
//	        
//	        
//	        students.add(new Student(rollNumber,name,percentage));
//			
//	        System.out.println("Enter -1 to exit");
//	        int stauts=scanner.nextInt();
//			if(stauts==-1) {
//				exitStatus=true;
//	        	break;
//	        }
//		}
		
		students.add(new Student(123,"sham",98));
		students.add(new Student(223,"sam",99));
		students.add(new Student(323,"ram",69));
		
		System.out.println("Un Sorted Students");
		
		for(Student student:students) {
			System.out.println(student);
		}
		
		System.out.println("Sorting students base on RollNumber");
		
		//Collections.sort(students,new StudentRollNumberComparator());
		
		//Collections.sort(students,new StudentComparator.StudentRollNumberComparator());
		
		Collections.sort(students,new Comparator<Student>(){

			@Override
			public int compare(Student student1, Student student2) {
				// TODO Auto-generated method stub
				if(student1.getRollNumber()>student2.getRollNumber()) {
					return 1;
				}
				
				if(student1.getRollNumber()<student2.getRollNumber()) {
					return -1;
				}
				return 0;
			}
			
		});
		
		for(Student student:students) {
			System.out.println(student);
		}
		
        System.out.println("Sorting students base on Name");
		
		Collections.sort(students,new StudentComparator.StudentNameComparator());
		
		for(Student student:students) {
			System.out.println(student);
		}
		
		    System.out.println("Sorting students base on Percentsge");
			
			Collections.sort(students,new StudentComparator.StudentpercentageComparator());
			
			for(Student student:students) {
				System.out.println(student);
			}


	}

}
