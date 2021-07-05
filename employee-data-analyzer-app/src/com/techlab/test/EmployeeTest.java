package com.techlab.test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import com.techlab.model.DataAnalyser;
import com.techlab.model.DataRetrieve;
import com.techlab.model.Designation;

public class EmployeeTest {
	public static void main(String[] args) throws Exception, IOException {
		
		DataRetrieve data=new DataRetrieve(new URL("https://swabhav-tech.firebaseapp.com/emp.txt"),"src/com/techlab/model/Emp.csv");
		//DataRetrieve data=new DataRetrieve("src/dataFile.csv","src/com/techlab/model/Emp.csv");
		
		
		File file=data.getFile();
		
		DataAnalyser analyser=new DataAnalyser(file);
		
		printEmployeeInfo(analyser);
	}

	private static void printEmployeeInfo(DataAnalyser analyser) throws Exception {
		System.out.println("Emp with minimum salary "+analyser.employeeMinSalary());
		System.out.println("Emp with maximum salary "+analyser.employeeMaxSalary());
		System.out.println();
		System.out.println("Total no of employees : "+analyser.totalNoOfEmp());
		System.out.println();
		System.out.println("No of employee in manager : "+analyser.countOfEmployeeDesignation(Designation.MANAGER));
		System.out.println("No of employee in clerk : "+analyser.countOfEmployeeDesignation(Designation.CLERK));
		System.out.println("No of employee in analyst : "+analyser.countOfEmployeeDesignation(Designation.ANALYST));
		System.out.println("No of employee in salesman : "+analyser.countOfEmployeeDesignation(Designation.SALESMAN));
		System.out.println("No of employee in president : "+analyser.countOfEmployeeDesignation(Designation.PRESIDENT));
		
	}
}
