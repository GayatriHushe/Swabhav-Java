package com.techlab.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.Scanner;


public class DataRetrieve {
	private File file;
	private Scanner sc;
	private HashSet<String> set;
	private FileWriter fw;
	
	public DataRetrieve(URL url, String fileName) throws IOException {
		file=new File(fileName);
		sc=new Scanner(url.openStream());
		set=new HashSet<String>();
		fw=new FileWriter(file);
		while(sc.hasNext())
		{
			String line=sc.next();
			if(!set.contains(line))
			{
				fw.write(line);
				fw.write("\n");
				set.add(line);
			}
		}
		fw.close();
	}
	
	public DataRetrieve(String dataFileName, String fileName) throws Exception {
		file=new File(fileName);
		File dataFile=new File(dataFileName);
		sc=new Scanner(dataFile);
		set=new HashSet<String>();
		fw=new FileWriter(file);
		while(sc.hasNext())
		{
			String line=sc.next();
			if(!set.contains(line))
			{
				fw.write(line);
				fw.write("\n");
				set.add(line);
			}
		}
		fw.close();
		
	}

	public File getFile() {
		return file;
	}

	
	
}
