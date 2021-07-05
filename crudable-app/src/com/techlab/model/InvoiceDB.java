package com.techlab.model;

public class InvoiceDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("Creating InvoiceDB");
	}

	@Override
	public void read() {
		System.out.println("Reading InvoiceDB");
	}

	@Override
	public void update() {
		System.out.println("Updating InvoiceDB");
	}

	@Override
	public void delete() {
		System.out.println("Deleting InvoiceDB");
	}

}
