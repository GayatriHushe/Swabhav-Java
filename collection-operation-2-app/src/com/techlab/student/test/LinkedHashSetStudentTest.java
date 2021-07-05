package com.techlab.student.test;

import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.techlab.model.Student;

public class LinkedHashSetStudentTest {

	public static void main(String[] args) {
		Set<Student> set=new LinkedHashSet<Student>();
						
		
		/*
		Student s1=new Student(1,"abc",9.5);  
		Student s2=new Student(2,"def",9.0);  
		Student s3=new Student(3,"xyz",10.0);  
		*/
		
		Student s1=new Student(1,"abc",7.0,"a");  
		Student s2=new Student(1,"abc",7.0,"a");  
		Student s3=new Student(1,"abc",7.0,"a");  
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
				        
		Iterator i=set.iterator();
		while(i.hasNext())
			System.out.println(i.next());	
	}
}
