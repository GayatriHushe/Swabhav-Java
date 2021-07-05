package com.techlab.model;

public class Rectangle implements Ishape{
	
	private int height;
	private int width;

	public Rectangle(int width, int height) {
		this.width=width;
		this.height=height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int calculateArea() {
		return width*height;
	}

}
