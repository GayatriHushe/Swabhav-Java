package com.techlab.model;

public class Transaction {
	private double amount;
	private String infoLog;
	
	public Transaction(double amount,String infoLog) {
		this.amount=amount;
		this.infoLog=infoLog;
	}
	public double getAmount() {
		return amount;
	}
	public String getInfoLog() {
		return infoLog;
	}
	@Override
	public String toString() {
		return "Transaction [amount=" + amount + ", infoLog=" + infoLog + "]";
	}
}
