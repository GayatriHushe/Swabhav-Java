package com.techlab.test;

import com.techlab.model.FestivalType;
import com.techlab.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit deposit=new FixedDeposit(1,"abc",10000.0,500.0,2,FestivalType.DIWALI);
		System.out.println("SI : "+deposit.calculateSimpleInterest());
	}

}
