package com.techlab.model;

import java.util.Comparator;

public class sortByCgpaStrategy implements Comparator<Student> {
	
	public int compare(Student s1, Student s2) {

		   int StudentCgpa1 = s1.getId();
		   int StudentCgpa2 = s2.getId();

		   /*For ascending order*/
		   return StudentCgpa1-StudentCgpa2;

		   /*For descending order*/
		   //StudentCgpa2-StudentCgpa1;
	  }
}
