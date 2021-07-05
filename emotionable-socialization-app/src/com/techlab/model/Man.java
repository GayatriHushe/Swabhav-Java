package com.techlab.model;

public class Man implements IEmotionable,ISocialization{

	@Override
	public void depart() {
		System.out.println("Man is departing");
	}

	@Override
	public void wish() {
		System.out.println("Man is wishing");
	}

	@Override
	public void cry() {
		System.out.println("Man is crying");
	}

	@Override
	public void laugh() {
		System.out.println("Man is laughing");
	}

}
