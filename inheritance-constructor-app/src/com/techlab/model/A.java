package com.techlab.model;

public class A {
	private int foo;
	public A()
	{
		System.out.println("I am inside class A");
	}
	public A(int foo)
	{
		System.out.println("Value of foo in class A : "+foo);
		this.foo=foo;
	}
}
