package dataaccess;

import business.domain.A;
import business.domain.B;

public class Test {

	public static void main(String[] args) {
		A a=new A(new B());
		a.bar();
	}

}
