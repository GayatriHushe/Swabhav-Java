package com.techlab.model;

public class JSONLogger  implements ILogger {

	public void log(String errorMsg) {
		System.out.println("Working data in JSON file : "+errorMsg);
		
	}

}
