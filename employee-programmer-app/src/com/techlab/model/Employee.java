package com.techlab.model;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id,String name,Double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public Double getSalary() {
		return this.salary;
	}
	
	
}
