package com.techlab.model;

public class InSufficientException extends RuntimeException {
	StringBuilder sb = new StringBuilder();  
	
	private String msg;
	private Double amount;
	Account a;
		
	public InSufficientException(Account a, double amount) {
		this.a=a;
		this.amount=amount;
	}
	public StringBuilder setMessage()
	{
		sb.append("Insufficient balance\nAccount name : "+a.accName+"\nAccount number : "+a.accNo);
		sb.append("\nAccount Balance : "+a.balance+"\nNot possible to withdraw : "+this.amount);
		return sb;
	}
	public String getMessage()
	{
		msg=setMessage().toString();
		return msg;
	}		
}
