package com.techlab.model;

public class Rectangle3 {
	private int width;
	private int height;
	
	public Rectangle3()	//default constructor
	{
		width=0;
		height=0;
	}
	public Rectangle3(int pwidth, int pheight) //parameterized constructor
	{
		width=validate(pwidth);
		height=validate(pheight);
	}
		public int validate(int num) 
	{
		if(num<0)
			num=1;
		else if(num>100)
			num=100;
		return num;
	}
	public int calculateArea() 
	{
		return width*height;
	}
	
}
