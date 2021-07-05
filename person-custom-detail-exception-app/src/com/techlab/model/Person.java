package com.techlab.model;

public class Person {

	int id,age;
	String name;
	public boolean isValidAge=true;
	public Person(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	public int getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}
	public void validateAge() throws Exception {
		if (this.age<18)
		{
			isValidAge=false;
			throw new InvalidAgeException(this);
		}
		else
		{
			isValidAge=true;
		}
	}
}
