package com.techlab.model;

public class Product 
{
	private int pid;
	private String pname;
	private double pcost;
	
	public Product(int pid, String pname, double pcost) 
	{
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
	}
	
	public int getPid() 
	{	return this.pid;	}
	
	public String getPname() 
	{	return this.pname;	}
	
	public double getPcost() 
	{	return this.pcost;	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + "]";
	}
}
