package com.techlab.model;

public class DepartmentDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("Creating DepartmentDB");
	}

	@Override
	public void read() {
		System.out.println("Reading DepartmentDB");
	}

	@Override
	public void update() {
		System.out.println("Updating DepartmentDB");
	}

	@Override
	public void delete() {
		System.out.println("Deleting DepartmentDB");
	}

}
