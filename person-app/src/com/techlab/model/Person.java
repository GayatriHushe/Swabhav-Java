package com.techlab.model;

public class Person {
	private int id;
	private String name;
	private float height, weight;
	public Person(int id, String name, float height, float weight) {
		this.id=id;
		this.name=name;
		this.height=height;
		this.weight=weight;
		
	}
	public void eat() {
		weight+=weight*0.05;
		
	}
	public void play() {
		weight-=weight*0.1;
		height+=height*0.01;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getHeight() {
		return height;
	}
	public float getWeight() {
		return weight;
	}

}
