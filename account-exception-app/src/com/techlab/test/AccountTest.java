package com.techlab.test;

import com.techlab.model.Account;

public class AccountTest {

	public static void main(String[] args) {

		Account a1=new Account("abc",5000.0);
		showAccountInfo(a1);
		a1.deposit(2000.0);
		System.out.println("After deposit : ");
		showAccountInfo(a1);
		
		Account a2=new Account("def",2000.0);
		showAccountInfo(a2);
		System.out.println("After withdraw : ");
		try {
			a2.withdraw(1500.0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		/*
		if(!a2.iswithdrawflag)
			System.out.println("Not sufficient balance");
		else
			showAccountInfo(a2);
			*/
		if(a2.isWithdrawFlag)
			showAccountInfo(a2);
	}
	
	private static void showAccountInfo(Account a) {
		System.out.println("Account No : "+a.getAccNo());
		System.out.println("Account Name : "+a.getAccName());
		System.out.println("Balance : "+a.getBalance());
		System.out.println();
	}
}
