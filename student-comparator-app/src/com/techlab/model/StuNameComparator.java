package com.techlab.model;

import java.util.Comparator;

public class StuNameComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		   String StudentName1 = s1.getName().toUpperCase();
		   String StudentName2 = s2.getName().toUpperCase();
		   //ascending order
		   return StudentName1.compareTo(StudentName2);

		   //descending order
		   //return StudentName2.compareTo(StudentName1);
	    }

	

}
