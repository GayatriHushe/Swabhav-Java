package com.techlab.model;

public class Rectangle {
	
	protected int height;
	protected int width;

	public Rectangle(int width, int height) {
		this.setHeight(height);
		this.setWidth(width);
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

	private void setWidth(int width) {
		this.width=width;
		
	}
	
	public void setHeight(int height) {
		this.height=height;
	}

}
