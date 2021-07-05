package com.techlab.test;
import com.techlab.model.Rectangle3;

public class Rectangle3Test {

	public static void main(String[] args) {
		Rectangle3 r1=new Rectangle3();
		Rectangle3 r2=new Rectangle3(3,4);
		Rectangle3 r3=new Rectangle3(-3,4);
		Rectangle3 r4=new Rectangle3(3,103);
		Rectangle3 r5=new Rectangle3(-3,104);
		
		int area1=r1.calculateArea();
		System.out.println("Area of r1 = "+area1);
		
		int area2=r2.calculateArea();
		System.out.println("Area of r2 = "+area2);
		
		int area3=r3.calculateArea();
		System.out.println("Area of r3 = "+area3);
		
		int area4=r4.calculateArea();
		System.out.println("Area of r4 = "+area4);
		
		int area5=r5.calculateArea();
		System.out.println("Area of r5 = "+area5);
			
	}

}
