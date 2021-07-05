package com.techlab.test;

import com.techlab.model.InvalidAgeException;
import com.techlab.model.Person;

public class PersonTest {

	public static void main(String[] args) throws Exception {
		
		Person p1=new Person(2,"def",17);
		
		showPersonInfo(p1);
		try
		{
			System.out.println("After checking Age : ");
			p1.validateAge();
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
		if(p1.isValidAge)
			showPersonInfo(p1);
	}

	private static void showPersonInfo(Person p) {
		System.out.println("Id : "+p.getId());
		System.out.println("Name : "+p.getName());
		System.out.println("Age : "+p.getAge());
		System.out.println();
	}

}
