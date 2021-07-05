package com.techlab.model;

public class InvalidAgeException extends Exception {
	
	StringBuilder sb=new StringBuilder();
	
	private String msg;
	Person p;
	
	public InvalidAgeException(Person p) {
		this.p=p;
	}
	public StringBuilder setMessage()
	{
		sb.append("Invalid Age\nId : "+p.id+"\nName : "+p.name+"\nAge : "+p.age+"\nAge should not be less than 18");
		
		return sb;
	}
	public String getMessage()
	{
		msg=setMessage().toString();
		return msg;
	}		
}
