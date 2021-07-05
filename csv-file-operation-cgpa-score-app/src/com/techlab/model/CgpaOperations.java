package com.techlab.model;

import java.util.List;

public class CgpaOperations extends Operations {
	public CgpaOperations(List<Student> students)
	{
		super(students);
	}
	
	@Override
	public double average()
	{
		double sum = 0;
		for (Student student : students)
		{
			sum += student.getCgpa();
		}
		return sum / students.size();
	}

	@Override
	public Student min() 
	{
		double min = Double.MAX_VALUE;
		Student minCgpaStudent = null;
		for (Student student : students)
		{
			if (student.getCgpa() < min)
			{
				min = student.getCgpa();
				minCgpaStudent = student;
			}
		}
		return minCgpaStudent;
	}

	@Override
	public Student max() 
	{
		double max = Double.MIN_VALUE;
		Student maxCgpaStudent = null;
		for (Student student : students)
		{
			if (student.getCgpa() > max)
			{
				max = student.getCgpa();
				maxCgpaStudent = student;
			}
		}
		return maxCgpaStudent;
	}
}
