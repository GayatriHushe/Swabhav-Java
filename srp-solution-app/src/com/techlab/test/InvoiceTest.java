package com.techlab.test;

import com.techlab.model.Invoice;
import com.techlab.model.InvoicePrinter;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice i1=new Invoice(1, "abc", 2000.0, 10.0, 2.0f);
		InvoicePrinter ip=new InvoicePrinter(i1);
		ip.printToConsole();
		//srp violation can be removed by using static method
		
	}

	

}
