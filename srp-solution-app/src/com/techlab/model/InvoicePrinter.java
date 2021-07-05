package com.techlab.model;

public class InvoicePrinter {

	private Invoice invoice;
	
	public InvoicePrinter(Invoice invoice)
	{
		this.invoice=invoice;
	}
	public void printToConsole()
	{
		System.out.println("No : "+invoice.getNo());
		System.out.println("Name : "+invoice.getName());
		System.out.println("Amount : "+invoice.getAmount());
		System.out.println("Discount Amount : "+invoice.calculateDiscount());
		System.out.println("Gst Amount : "+invoice.calculateGst());
		System.out.println("Total Cost : "+invoice.calculateTotalCost());
	}
}

