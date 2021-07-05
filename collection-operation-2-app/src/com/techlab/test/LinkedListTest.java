package com.techlab.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		list.add("gayatri");
		list.add("hushe");
		list.add("java");
		list.add(1,"mahesh");
		list.set(0,"Gayatri");
		list.remove("mahesh");
		System.out.println("Element at position2 : "+list.get(2));
		
		System.out.println("List : "+list);
		
		Iterator i=list.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	
	}

}
