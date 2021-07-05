package com.techlab.model;

public class Invoice {

	private int no;
	private String name;
	private double amount, discountPercentage;
	private float gst;
	
	public Invoice(int no, String name, double amount, double discountPercentage, float gst) {
		this.no=no;
		this.name=name;
		this.amount=amount;
		this.discountPercentage=discountPercentage;
		this.gst=gst;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}
	
	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public double calculateDiscount()
	{
		return this.amount*discountPercentage*(0.01);
	}
	
	public double calculateGst()
	{
		return this.amount*this.gst*(0.01);
	}
	
	public double calculateTotalCost()
	{
		return this.amount-this.calculateDiscount()+this.calculateGst();
	}
	
	public void printToConsole()
	{
		System.out.println("No : "+this.getNo());
		System.out.println("Name : "+this.getName());
		System.out.println("Amount : "+this.getAmount());
		System.out.println("Discount Amount : "+this.calculateDiscount());
		System.out.println("Gst Amount : "+this.calculateGst());
		System.out.println("Total Cost : "+this.calculateTotalCost());
	}
	
	
}
