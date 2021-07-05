package com.techlab.student.test;

import java.util.HashMap;
import java.util.Map;

import com.techlab.model.Student;

public class HashMapStudentTest {

	public static void main(String[] args) {
		Map<Integer,Student> map=new HashMap<Integer,Student>();
		
		
		Student s1=new Student(1,"abc",9.5);  
		Student s2=new Student(2,"def",9.0);  
		Student s3=new Student(3,"xyz",10.0);  
		
		map.put(1,s1);
		map.put(2,s2);
		map.put(3,s3);
				
		for (Map.Entry me : map.entrySet()) {
	          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
	        }
		 
	}
}

