package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void testCustomer() {
		//arrange
		int expectedCid=1;
		String expectedCname="abc";
		//act
		Customer c1=new Customer(1,"abc");
		//assert
		assertEquals(expectedCid,c1.getCid());
		assertEquals(expectedCname,c1.getCname());
	}

	@Test
	void testAddOrder() {
		//arrange
		String expectedOrders="[Order [oid=1, date=20-05-2021, checkOutPrice=252.0, items=[LineItem [lid=1, product=Product [pid=1, pname=Pen, pcost=12.0], qty=6], LineItem [lid=2, product=Product [pid=2, pname=Book, pcost=60.0], qty=3]]]]";
		//act
		Customer c1=new Customer(1,"abc");
		Product p1 = new Product(1,"Pen", 12);
		Product p2 = new Product(2,"Book", 60);
		LineItem item1=new LineItem(1,2,p1);
		LineItem item2=new LineItem(2,3,p2);
		LineItem item3=new LineItem(2,4,p1);
		
		Order order1=new Order(1,"20-05-2021");
		order1.addItem(item1);
		order1.addItem(item2);
		order1.addItem(item3);
		c1.addOrder(order1);
		//assert
		assertEquals(expectedOrders,c1.getOrders().toString());
	}
}
