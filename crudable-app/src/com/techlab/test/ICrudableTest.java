package com.techlab.test;

import com.techlab.model.CustomerDB;
import com.techlab.model.InvoiceDB;
import com.techlab.model.DepartmentDB;
import com.techlab.model.ICrudable;

public class ICrudableTest {

	public static void main(String[] args) {
		doDBOperation(new CustomerDB());
		doDBOperation(new InvoiceDB());
		doDBOperation(new DepartmentDB());
	}

	private static void doDBOperation(ICrudable c) {
		System.out.println("Doing crud operations");
		c.create();
		c.read();
		c.update();
		c.delete();
		System.out.println();
		
	}
}
