package com.techlab.student.test;

import java.util.HashMap;
import java.util.Map;

import com.techlab.model.Student;

public class HashMapStudentTest {

	public static void main(String[] args) {
		Map<Student,Student> map=new HashMap<Student,Student>();
		
		
		Student s1=new Student(1,"abc",7.0,"a");  
		Student s2=new Student(1,"pqr",7.0,"a");  
		//Student s3=new Student(1,"abc",7.0,"a");  
		
		
		map.put(s1,s1);
		map.put(s2,s2);
		//map.put(3,s3);
				
		for (Map.Entry me : map.entrySet()) {
	          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
	        }
		 
	}
}

