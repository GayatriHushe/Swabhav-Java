package business.domain;

import dataaccess.B;

public class A {
	private B b;
	public A(B b)
	{
		this.b=b;
	}
	public void bar()
	{
		b.foo();
	}
	
}

