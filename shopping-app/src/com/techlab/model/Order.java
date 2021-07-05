package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Order 
{
	private int oid;
	private String date;
	private double checkOutPrice = 0;
	List<LineItem> items=new ArrayList<LineItem>();
	
	public Order(int oid, String date) {
		this.oid=oid;
		this.date=date;
	}
	public int getOid() 
	{	return oid;		}

	public String getDate() 
	{	return date;	}

	public double getCheckOutPrice() 
	{	return checkOutPrice;	}

	public void addItem(LineItem item) {
		int itemExists=checkIfItemExists(item);
		if(itemExists== -1)
			items.add(item);
		else
		{
			LineItem lineItem=items.get(itemExists);
			lineItem.updateQty(item.getQty());
		}
		calculateCheckOutPrice(item);
	}

	private void calculateCheckOutPrice(LineItem item) {
		checkOutPrice+=(item.getQty()*item.getProduct().getPcost());
	}

	private int checkIfItemExists(LineItem item) {
		int itemExists= -1;
		for(LineItem lineItem : items)
		{
			if(lineItem.equals(item))
				itemExists=items.indexOf(item);
		}
		return itemExists ;
	}

	public ArrayList<LineItem> getItems() {
		return (ArrayList<LineItem>) items;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", date=" + date + ", checkOutPrice=" + checkOutPrice + ", items=" + items + "]";
	}
}
