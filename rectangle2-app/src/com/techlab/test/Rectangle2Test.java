package com.techlab.test;
import java.util.Scanner;
import com.techlab.model.Rectangle2;

public class Rectangle2Test {
	public static void main(String[] args) {
		Rectangle2 small = new Rectangle2();
		Rectangle2 big = new Rectangle2();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter width for small rectangle :");
		int width_small = sc.nextInt();
		small.setWidth(width_small);

		System.out.println("Enter height for small rectangle :");
		int height_small = sc.nextInt();
		small.setHeight(height_small);

		printRectangleInfo(small);
		System.out.println("");

		System.out.println("Enter width for big rectangle :");
		int width_big = sc.nextInt();
		big.setWidth(width_big);

		System.out.println("Enter height for big rectangle :");
		int height_big = sc.nextInt();
		big.setHeight(height_big);

		printRectangleInfo(big);
	}

	private static void printRectangleInfo(Rectangle2 r) {
		System.out.println("Width = " + r.getWidth());
		System.out.println("Height = " + r.getHeight());
		System.out.println("Area = " + r.calculateArea());
	}
}
