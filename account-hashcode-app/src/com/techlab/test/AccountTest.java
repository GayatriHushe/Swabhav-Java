package com.techlab.test;

import com.techlab.model.Account;

public class AccountTest {

	public static void main(String[] args) {

		
		Account a1=new Account(1,"abc",20000.0);
		//Account a2=new Account(1,"abc",20000.0);
								
		System.out.println(a1.hashCode()+"  and  "+a1);
		//System.out.println();
		//showAccountInfo(a1);
	}

	private static void showAccountInfo(Account a) {
		System.out.println("Account No : "+a.getAccNo());
		System.out.println("Account Name : "+a.getAccName());
		System.out.println("Balance : "+a.getBalance());
		System.out.println();
	}
}
