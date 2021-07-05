package com.techlab.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.techlab.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		
		Student s1=new Student(1,"abc",9,"a");  
		Student s2=new Student(2,"def",7,"b");  
		Student s3=new Student(3,"xyz",10,"a");  
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		System.out.println("Before Sorting : ");
		Iterator i=list.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	
		
		System.out.println("After Sorting : ");
		Collections.sort(list);
		Iterator i2=list.iterator();
		while(i2.hasNext())
			System.out.println(i2.next());
	}

}
