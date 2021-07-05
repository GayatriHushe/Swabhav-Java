package com.techlab.model;

public class Student implements Comparable<Student>{
	
	private int id;
	private String name, standard;
	private int cgpa;
	
	public Student(int id, String name, int cgpa, String standard)
	{		this.id=id;
			this.name=name;
			this.cgpa=cgpa;
			this.standard=standard;
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
		if (cgpa == s.cgpa)
		      return 0;
		    else if (cgpa > s.cgpa)
		      return 1;
		    else
		      return -1;
	}

	
}
