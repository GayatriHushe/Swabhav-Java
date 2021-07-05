package com.techlab.model;
public class Account {
	private int accNo;
	private String accName;
	private double balance;
	private double min=1000;
	
	
	public boolean iswithdrawflag=true;
	
	
	public Account(int id, String name, double balance) {
		accNo=id;
		accName=name;
		this.balance=balance;
		//count+=1;
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
