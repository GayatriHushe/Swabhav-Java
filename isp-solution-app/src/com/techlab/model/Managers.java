package com.techlab.model;

public class Managers implements IWorkable,IEatable {
	@Override
	public void startWork() {
		System.out.println("Managers start working");
	}

	@Override
	public void stopWork() {
		System.out.println("Managers stop working");
	}

	@Override
	public void startEat() {
		System.out.println("Managers start eating");
	}

	@Override
	public void stopEat() {
		System.out.println("Managers stop eating");
	}
}
