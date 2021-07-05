//using close

package com.techlab.test;

import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest {
	public static void main(String[] args) {
		String filename="test1.txt";
		//create file
		File f=new File(filename);
		if(f.exists())
			System.out.println(filename+" already exists");
		else
		{
			try{
				f.createNewFile();
				System.out.println(filename+" created");
				
			
			}
			catch(IOException ioe){
				System.out.println("issue "+ioe);
			}
		}
		
		//write into file
		if (f.exists())
		{
			try{
				FileWriter fw=new FileWriter(f);
				BufferedWriter bw=new BufferedWriter(fw);
				
				bw.write("Hello\nVoid");
				bw.close();
			}
			catch(IOException ioe)
			{
				System.out.println("writing issue : "+ioe);
			}
			System.out.println(filename+" modified");
		}
		else
		{
			System.out.println(filename+" does not exists");
		}
		//read from file
		if (f.exists())
		{
			try{
				Scanner sc=new Scanner(f);
				while(sc.hasNext())
				{
					String data=sc.nextLine();
					System.out.println(data);
				}
				
			}
			catch(IOException ioe)
			{
				System.out.println("reading issue : "+ioe);
			}
			System.out.println("\n\n"+filename+" readed successfully");
		}
		else
		{
			System.out.println(filename+" does not exists");
		}
		
		
	}
}
