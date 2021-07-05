package com.techlab.test;

public class ExceptionTest {
	public static void main(String[] args) throws Exception {

		System.out.println("In main");
		fun1();
		//System.out.println("End");
	}
	private static void fun1() throws Exception {
		System.out.println("Inside fun1");
		System.out.println("Calling fun2");
		fun2();
	}
	private static void fun2() throws Exception {
		System.out.println("Inside fun2");
		System.out.println("Calling fun3");
		fun3();
	}
	private static void fun3() throws Exception  {
		System.out.println("Inside fun3");
		throw new Exception("Something went wrong");
	}
}
