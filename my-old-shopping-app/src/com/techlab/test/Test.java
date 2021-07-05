package com.techlab.test;

import java.util.ArrayList;
import java.util.List;

import com.techlab.model.*;

public class Test
{

	public static void main(String[] args)
	{
		
		Product p1 = new Product("Pen", 5);
		Product p2 = new Product("Book", 40);
		Product p3 = new Product("Chocolate", 20);
		
		Customer c1 = new Customer("Gayatri");
		
		List<LineItem> list1 = new ArrayList<LineItem>();
		
		list1.add(new LineItem(p1, 2));
		list1.add(new LineItem(p1, 10));
		list1.add(new LineItem(p2, 15));
		list1.add(new LineItem(p3, 5));
		c1.setOrder(list1, "20/05/2021");
				
		c1.addToCart(new LineItem(p1, 2));
		c1.addToCart(new LineItem(p2, 5));
		c1.addToCart(new LineItem(p3, 3));
		c1.addToCart(new LineItem(p2, 10));
		
		c1.setOrder("30/05/2021");
		
		printInvoice(c1);
	}

	private static void printInvoice(Customer c) {
		for (Order order : c.getOrders())
		{
			System.out.println("Customer Name: " + c.getName());
			System.out.println("Order Id: " + order.getId());
			System.out.println("Order details: ");
			for (LineItem item : order.getItems())
			{
				System.out.println(" " + item);
			}
			System.out.println("Order Total: " + order.getTotalPrice());
			System.out.println();
		}
		
	}
}
