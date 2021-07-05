package com.techlab.model;
public class Account {
	static int accNo;
	String accName;
	double balance;
	private double min=1000;
	public boolean iswithdrawflag=true;
	
	static{
		accNo=100;	}
	public Account(String name, double balance) {
		accNo+=1;
		accName=name;
		this.balance=balance;		
	}
	public int getAccNo() {
		return accNo;
	}
	public String getAccName() {
		return accName;
	}
	public double getBalance() {
		return this.balance;
	}
	public void deposit(double amount) {
		this.balance+=amount;
	}
	public boolean withdraw(double amount) {
		if(this.balance-amount<=min)
		{
			iswithdrawflag=false;
			throw new InSufficientException(this,amount);
		}
		else
			this.balance=this.balance-amount;
		return iswithdrawflag;
	}
}
