package com.techlab.annotation;

public class Foo {
	
	@UnitTestCase
	public boolean method1() {
		return true;
	}
	@UnitTestCase
	public boolean method2() {
		return false;
	}
	@UnitTestCase
	public boolean method3() {
		return true;
	}
	public boolean method4() {
		return false;
	}
	
}
