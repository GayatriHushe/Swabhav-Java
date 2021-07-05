package com.techlab.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.techlab.model.Operations;
import com.techlab.model.CgpaOperations;
import com.techlab.model.CsvFileWriter;
import com.techlab.model.DuplicateRemover;
import com.techlab.model.ScoreOperations;
import com.techlab.model.Student;

public class CsvTest {

	public static void main(String[] args) throws IOException {

		File file = new File("src\\com\\techlab\\model\\student.csv");
		//relative path
		
		List<Student> studentList = new ArrayList<Student>();

		studentList.add(new Student(1,"Gayatri",9.52,95.2,"Mumbai"));
		studentList.add(new Student(2,"abc",7.4,74.0,"Pune"));
		studentList.add(new Student(3,"def",8.5,85.0,"Mumbai"));
		studentList.add(new Student(4,"ghi",8.92,89.2,"Thane"));
		studentList.add(new Student(5,"jkl",9.32,93.2,"Mumbai"));
		studentList.add(new Student(6,"mno",7.4,74.0,"Navi Mumbai"));
		studentList.add(new Student(7,"pqr",8.5,85.0,"Mumbai"));
		studentList.add(new Student(8,"rst",8.92,89.2,"Thane"));
		studentList.add(new Student(9,"uvw",9.52,95.2,"Mumbai"));
		studentList.add(new Student(10,"xyz",7.4,74.0,"NaviMumbai"));
		studentList.add(new Student(1,"Gayatri",9.52,95.2,"Mumbai"));
		studentList.add(new Student(2,"abc",7.4,74.0,"Pune"));
		studentList.add(new Student(3,"def",8.5,85.0,"Mumbai"));
		studentList.add(new Student(4,"ghi",8.92,89.2,"Thane"));
		studentList.add(new Student(5,"jkl",9.32,93.2,"Mumbai"));


		DuplicateRemover duplicateRemover = new DuplicateRemover();
		
		List<Student> distinctStudents = duplicateRemover.removeStudentIfDuplicatePresent(studentList);
		
		CsvFileWriter csvWriter = new CsvFileWriter(distinctStudents, file);
		csvWriter.writeToCsv();

		CgpaOperations cgpaOperations = new CgpaOperations(distinctStudents);
		System.out.println("For cgpa : ");
		printResult(cgpaOperations);

		
		ScoreOperations scoreOperations = new ScoreOperations(distinctStudents);
		System.out.println("For score : ");
		printResult(scoreOperations);

	}
	private static void printResult(Operations obj)
	{
		System.out.println("Average : " + obj.average());
		System.out.println("\nStudent minimum  : ");
		displayStudents(obj.min());
		System.out.println("\nStudent maximum  : ");
		displayStudents(obj.max());
		System.out.println("---------------------------------\n");
	}

	private static void displayStudents(Student student) 
	{
		System.out.println("Roll No: " + student.getRollNo());
		System.out.println("Name : " + student.getName());
		System.out.println("Cgpa: " + student.getCgpa());
		System.out.println("Score: " + student.getScore());
		System.out.println("Location: " + student.getLocation());
		System.out.println();
	}

}

