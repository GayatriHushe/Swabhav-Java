package com.techlab.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.techlab.model.Student;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> set=new TreeSet<String>();
		set.add("gayatri");
		set.add("mahesh");
		set.add("hushe");
		set.add("java");
		//set.set(0,"Gayatri");
		set.remove("mahesh");
		
		
		
		List<String> list = new ArrayList<String>(set);
		  
        System.out.println("Element at index 2 is: "+ list.get(2));
				
		System.out.println("List : "+set);
		
		Iterator i=set.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
	}
	

}
