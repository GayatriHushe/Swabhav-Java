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
	@Override
	public int hashCode() {
		System.out.println(super.hashCode());
		return this.accNo;
	}
	@Override
	public boolean equals(Object obj) {
		Account a=(Account)obj;
		if(this.accNo==a.accNo)
			return true;
		else
			return false;
	}	
}
