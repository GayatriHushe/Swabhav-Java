package com.techlab.model;

import java.util.List;

public class ScoreOperations extends Operations{
	public ScoreOperations(List<Student> students) 
	{
		super(students);
	}

	@Override
	public double average()
	{
		int sum = 0;
		for (Student student : students)
		{
			sum += student.getScore();
		}
		return sum / students.size();
	}

	@Override
	public Student min() 
	{
		double min = Double.MAX_VALUE;
		Student minGreScoreStudent = null;
		for (Student student : students)
		{
			if (student.getCgpa() < min)
			{
				min = student.getCgpa();
				minGreScoreStudent = student;
			}
		}
		return minGreScoreStudent;
	}

	@Override
	public Student max() 
	{
		double max = Double.MIN_VALUE;
		Student maxGreScoreStudent = null;
		for (Student student : students)
		{
			if (student.getCgpa() > max)
			{
				max = student.getCgpa();
				maxGreScoreStudent = student;
			}
		}
		return maxGreScoreStudent;
	}
}
