package com.techlab.model;

public class Student implements Comparable<Student>{

	private int id;
	private String name, standard;
	private double cgpa;
	
	public Student(int id, String name, double cgpa, String standard)
	{		this.id=id;
			this.name=name;
			this.cgpa=cgpa;
			this.standard=standard;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		if (standard != other.standard)
				return false;
		return true;
		}

	public int getId() {
		return this.id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa +  ", standard=" + standard +"]";
	}

	@Override
	public int compareTo(Student s) {
		if(id==s.id & standard!=s.standard)
		{
			return 1;
		}
		return 0;
	}	
}
