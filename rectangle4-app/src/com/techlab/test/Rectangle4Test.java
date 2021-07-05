package com.techlab.test;

import java.util.Scanner;

import com.techlab.model.Rectangle4;

public class Rectangle4Test {

	public static void main(String[] args) {
		Rectangle4 small = new Rectangle4();
		Rectangle4 big = new Rectangle4();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter width for small rectangle :");
		int width_small = sc.nextInt();
		small.setWidth(width_small);

		System.out.println("Enter height for small rectangle :");
		int height_small = sc.nextInt();
		small.setHeight(height_small);
		
		System.out.println("Enter thickness for small rectangle :");
		String thickness_small = sc.next();
		small.setThickness(thickness_small);

		printRectangleInfo(small);
		System.out.println("");

		System.out.println("Enter width for big rectangle :");
		int width_big = sc.nextInt();
		

		System.out.println("Enter height for big rectangle :");
		int height_big = sc.nextInt();
		

		System.out.println("Enter thickness for big rectangle :");
		String thickness_big = sc.next();
		
		big.setWidth(width_big);
		big.setHeight(height_big);
		big.setThickness(thickness_big);
		
		printRectangleInfo(big);
	}

	private static void printRectangleInfo(Rectangle4 r) {
		System.out.println("Width = " + r.getWidth());
		System.out.println("Height = " + r.getHeight());
		System.out.println("Thickness = " + r.getThickness());
		System.out.println("Area = " + r.calculateArea());
	}

}
