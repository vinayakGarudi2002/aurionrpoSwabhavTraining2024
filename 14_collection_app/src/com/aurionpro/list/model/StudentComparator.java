package com.aurionpro.list.model;

import java.util.Comparator;

public class StudentComparator {
	
	public static class StudentNameComparator implements Comparator<Student> {

		@Override
		public int compare(Student student1, Student student2) {
			// TODO Auto-generated method stub
		
			return student1.getName().compareTo(student2.getName());
		}

	}
	
	public static class StudentpercentageComparator implements Comparator<Student> {

		@Override
		public int compare(Student student1, Student student2) {
			// TODO Auto-generated method stub
			if(student1.getPercentage()>student2.getPercentage()) {
				return 1;
			}
			
			if(student1.getPercentage()<student2.getPercentage()) {
				return -1;
			}
			return 0;
		}

	}
	
	public static class StudentRollNumberComparator implements Comparator<Student> {

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

	}


}
