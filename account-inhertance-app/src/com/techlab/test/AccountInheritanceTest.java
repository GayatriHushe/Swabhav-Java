package com.techlab.test;

import com.techlab.model.Account;
import com.techlab.model.CurrentAccount;
import com.techlab.model.SavingAccount;

public class AccountInheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentAccount a1=new CurrentAccount(1,"abc",5000.0);
		SavingAccount a2=new SavingAccount(2,"def",2000.0);
		
		printInfo(a1);
		System.out.println("After deposit of a1 of 1000 : ");
		a1.deposit(1000.0);
		printInfo(a1);
		System.out.println("After withdraw of a1 of 2000 : ");
		//a1.withdraw(2000.0);
		if(!a1.withdraw(2000.0))
			System.out.println("Not sufficient balance");
		else
			printInfo(a1);
		
		
		printInfo(a2);
		System.out.println("After deposit of a2 of 500 : ");
		a2.deposit(500.0);
		printInfo(a2);
		System.out.println("After withdraw of a2 of 3000 : ");
		//a2.withdraw(3000.0);
		if(!a2.withdraw(3000.0))
			System.out.println("Not sufficient balance");
		else
			printInfo(a2);
		
	}

	private static void printInfo(Account a2) {
		// TODO Auto-generated method stub
		System.out.println("AccNo : "+a2.getAccNo());
		System.out.println("AccName : "+a2.getAccName());
		System.out.println("Balance : "+a2.getBalance());
		System.out.println();
	}
}
