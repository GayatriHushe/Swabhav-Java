package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Customer 
{
	private static int customerCounter=0;
	
	private int id;
	private String name;
	private List<Order> orders = new ArrayList<Order>();
	private List<LineItem> cart = new ArrayList<LineItem>();
	
	public static int getCustomerCount()
	{
		return customerCounter;
	}

	public Customer(String name)
	{
		this.id = ++customerCounter;
		this.name = name;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public List<Order> getOrders() 
	{
		return orders;
	}
	
	public void addToCart(LineItem item)
	{
		cart.add(item);
	}
	
	public void setOrder(List<LineItem> lineItems, String date)
	{
		Order order = new Order(date);
		for (LineItem items : lineItems)
		{
			order.addItem(items);
		}
		orders.add(order);
	}
	
	public void setOrder(String date)
	{
		Order order = new Order(date);
		for (LineItem item : cart)
		{
			order.addItem(item);
		}
		orders.add(order);
		cart = new ArrayList<LineItem>();
	}

	@Override
	public String toString() 
	{
		return "Customer [id=" + id + ", name=" + name + ", orders=" + orders + ", cart=" + cart + "]";
	}
}
