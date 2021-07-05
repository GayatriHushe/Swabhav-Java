package com.techlab.annotation.test;

import java.lang.reflect.Method;

import com.techlab.annotation.Customer;
import com.techlab.annotation.NeedToBeRefactor;

public class CustomerReflection {

	public static void main(String[] args) {
		doReflection(Customer.class);
	}

	private static void doReflection(Class<Customer> class1) {
		System.out.println("Methods to be refactored are : ");
		Method[] methods=class1.getMethods();
		for (Method method : methods) {
			if(method.isAnnotationPresent(NeedToBeRefactor.class))
				System.out.println(method.getName());
		}
	}

}
