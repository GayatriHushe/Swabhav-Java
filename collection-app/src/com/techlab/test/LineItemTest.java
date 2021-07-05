package com.techlab.test;
import java.util.ArrayList;
import com.techlab.model.LineItem;

public class LineItemTest {
	public static void main(String[] args) {
		ArrayList  cart=new ArrayList();
		LineItem item1=new LineItem(1,"abc",5.0,3);
		LineItem item2=new LineItem(2,"def",10.0,1);
		LineItem item3=new LineItem(3,"xyz",15.0,2);
		
		cart.add(item1);
		cart.add(item2);
		cart.add(item3);
		//cart.add("abc");
		//printCart(cart);
		printCartItem(cart);
	}

	private static void printCartItem(ArrayList cart) {
		double totalCost=0.0;
		for(int i=0;i<cart.size();i++)
		{
			LineItem item=(LineItem) cart.get(i);
			totalCost=totalCost + item.getTotalPrice();
			System.out.println(item);
		}
		System.out.println("Checkout cost = "+totalCost);
	}

	private static void printCart(ArrayList cart) {
		for (Object o :cart)
		{
			System.out.println(o);		
		}	
	}

}
