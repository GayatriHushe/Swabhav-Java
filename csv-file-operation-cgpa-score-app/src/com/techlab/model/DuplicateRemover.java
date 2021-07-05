package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class DuplicateRemover {
	private List<Student> distinctStudentList = new ArrayList<Student>();

	public List<Student> removeStudentIfDuplicatePresent(List<Student> students)
	{
		for (Student student : students)
		{
			if (!checkForDuplicateStudentPresent(student))
			{
				distinctStudentList.add(student);
			}
		}
		return distinctStudentList;
	}

	private boolean checkForDuplicateStudentPresent(Student student)
	{
		for (Student s : distinctStudentList)
		{
			if (s.equals(student)) 
				return true;
		}
		return false;
	}
}
