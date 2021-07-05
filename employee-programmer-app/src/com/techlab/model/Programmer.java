package com.techlab.model;

public class Programmer extends Employee {
	
	private Double bonus;
	public Programmer(int id,String name,Double salary,Double bonus)
	{
		super(id,name,salary);
		this.bonus=bonus;
	}
	public Double getBonus() {
		return this.bonus;
	}
	
}
