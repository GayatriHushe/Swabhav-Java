package com.techlab.student.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.techlab.model.Student;

public class HashSetStudentTest {
	public static void main(String[] args) {
		Set<Student> set=new HashSet<Student>();
						
		
		Student s1=new Student(1,"abc",9.5);  
		Student s2=new Student(2,"def",9.0);  
		Student s3=new Student(3,"xyz",10.0);  
		 
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		List<Student> list = new ArrayList<Student>(set);
		        
		Iterator i=set.iterator();
		while(i.hasNext())
			System.out.println(i.next());	
	}
}
