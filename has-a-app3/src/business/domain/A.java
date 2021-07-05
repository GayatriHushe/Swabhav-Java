package business.domain;

import dataaccess.B;

public class A implements IFooable{
	
	@Override
	public void foo() {
		System.out.println("Executing foo method from A");
	}
	
		
}

