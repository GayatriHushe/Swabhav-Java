package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	void testAccount() {
		//arrange
		int expectedAccNo=1;
		String expectedAccName="abc";
		double expectedBalance=5000.0;

		//act
		Account a1=new Account(1,"abc",5000.0);

		//assert
		assertEquals(expectedAccNo, a1.getAccNo());
		assertEquals(expectedAccName, a1.getAccName());
		assertEquals(expectedBalance, a1.getBalance());
	}

	@Test
	void testDeposit() {
		//arrange
		double expectedBalance=5250.0;

		//act
		Account a1=new Account(1,"abc",5000.0);
		a1.deposit(250.0);

		//assert
		assertEquals(expectedBalance, a1.getBalance());
	}

	@Test
	void testWithdraw() {
		//arrange
		double expectedBalance1=4500.0;
		double expectedBalance2=1000.0;

		//act
		Account a1=new Account(1,"abc",5000.0);
		a1.withdraw(500.0);
		
		Account a2=new Account(2,"xyz",1000.0);
		a2.withdraw(500.0);

		//assert
		assertEquals(expectedBalance1, a1.getBalance());
		assertEquals(expectedBalance2, a2.getBalance());
	}

}
