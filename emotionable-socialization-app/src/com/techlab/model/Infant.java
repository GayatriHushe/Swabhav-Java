package com.techlab.model;

public class Infant implements IEmotionable{

	@Override
	public void cry() {
		System.out.println("Infant is crying");
	}

	@Override
	public void laugh() {
		System.out.println("Infant is laughing");
	}

}
