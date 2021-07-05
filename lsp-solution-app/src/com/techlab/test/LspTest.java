package com.techlab.test;

import com.techlab.model.Ishape;
import com.techlab.model.Rectangle;
import com.techlab.model.Square;

public class LspTest {

	public static void main(String[] args) {
		Rectangle rect=new Rectangle(200,100);
		Square square=new Square(100);
		printInfo(rect);
		printInfo(square);
	}

	//reference of base is substituted for object of child
	private static void printInfo(Ishape obj) {
		System.out.println("Area : "+obj.calculateArea());
		
	}

}
