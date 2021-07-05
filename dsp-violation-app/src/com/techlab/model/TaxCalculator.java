package com.techlab.model;

public class TaxCalculator {

	private LogType log;

	public TaxCalculator(LogType log) {
		this.log=log;
	}

	public int calculateTax(int amount, int rate) {
		try {
			int result=amount/rate;
			return result;
		}
		catch(Exception e)
		{
			//violation : new object is created inside a class
			if(log.equals(LogType.JSON))
				new JSONLogger().log("Don't divide by 0");
			if(log.equals(LogType.XML))
				new XMLLogger().log("Don't divide by 0");
			if(log.equals(LogType.TXT))
				new TXTLogger().log("Don't divide by 0");
			return -1;
		}
	}
	
}
