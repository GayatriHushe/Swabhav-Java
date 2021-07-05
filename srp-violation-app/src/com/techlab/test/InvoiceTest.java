package com.techlab.test;

import com.techlab.model.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice i1=new Invoice(1, "abc", 2000.0, 10.0, 2.0f);
		i1.printToConsole();
		//srp violation can be removed by using static method
		
	}

	

}
