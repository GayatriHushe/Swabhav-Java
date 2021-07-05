package com.techlab.model;

public abstract class Account {
	private int accNo;
	private String accName;
	protected Double balance;
	
	public Account(int accNo,String accName,Double balance)
	{
		this.accNo=accNo;
		this.accName=accName;
		this.balance=balance;
	}
	public int getAccNo()
	{
		return this.accNo;
	}
	public String getAccName()
	{
		return this.accName;
	}
	public Double getBalance()
	{
		return this.balance;
	}
	public void deposit(double amount)
	{
		this.balance+=amount;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	abstract boolean withdraw(double amount);
}
