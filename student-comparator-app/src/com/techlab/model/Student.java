package com.techlab.model;

public class Student {
	
	private int id;
	private String name, standard;
	private int cgpa;
	
	public Student(int id, String name, int cgpa, String standard)
	{		this.id=id;
			this.name=name;
			this.cgpa=cgpa;
			this.standard=standard;
	}
	public String getName()
	{
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa +  ", standard=" + standard +"]";
	}

	
}
