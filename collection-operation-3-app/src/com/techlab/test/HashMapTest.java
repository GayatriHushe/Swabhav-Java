package com.techlab.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"gayatri");
		map.put(2,"mahesh");
		map.put(3,"hushe");
		map.put(4,"java");
		map.put(5,"python");
		
		System.out.println("Map : "+map);
		
		map.replace(0,"Gayatri");
		map.remove(2,"mahesh");
		map.remove(5);
		map.putIfAbsent(6,"C");
		
		System.out.println("Element at key 1 : "+map.get(1));
					
		System.out.println("Map : "+map);
		
		for (Map.Entry me : map.entrySet()) {
	          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
	        }
		
		 //Fetching key  
	       System.out.println("Keys: "+map.keySet());  
	       //Fetching value  
	       System.out.println("Values: "+map.values());  
	       //Fetching key-value pair  
	       System.out.println("Key-Value pairs: "+map.entrySet());  
	}
}

