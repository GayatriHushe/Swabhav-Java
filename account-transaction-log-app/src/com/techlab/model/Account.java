package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accNo;
	private String name;
	private double balance;
	List<Transaction> transactions=new ArrayList<Transaction>();
	private double min=1000;
	public boolean isWithdrawPossible=true;
	
	public Account(int accNo,String name,double balance) {
		this.accNo=accNo;
		this.name=name;
		this.balance=balance;
		String info="Rupees " + balance + " was deposited.";
		transactions.add(new Transaction(balance,info));
	}
	
	public int getAccNo() {
		return accNo;
	}
	public String Name() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance+=amount;
		String infoLog="Rupees " + amount + " was deposited.";
		transactions.add(new Transaction(amount,infoLog));
	}
		
	public boolean withdraw(double amount) {
		String infoLog="Rupees " + amount + " was withdrawn.";
		if(this.balance-amount<=min)
			isWithdrawPossible=false;
		else
		{
			this.balance=this.balance-amount;
			transactions.add(new Transaction(amount,infoLog));
		}
		return isWithdrawPossible;
	}
	
	public String getTransaction() {
		
		return transactions.get(transactions.size() - 1).toString();
	}
	// To print all transactions
	public List<Transaction> allTransactions() {
		
		return transactions;
	}
}
