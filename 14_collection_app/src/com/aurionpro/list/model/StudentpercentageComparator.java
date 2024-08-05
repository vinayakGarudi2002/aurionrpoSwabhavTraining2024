package com.aurionpro.list.model;

import java.util.Comparator;

public class StudentpercentageComparator implements Comparator<Student> {

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
