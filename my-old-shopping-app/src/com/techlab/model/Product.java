package com.techlab.model;

public class Product 
{
	private static int productCount=0;
	
	private int pid;
	private String pname;
	private double cost;
	
	public static int getpCount() 
	{
		return productCount;
	}
	public int getPid() 
	{
		return this.pid;
	}
	public String getPname() 
	{
		return this.pname;
	}
	public double getCost() 
	{
		return this.cost;
	}
	public Product(String pname, double cost) 
	{
		this.pid = ++productCount;
		this.pname = pname;
		this.cost = cost;
	}

	@Override
	public String toString() 
	{
		return "Product [id=" + pid + ", name=" + pname + ", cost=" + cost + "]";
	}
	
}
