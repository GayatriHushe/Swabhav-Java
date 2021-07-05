package com.techlab.test;

import com.techlab.model.Account;

public class AccountTest {

	public static void main(String[] args) {

		
		Account a1=new Account(1,"abc",5000.0);
		
		Account a2=new Account(2,"def",2000.0);
		System.out.println();
		
		showAccountInfo(a1);
		a1.deposit(2000.0);
		System.out.println("After deposit : ");
		showAccountInfo(a1);
		
		showAccountInfo(a2);
		System.out.println("After withdraw : ");
		a2.withdraw(1500.0);
		if(!a2.iswithdrawflag)
			System.out.println("Not sufficient balance");
		else
			showAccountInfo(a2);
	}

	
	private static void showAccountInfo(Account a) {
		System.out.println("Account No : "+a.getAccNo());
		System.out.println("Account Name : "+a.getAccName());
		System.out.println("Balance : "+a.getBalance());
		System.out.println();
	}

}
