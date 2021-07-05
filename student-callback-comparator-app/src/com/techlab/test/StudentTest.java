package com.techlab.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.techlab.model.sortByCgpaStrategy;
import com.techlab.model.sortByIdStrategy;
import com.techlab.model.sortByNameStrategy;
import com.techlab.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		//ArrayList<Student> studentsList=new ArrayList<Student>();
		Set<Student> students=new TreeSet<Student>(new sortByNameStrategy());
		
		Student s1=new Student(1,"xyz",9,"a");  
		Student s2=new Student(2,"mno",7,"b");  
		Student s3=new Student(3,"def",10,"a");  
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		/*
		System.out.println("Before sorting : ");
		Iterator i=studentsList.iterator();
		while(i.hasNext())
			System.out.println(i.next());
			*/
		
		System.out.println("Sorting by Name : ");
		Iterator i1=students.iterator();
		while(i1.hasNext())
			System.out.println(i1.next());
		
		

		
	}
}
