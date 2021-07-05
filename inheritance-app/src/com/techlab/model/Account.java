package com.techlab.model;
public class Account {
	private int accNo;
	private String accName;
	private double balance;
	private double min=1000;
	
	private static int count;
	public boolean transactionflag=true;
	
	static		//static block
	{
		count=0;
	}
	
	public Account(int id, String name, double balance) {
		accNo=id;
		accName=name;
		this.balance=balance;
		count+=1;
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
			transactionflag=false;
		else
			this.balance=this.balance-amount;
		return transactionflag;
	}
	/*
	@Override
	public int hashCode() {
		return accNo;
	}*/
	
	@Override
	public boolean equals(Object obj) {
		Account a=(Account)obj;
		if(this.accNo==a.accNo)
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + "]";
	}
	public static int headCount() {
		return count;
	}
	public int getCount() {
		return count;
	}
}
