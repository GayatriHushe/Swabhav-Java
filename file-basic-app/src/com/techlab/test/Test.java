//without using close

package com.techlab.test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String filename = "test1.txt";
		// create file
		File f = new File(filename);
		if (f.exists())
			System.out.println(filename + " already exists");
		else 
		{
			try 
			{
				f.createNewFile();
				System.out.println(filename + " created");
			} catch (IOException ioe) 
			{
				System.out.println("issue " + ioe);
			}
		}
		// write into file
		if (f.exists()) {
			try 
			{
				PrintWriter pw = new PrintWriter(f);
				pw.println("Hello");
				pw.println("Void");
				pw.flush();
			} catch (IOException ioe) {
				System.out.println("writing issue : " + ioe);
			}
			System.out.println(filename + " modified");
		} else {
			System.out.println(filename + " does not exists");
		}
		// read from file
		if (f.exists()) {
			try {
				Scanner sc = new Scanner(f);
				while (sc.hasNext()) {
					String data = sc.nextLine();
					System.out.println(data);
				}

			} catch (IOException ioe) {
				System.out.println("reading issue : " + ioe);
			}
			System.out.println("\n" + filename + " readed successfully");
		} else {
			System.out.println(filename + " does not exists");
		}
	}
}
