package com.techlab.annotation.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.techlab.annotation.Foo;
import com.techlab.annotation.UnitTestCase;

public class FooReflection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		doReflection(Foo.class);
	}

	private static void doReflection(Class<Foo> class1) throws Exception{
		// TODO Auto-generated method stub
		int count=0,pass=0,fail=0;
		Method[] methods=class1.getMethods();
		for (Method method : methods) {
			
			if(method.isAnnotationPresent((Class<? extends Annotation>) UnitTestCase.class))
			{
				if((boolean) method.invoke(new Foo(),null))	
					{ count++; pass++;}
				else {count++; fail++;}
				
			}
		}
		System.out.println("Total test cases :"+count);
		System.out.println("Passed cases : "+pass);
		System.out.println("Failed cases : "+fail);
	}

}
