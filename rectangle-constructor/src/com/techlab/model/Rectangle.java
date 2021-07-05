package com.techlab.model;

public class Rectangle {
	private int width, height;
	private Thickness thickness;
	private static final int min = 1, max = 100;
	
	public Rectangle(int width, int height)
	{
		this(width, height, Thickness.LOW);
	}
	public Rectangle(int width, int height, Thickness thickness) 
	{
		this.width = validate(width);
		this.height = validate(height);
		this.thickness = thickness;
	}
	public int getWidth()
	{
		return width;
	}
	public int getHeight()
	{
		return height;
	}
	private static int validate(int n)
	{
		if (n < 1)
			return min;
		else if (n > max)
			return max;
		else
			return n;
	}
	public String getThickness()
	{
		return thickness.toString();
	}
	public int calculateArea()
	{
		return width * height;
	}
}







/*
 * private String validateThickness(String value) { // TODO Auto-generated
 * method stub if (value != "low" && value != "medium" && value != "high") {
 * return "low"; } else { return value; } }
 */
