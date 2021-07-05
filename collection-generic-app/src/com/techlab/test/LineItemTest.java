package com.techlab.test;

import java.util.ArrayList;
import java.util.Iterator;

import com.techlab.model.LineItem;

public class LineItemTest {
	public static void main(String[] args) {
		ArrayList<LineItem> list = new ArrayList<LineItem>();

		LineItem item1 = new LineItem(1, "abc", 5.0, 3);
		LineItem item2 = new LineItem(2, "def", 10.0, 1);
		LineItem item3 = new LineItem(3, "xyz", 15.0, 2);

		list.add(item1);
		list.add(item2);
		list.add(item3);
		// cart.add("abc");		// printCart(list);
		printCartItem(list);
	}
	private static void printCartItem(ArrayList<LineItem> list) {
		double totalCost = 0.0;
		
		Iterator<LineItem> itr = list.iterator();
		while (itr.hasNext()) {
			LineItem item=itr.next();
			totalCost = totalCost + item.getTotalPrice();
			System.out.println(item);
		}
		System.out.println("Checkout cost = " + totalCost);
	}
	private static void printCart(ArrayList<LineItem> list) {
		for (Object o : list) {
			System.out.println(o);
		}
	}
}
