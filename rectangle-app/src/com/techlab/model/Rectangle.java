package com.techlab.model;

public class Rectangle {
	private int width;
	private int height;
	
	public void setWidth(int pwidth)	 
	{	
		width=pwidth;
	}
	public void setHeight(int pheight) 
	{
		height=pheight;
	}
	public int calculateArea() 
	{
		return width*height;
	}
}
