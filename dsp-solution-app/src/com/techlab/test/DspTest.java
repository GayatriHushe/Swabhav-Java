package com.techlab.test;


import com.techlab.model.TaxCalculator;
import com.techlab.model.XMLLogger;

public class DspTest {

	public static void main(String[] args) {
		TaxCalculator t=new TaxCalculator(new XMLLogger());
		System.out.println(t.calculateTax(10,5));
		System.out.println(t.calculateTax(0,0));
	}

	
	
}
