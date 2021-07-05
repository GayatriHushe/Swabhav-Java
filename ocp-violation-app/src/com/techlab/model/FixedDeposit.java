package com.techlab.model;

public class FixedDeposit {

	private int accNo;
	private String accName;
	private double amount, principle;
	private int years;
	private FestivalType festival;
	private double interest;
	
	public FixedDeposit(int accNo, String accName, double amount, double principle, int years, FestivalType festival) {
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

	public FestivalType getFestival() {
		return festival;
	}
	
	public double calculateSimpleInterest()
	{
		if(festival==FestivalType.NORMAL)
			interest=(this.getPrinciple()*6*getYears())/100;	//p*r*t/100
		else if(festival==FestivalType.HOLI)
			interest= (this.getPrinciple()*7*getYears())/100;	
		else if(festival==FestivalType.DIWALI)
			interest= (this.getPrinciple()*10*getYears())/100;	
		return interest;
	}
}
