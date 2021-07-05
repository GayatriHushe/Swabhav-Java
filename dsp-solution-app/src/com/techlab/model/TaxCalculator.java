package com.techlab.model;

public class TaxCalculator {
	ILogger logger;

	

	public TaxCalculator(ILogger logger) {
		this.logger=logger;
	}

	public int calculateTax(int amount, int rate) {
		try {
			int result=amount/rate;
			return result;
		}
		catch(Exception e)
		{
			logger.log("Don't divide by 0");
			return -1;
		}
	}
	
}
