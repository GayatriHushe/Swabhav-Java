package com.techlab.model;

public class CurrentAccount extends Account{
	private static final double minbal=1000.0;
	
	public CurrentAccount(int accNo, String accName, Double balance) {
		super(accNo, accName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean withdraw(double amount) {
		
		// TODO Auto-generated method stub
		if(this.balance-amount<=minbal)
			return false;
		else
		{
			this.setBalance(this.getBalance()-amount);
			return true;
		}
	}

}
