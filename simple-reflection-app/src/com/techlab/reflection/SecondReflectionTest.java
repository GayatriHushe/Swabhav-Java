package com.techlab.reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import com.techlab.model.Rectangle;

public class SecondReflectionTest 
{
	public static void main(String[] args) {
		doReflection(Object.class);
		doReflection(String.class);
		doReflection(Rectangle.class);
}

	private static void doReflection(Class<?> class1) {
		System.out.println("Class Name : "+class1.getSimpleName());
		Method[] methods=class1.getMethods();
		ArrayList<String> getters=new ArrayList<String>();
		ArrayList<String> setters=new ArrayList<String>();
		for (Method method : methods) {
			if(method.getName().startsWith("get"))
				getters.add(method.getName());
		}
		
		System.out.println("Methods : "+methods.length);
		System.out.println("Getters : "+getters.size());
		System.out.println("Setters : "+setters.size());
		
		System.out.println("Methods : ");
		for(Method method : methods)
			System.out.println(method.getName());
		
		System.out.println();
		System.out.println("Getters : ");
		for(String getter : getters)
			System.out.println(getter);
		
		System.out.println();
		System.out.println("Setters : ");
		for(String setter : setters)
			System.out.println(setter);
		
		System.out.println();
		
		
	}
}
