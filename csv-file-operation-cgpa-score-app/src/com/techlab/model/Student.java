package com.techlab.model;

public class Student {
	private int rollNo;
	private String name, location;
	private double cgpa, score;
	
	public Student(int rollNo, String name, double cgpa, double score, String location)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.cgpa=cgpa;
		this.score=score;
		this.location=location;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public double getCgpa() {
		return cgpa;
	}

	public double getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + rollNo + ", name=" + name + ", location=" + location + ", cgpa=" + cgpa
				+ ", score=" + score + "]";
	}
	
}
