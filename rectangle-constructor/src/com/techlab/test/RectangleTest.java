package com.techlab.test;

import com.techlab.model.Rectangle;
import com.techlab.model.Thickness;

public class RectangleTest 
{
	public static void main(String[] args) 
	{
		Rectangle small = new Rectangle(3, 4);
		Rectangle big = new Rectangle(3, 4, Thickness.MEDIUM);
		Rectangle rectArr[] = new Rectangle[3];
		rectArr[0] = small;
		rectArr[1] = big;
		rectArr[2] = new Rectangle(7,8,Thickness.HIGH);
		for (Rectangle rect : rectArr)
		{
			printRectangleInfo(rect);
		}
	}
	
	public static void printRectangleInfo(Rectangle r) 
	{
		System.out.println("Width : " + r.getWidth());
		System.out.println("Height : " + r.getHeight());
		System.out.println("Area : " + r.calculateArea());
		System.out.println("Thickness :" + r.getThickness());
		System.out.println("HashCode :" + r.hashCode());
		System.out.println();
	}


}
