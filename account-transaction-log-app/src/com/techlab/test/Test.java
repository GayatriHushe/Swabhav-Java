package com.techlab.test;

import com.techlab.model.Account;
import com.techlab.model.Transaction;

public class Test {
	public static void main(String[] args)  {

		Account a1=new Account(1,"Gayatri",5000);
		printInfo(a1);

		a1.deposit(4000);
		printInfo(a1);

		a1.withdraw(3500);
		if(!a1.isWithdrawPossible)
			System.out.println("Not sufficient balance");
		else
			printInfo(a1);

		a1.withdraw(5500);
		if(!a1.isWithdrawPossible)
			System.out.println("Not sufficient balance\n");
		else
			printInfo(a1);

		printTransactionLog(a1);
	}

	private static void printTransactionLog(Account a1) {
		System.out.println("Transaction log  for account no "+a1.getAccNo()+" : ");
		for (Transaction t : a1.allTransactions()) {
			System.out.println(t);
		}
	}

	private static void printInfo(Account a1) {
		System.out.println("Account No:"+a1.getAccNo());
		System.out.println("Name:"+a1.Name());
		System.out.println("Balance:"+a1.getBalance());
		System.out.println(a1.getTransaction());
		System.out.println();
	}
}
