package com.aurionpro.list.model;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
	
		return student1.getName().compareTo(student2.getName());
	}

}
