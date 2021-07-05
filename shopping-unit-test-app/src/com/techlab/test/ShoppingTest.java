package com.techlab.test;

import java.util.ArrayList;
import com.techlab.model.*;

public class ShoppingTest
{
	public static void main(String[] args)
	{
		Customer c1 = new Customer(1,"Gayatri");
		
		Product p1 = new Product(1,"Pen", 12);
		Product p2 = new Product(2,"Book", 60);
		Product p3 = new Product(3,"Chocolate", 45);
		
		LineItem item1=new LineItem(1,2,p1);
		LineItem item2=new LineItem(2,3,p2);
		LineItem item3=new LineItem(2,4,p1);
		
		Order order1=new Order(1,"20-05-2021");
		
		order1.addItem(item1);
		order1.addItem(item2);
		order1.addItem(item3);
		
		c1.addOrder(order1);
		printInvoice(c1);		
	}

	private static void printInvoice(Customer c) {
		System.out.println("Customer details : ");
		System.out.println("Customer id : "+c.getCid());
		System.out.println("Customer name : "+c.getCname());
		System.out.println("Order Details : ");
		ArrayList<Order> orders=(ArrayList<Order>) c.getOrders();
		for(Order order : orders)
		{
			System.out.println("Order id : "+order.getOid());
			System.out.println("Order date : "+order.getDate());
			ArrayList<LineItem> items=(ArrayList<LineItem>) order.getItems();
			for(LineItem item : items)
			{
				System.out.println();
				System.out.println("LineItem id : "+item.getLid());
				System.out.println("LineItem qty : "+item.getQty());
				System.out.println("LineItem name : "+item.getProduct().getPname());
				System.out.println("LineItem cost : "+item.getProduct().getPcost());
			}
			System.out.println();
			System.out.println("Final Cost : "+order.getCheckOutPrice());
		}
	}
}
