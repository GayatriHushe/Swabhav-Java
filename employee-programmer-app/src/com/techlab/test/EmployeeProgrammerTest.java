package com.techlab.test;

import com.techlab.model.Employee;
import com.techlab.model.Programmer;

public class EmployeeProgrammerTest {

	public static void main(String[] args) {
		Programmer p1=new Programmer(1,"abc",30000.0,2000.0);
		Employee e1=new Employee(2,"def",20000.0);
		
		showInfo(p1);
		System.out.println("Bonus : "+p1.getBonus());
		
		showInfo(e1);
	}

	private static void showInfo(Employee obj) {
		System.out.println();
		System.out.println("Id : "+obj.getId());
		System.out.println("Name : "+obj.getName());
		System.out.println("Salary : "+obj.getSalary());
			
	}
}
