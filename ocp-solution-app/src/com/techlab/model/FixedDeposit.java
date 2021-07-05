package com.techlab.model;

public class FixedDeposit {
	private int accNo;
	private String accName;
	private double amount, principle;
	private int years;
	private double interest;
	private IFestivalRate festival;
	
	public FixedDeposit(int accNo, String accName, double amount, double principle, int years, IFestivalRate festival) {
		this.accNo=accNo;
		this.accName=accName;
		this.amount=amount;
		this.principle=principle;
		this.years=years;
		this.festival=festival;
	}

	public int getAccNo() {
		return accNo;
	}
	public String getAccName() {
		return accName;
	}
	public double getPrinciple() {
		return principle;
	}
	public int getYears() {
		return years;
	}
	public double calculateSimpleInterest()
	{
		interest=(this.getPrinciple()*festival.getRate()*this.getYears())/100;	
		return interest;
	}
}
