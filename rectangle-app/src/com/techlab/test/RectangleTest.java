package com.techlab.test;

import com.techlab.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle r1 =new Rectangle();
		r1.setWidth(3);
		r1.setHeight(4);
		int result=r1.calculateArea();
		System.out.println("Area of Rectangle : "+result);
	}
}
