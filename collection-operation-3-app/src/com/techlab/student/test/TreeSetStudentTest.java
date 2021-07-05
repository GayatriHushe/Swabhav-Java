package com.techlab.student.test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.techlab.model.Student;

public class TreeSetStudentTest {

	public static void main(String[] args) {
		Set<Student> set=new TreeSet<Student>();
						
		/*
		Student s1=new Student(1,"abc",9.5);  
		Student s2=new Student(2,"def",9.0);  
		Student s3=new Student(3,"xyz",10.0);  
		*/
		
		Student s1=new Student(1,"abc",7.0,"a");  
		Student s2=new Student(1,"abc",7.0,"b");  
		Student s3=new Student(1,"abc",7.0,"a");  
		//Student s4=new Student(1,"abc",7.0,"b");
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		//set.add(s4);
				        
		Iterator<Student> i=set.iterator();
		while(i.hasNext())
			System.out.println(i.next());	
	}
}
