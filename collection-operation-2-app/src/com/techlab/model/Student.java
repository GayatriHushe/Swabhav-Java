package com.techlab.model;

public class Student implements Comparable<Student>{

	private int id;
	private String name, standard;
	private double cgpa;
	
	public Student(int id, String name, double cgpa, String standard)
	{
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
		this.standard=standard;
	}

	public int getId() {
		return this.id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return this.getId()-s.getId();
	}	
	
}
