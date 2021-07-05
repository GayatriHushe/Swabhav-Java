package com.techlab.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFileWriter {
	private List<Student> distinctStudents = new ArrayList<Student>();
	private File file;
	
	public CsvFileWriter(List<Student> distinctStudents, File file)
	{
		this.distinctStudents = distinctStudents;
		this.file = file;
	}
	
	public void writeToCsv() throws IOException
	{
		FileWriter writer=new FileWriter(file);

		String heading="Roll No, Name, Cgpa, Score, Location,";
		writer.write(heading);

		writer.write("\n");

		for (Student s : distinctStudents) {
			writer.write(s.getRollNo()+",");
			writer.write(s.getName()+",");
			writer.write(s.getCgpa()+",");
			writer.write(s.getScore()+",");
			writer.write(s.getLocation()+",");
			writer.write("\n");
		}
		writer.close();

	}
	
	public List<Student> getDistinctStudents()
	{
		return distinctStudents;
	}
}
