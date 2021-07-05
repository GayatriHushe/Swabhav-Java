package com.techlab.reflection;

import java.lang.reflect.Method;
import com.techlab.model.Rectangle;

public class FirstReflectionTest 
{
	public static void main(String[] args) {
		doReflection(Object.class);
		doReflection(String.class);
		doReflection(Rectangle.class);
		
}

	private static void doReflection(Class<?> class1) {
		System.out.println("Class Name : "+class1.getName());
		Method[] methods=class1.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		
	}
}
