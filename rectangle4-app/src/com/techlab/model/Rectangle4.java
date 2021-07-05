package com.techlab.model;

public class Rectangle4 {
	private int width,height;
	private String thickness="low";
	
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
	public String getThickness()
	{
		return thickness;
	}
	public void setWidth(int pwidth)	 
	{	
		width=validate(pwidth);
		
	}
	public void setHeight(int pheight) 
	{
		height=validate(pheight);
	}
	
	public void setThickness(String pthickness) {
		thickness=validate(pthickness);
		
	}
	public String validate(String pthickness) {
		if(pthickness.equals("low") || pthickness.equals("medium") || pthickness.equals("high")!=true)
			pthickness="low";
		return pthickness;
	}
	public int calculateArea() 
	{
		return width*height;
	}
}
