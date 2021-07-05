package com.techlab.model;

public class Rectangle2 {
	private int width;
	private int height;
	
	public int validate(int num) {
		if(num<0)
			num=1;
		else if(num>100)
			num=100;
		return num;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	public void setWidth(int pwidth)	 
	{	
		width=validate(pwidth);
		
	}
	public void setHeight(int pheight) 
	{
		height=validate(pheight);
	}
	public int calculateArea() 
	{
		return width*height;
	}
	
}
