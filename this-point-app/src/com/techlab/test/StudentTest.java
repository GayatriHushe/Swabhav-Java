package com.techlab.test;

import com.techlab.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student s1=new Student(1,"abc",19);
		printInfo(s1);
		
		Student s2=new Student(2,"xyz",17);
		printInfo(s2);
		
		Student elder=s1.whoIsElder(s2);
		System.out.println("Elder : "+elder.getName());
		printInfo(s1);
		
		Student s3=new Student(3,"def");
		printInfo(s3);
	}

	private static void printInfo(Student s) {
		System.out.println("Id : "+s.getId());
		System.out.println("Name : "+s.getName());
		System.out.println("Age : "+s.getAge());
		System.out.println("Hashcode : "+s.hashCode());
		System.out.println();
		}
}
