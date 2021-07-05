package com.techlab.model;

public class Circle {
	private int radius;
	private String color="YELLOW";
	private float area, perimeter;
	private static int min=10,max=50;
	static final double PI = Math.PI;
	
	public Circle(int radius, String color) {
		this.radius=validate_radius(radius);
		this.color=validate_color(color);
	}
	private String validate_color(String value) {
		for (Color color : Color.values()) {
		        if (color.name().equals(value)) {
		            return value;
		        }
		    }
		    return color;
	}
	private int validate_radius(int radius) {
		if(radius<min)
			radius=min;
		else if(radius>max)
			radius=max;
		return radius;
	}
	public int getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	public float getArea() {
		area=(float) (PI*(radius*radius));
		return area;
	}
	public float getPerimeter() {
		perimeter=(float) (PI*radius*2);
		return perimeter;
	}
	public Circle findBiggestCircle(Circle circle) {
		if(this.radius>circle.radius)
			return this;
		return circle;
	}
}
