package com.techlab.model;

public class CustomerDB implements ICrudable{

	@Override
	public void create() {
		System.out.println("Creating CustomerDB");
	}

	@Override
	public void read() {
		System.out.println("Reading CustomerDB");
	}

	@Override
	public void update() {
		System.out.println("Updating CustomerDB");
	}

	@Override
	public void delete() {
		System.out.println("Deleting CustomerDB");
	}

}
