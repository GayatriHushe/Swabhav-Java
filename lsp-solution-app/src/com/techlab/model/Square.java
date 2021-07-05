package com.techlab.model;

public class Square implements Ishape{

	private int side;
	public Square(int side) {
		this.side=side;
	}
	public int getSide() {
		return side;
	}
	
	@Override
	public int calculateArea() {
		return side*side;
	}

}
