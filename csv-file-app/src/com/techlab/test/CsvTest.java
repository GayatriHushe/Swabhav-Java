package com.techlab.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class CsvTest {

	public static void main(String[] args) {

		// Creating copyemp.csv file
		String originalFileName = "D:\\javaclasswork_a\\csv-file-app\\src\\com\\techlab\\test\\emp.csv";
		String newFileName = "D:\\javaclasswork_a\\csv-file-app\\src\\com\\techlab\\test\\copyemp.csv";
		File originalFile = new File(originalFileName);
		File newFile = new File(newFileName);
		try {
			Files.copy(originalFile.toPath(), newFile.toPath());
			System.out.println("File copied successfully\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File already exists");
		}
		
		// Read data from emp.csv
		System.out.println("File emp.csv : ");
		try {
			Scanner sc = new Scanner(originalFile);
			while (sc.hasNext()) {
				String dataEmp = sc.next();
				System.out.println(dataEmp);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();

		// Write into copyemp.csv
		FileReader fr;
		try {
			fr = new FileReader(originalFile);
			BufferedReader br = new BufferedReader(fr);

			try {
				FileWriter fw = new FileWriter(newFile);
				String line;

				while ((line = br.readLine()) != null) {
					if (line.contains("KING")) {
						line = line.replaceAll("KING", "GAYATRI");
					}
					fw.write(line+"\n");
				}
				fr.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// Read data from copyemp.csv
		System.out.println("File copyemp.csv  after replacing KING with GAYATRI : ");
		try {
			Scanner sc1 = new Scanner(newFile);
			while (sc1.hasNext()) {
				String dataCopyEmp = sc1.next();
				System.out.println(dataCopyEmp);
			}
			sc1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		//Deleting emp.csv
		try {
			boolean result = Files.deleteIfExists(Paths.get(originalFileName));
			if (result) {
				System.out.println("emp.csv is deleted successfully");
			} else {
				System.out.println("Sorry, unable to delete the file.emp.csv");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();

		//Renaming copyemp.csv to emp.csv
		if (newFile.renameTo(originalFile)) 
            System.out.println("copyemp.csv is renamed to emp.csv successfully");        
        else 
            System.out.println("Error");

	}

}
