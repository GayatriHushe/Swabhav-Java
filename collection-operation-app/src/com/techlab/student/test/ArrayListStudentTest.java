package com.techlab.student.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.techlab.model.Student;

public class ArrayListStudentTest {

	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<Student>();
		
		Student s1=new Student(1,"abc",9.5);  
		Student s2=new Student(2,"def",9.0);  
		Student s3=new Student(3,"xyz",10.0);  
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		
		Iterator i=list.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	

	}

}
