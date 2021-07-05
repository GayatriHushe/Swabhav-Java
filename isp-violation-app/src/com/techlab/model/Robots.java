package com.techlab.model;

public class Robots implements IWorkable {

	@Override
	public void startWork() {
		System.out.println("Robots start working");
	}

	@Override
	public void stopWork() {
		System.out.println("Robots stop working");
	}

	@Override
	public void startEat() {
		System.out.println("Robots can't start eat");
	}

	@Override
	public void stopEat() {
		System.out.println("Robots can't stop eat");
	}
}
