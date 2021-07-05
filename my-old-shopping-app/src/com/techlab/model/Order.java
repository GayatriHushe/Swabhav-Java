package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Order 
{
	private static int orderCount=0;
	
	private int id;
	private String date;
	private double totalPrice = 0;
	private List<LineItem> items= new ArrayList<LineItem>();
	
	public int getId() 
	{
		return id;
	}

	public String getDate() 
	{
		return date;
	}

	public double getTotalPrice() 
	{
		return totalPrice;
	}

	public List<LineItem> getItems() 
	{
		return items;
	}

	public void setTotalPrice(LineItem item)
	{
		this.totalPrice += item.getTotalPrice();
	}

	public Order(String date)
	{
		this.id = ++orderCount;
		this.date = date;
	}
	
	public void addItem(LineItem item)
	{
		int existIndex = checkIfExists(item);
		if (existIndex == -1) 
		{
			items.add(item);
		}
		else
		{
			LineItem lineItem = items.get(existIndex);
			lineItem.setQty(item.getQty());
		}
		this.setTotalPrice(item);
	}
	
	public int checkIfExists(LineItem item)
	{
		int found = -1;
		for (LineItem i : items)
		{
			if (i.equals(item)) 
			{
				found = items.indexOf(i);
			}
		}
		return found;
	}

	@Override
	public String toString() 
	{
		return "Order [id=" + id + ", date=" + date + ", totalPrice=" + totalPrice + ", items=" + items + "]";
	}
	
}
