package com.techlab.model;

public class LineItem {
	private int id,quantity;
	private String name;
	private double unitPrice;
	private double totalItemCost=0.0;
	public LineItem(int id, String name, double unitPrice,int quantity) {
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.quantity=quantity;
		this.totalItemCost=this.quantity*this.unitPrice;
	}
		public int getId()
	{ 	return this.id;
	}
	public String getName()
	{	return this.name;
	}
	public double getUnitPrice()
	{	return this.unitPrice;
	}
	public int getQuantity()
	{	return this.quantity;
	}
	
	public void calculateTotalItemPrice()
	{	this.totalItemCost=this.unitPrice*this.quantity;
	}
	public double getTotalPrice()
	{	return this.totalItemCost;
	}
	@Override
	public String toString() {
		return "LineItem [id=" + id + ", quantity=" + quantity + ", name=" + name + ", unitPrice=" + unitPrice + "]";
	}
}
