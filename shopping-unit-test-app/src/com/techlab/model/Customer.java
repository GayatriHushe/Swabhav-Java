package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Customer 
{
	private int cid;
	private String cname;
	private List<Order> orders = new ArrayList<Order>();
		
	public Customer(int cid, String cname)
	{
		this.cid = cid;
		this.cname = cname;
	}

	public int getCid()
	{	return cid;		}

	public String getCname()
	{	return cname;	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	public ArrayList<Order> getOrders() {
		return (ArrayList<Order>) orders;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", orders=" + orders + "]";
	}
}
