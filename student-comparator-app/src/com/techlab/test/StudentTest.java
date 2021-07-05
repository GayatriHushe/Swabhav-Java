package com.techlab.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import com.techlab.model.StuCgpaComparator;
import com.techlab.model.StuIdComparator;
import com.techlab.model.StuNameComparator;
import com.techlab.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		
		Student s1=new Student(1,"xyz",9,"a");  
		Student s2=new Student(2,"mno",7,"b");  
		Student s3=new Student(3,"def",10,"a");  
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		System.out.println("Before Sorting : ");
		Iterator i=list.iterator();
		while(i.hasNext())
			System.out.println(i.next());

		System.out.println("After Sorting  using Name : ");
		Collections.sort(list,new StuNameComparator());
		Iterator i2=list.iterator();
		while(i2.hasNext())
			System.out.println(i2.next());

		System.out.println("After Sorting  using Id : ");
		Collections.sort(list,new StuIdComparator());
		Iterator i3=list.iterator();
		while(i3.hasNext())
			System.out.println(i3.next());

		System.out.println("After Sorting  using Cgpa : ");
		Collections.sort(list,new StuCgpaComparator());
		Iterator i4=list.iterator();
		while(i4.hasNext())
			System.out.println(i4.next());
	}
}
