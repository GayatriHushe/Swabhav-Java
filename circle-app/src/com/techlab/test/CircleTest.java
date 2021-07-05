package com.techlab.test;
import com.techlab.model.Circle;

public class CircleTest {

	public static void main(String[] args) {
			
		Circle c1=new Circle(9,"GREEN");
		printCircleInfo(c1);
		
		Circle c2=new Circle(28,"BLUE");
		printCircleInfo(c2);
		
		Circle c3=new Circle(22,"WHITE");
		printCircleInfo(c3);
		
		Circle cirArr[]=new Circle[4];
		cirArr[0]=c1;
		cirArr[1]=c2;
		cirArr[2]=c3;
		cirArr[3]=new Circle(19,"RED");
		
		Circle big=cirArr[1].findBiggestCircle(cirArr[2]);
		System.out.println("Biggest Circle details : ");
		printCircleInfo(big);
	}
	private static void printCircleInfo(Circle c) 
	{
		System.out.println("Radius : "+c.getRadius());
		System.out.println("Color : "+c.getColor());
		System.out.println("Area : "+c.getArea());
		System.out.println("Perimeter : "+c.getPerimeter());
		System.out.println();
	}

}
