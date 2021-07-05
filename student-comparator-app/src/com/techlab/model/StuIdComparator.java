package com.techlab.model;

import java.util.Comparator;

public class StuIdComparator implements Comparator<Student> {

	public int compare(Student s1, Student s2) {

		   int StudentId1 = s1.getId();
		   int StudentId2 = s2.getId();

		   /*For ascending order*/
		   return StudentId1-StudentId2;

		   /*For descending order*/
		   //StudentId2-StudentId1;
	   }
}
