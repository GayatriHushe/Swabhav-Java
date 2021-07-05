package com.techlab.model;

import java.io.File;
import java.util.Scanner;

public class DataAnalyser {
	private File file;
	private Scanner sc;
	private String empMinSalary,empMaxSalary;
	private int salary;
	private int count,totalCount;
	
	public DataAnalyser(File file) {
		this.file=file;
	}

	public String employeeMinSalary() throws Exception {
		sc=new Scanner(file);
		empMinSalary=null;
		int minSalary=Integer.MAX_VALUE;
		String line[];
		while(sc.hasNext())
		{
			String employee=sc.next();
			line=employee.split(",");
			salary=Integer.parseInt(line[5]);
			if(salary<minSalary)
			{
				empMinSalary=employee;
				minSalary=salary;
			}
		}
		return empMinSalary;
	}

	public String employeeMaxSalary() throws Exception {
		sc=new Scanner(file);
		empMaxSalary=null;
		int maxSalary=Integer.MIN_VALUE;
		String line[];
		while(sc.hasNext())
		{
			String employee=sc.next();
			line=employee.split(",");
			salary=Integer.parseInt(line[5]);
			if(salary>maxSalary)
			{
				empMaxSalary=employee;
				maxSalary=salary;
			}
		}
		return empMaxSalary;
	}

	public int countOfEmployeeDesignation(Designation designation) throws Exception {
		sc=new Scanner(file);
		count=0;
		String line[];
		while(sc.hasNext())
		{
			String employee=sc.next();
			line=employee.split(",");
			String empDesignation=line[2].substring(1, line[2].length()-1);
			if(empDesignation.equals(designation.toString()))
			{
				count++;
			}
		}
		
		return count;
	}
	
	public int totalNoOfEmp() throws Exception {
		sc=new Scanner(file);
		totalCount=0;
		String line[];
		while(sc.hasNext())
		{
			String employee=sc.next();
			line=employee.split(",");
			totalCount++;
		}
		
		return totalCount;
	}

}
