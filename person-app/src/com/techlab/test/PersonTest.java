package com.techlab.test;

import com.techlab.model.Person;

public class PersonTest {

	public static void main(String[] args) {
		Person p1=new Person(1,"abc",5.4f,56.2f);
		Person p2=new Person(2,"def",7.0f,70.0f);

		showInfo(p1);
		p1.eat();
		System.out.println("After eating : ");
		showInfo(p1);
		
		showInfo(p2);
		p2.play();
		System.out.println("After playing : ");
		showInfo(p2);
	}
	private static void showInfo(Person p) {
		System.out.println("Id : "+p.getId());
		System.out.println("Name : "+p.getName());
		System.out.println("Height : "+p.getHeight());
		System.out.println("Weight : "+p.getWeight());
		System.out.println();
	}
}
