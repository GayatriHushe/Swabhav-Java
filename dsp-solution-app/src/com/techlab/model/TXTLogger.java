package com.techlab.model;

public class TXTLogger implements ILogger {
	public void log(String errorMsg) {
		System.out.println("Working data in TXT file : "+errorMsg);
		
	}
}
