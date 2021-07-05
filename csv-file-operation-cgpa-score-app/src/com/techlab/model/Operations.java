package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Operations {
	List<Student> students = new ArrayList<Student>();

	public Operations(List<Student> students) {
		this.students=students;
	}
	public abstract double average();
	public abstract Student min();
	public abstract Student max();
}
