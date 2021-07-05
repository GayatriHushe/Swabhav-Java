package com.techlab.model;

public class XMLLogger  implements ILogger {
	public void log(String errorMsg) {
		System.out.println("Working data in XML file : "+errorMsg);
		
	}
}
