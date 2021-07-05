package com.techlab.model;

public class SavingAccount extends Account {
	private final int minbal=500;
	public boolean iswithdrawflag=true;
	
	public SavingAccount(int accNo, String accName, Double balance) {
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
