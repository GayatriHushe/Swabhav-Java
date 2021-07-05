package com.techlab.model;
public class Account {
	private static int accNo;
	private String accName;
	private double balance;
	private double min=1000;
	public boolean iswithdrawflag=true;
	
	
	
	public Account(int accNo, String name, double balance) {
		this.accNo=accNo;
		this.accName=name;
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
			iswithdrawflag=false;
		else
			this.balance=this.balance-amount;
		return iswithdrawflag;
	}
}
