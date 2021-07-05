package com.techlab.test;

import com.techlab.model.LogType;
import com.techlab.model.TaxCalculator;

public class DspTest {

	public static void main(String[] args) {
		TaxCalculator t=new TaxCalculator(LogType.XML);
		System.out.println(t.calculateTax(10,5));
		System.out.println(t.calculateTax(0,0));
	}

	
	
}
