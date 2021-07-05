package com.techlab.test;

public class RuntimeExceptionTest {
	public static void main(String[] args) {

		System.out.println("In main");
		fun1();
	}
	private static void fun1() {
		System.out.println("Inside fun1");
		System.out.println("Calling fun2");
		fun2();
	}
	private static void fun2() {
		System.out.println("Inside fun2");
		System.out.println("Calling fun3");
		fun3();
	}
	private static void fun3()  {
		System.out.println("Inside fun3");
		throw new RuntimeException("Something went wrong");
	}
}
