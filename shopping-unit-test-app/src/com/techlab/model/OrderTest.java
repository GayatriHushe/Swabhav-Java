package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class OrderTest {

	@Test
	void testOrder() {
		//arrange
		int expectedOid=1;
		String expectedDate="20-05-2021";
		//act
		Order order1=new Order(1,"20-05-2021");
		//assert
		assertEquals(expectedOid,order1.getOid());
		assertEquals(expectedDate,order1.getDate());
	}

	@Test
	void testAddItem() {
		//arrange
		String expectedList="[LineItem [lid=1, product=Product [pid=1, pname=Pen, pcost=12.0], qty=2]]";
		//act
		Order order1=new Order(1,"20-05-2021");
		Product p1 = new Product(1,"Pen", 12);
		LineItem item1=new LineItem(1,2,p1);
		order1.addItem(item1);
		//assert
		assertEquals(expectedList,order1.getItems().toString());
	}

	@Test
	void calculateCheckOutPrice()
	{
		//arrange 
		double expectedCheckOutPrice=24.0;
		//act
		Order order1=new Order(1,"20-05-2021");
		Product p1 = new Product(1,"Pen", 12);
		LineItem item1=new LineItem(1,2,p1);
		order1.addItem(item1);
		//assert
		assertEquals(expectedCheckOutPrice,order1.getCheckOutPrice());
	}

	@Test
	void checkIfItemExists()
	{
		//arrange
		int expectedItemsSize=1;
		//act
		Order order1=new Order(1,"20-05-2021");
		Product p1 = new Product(1,"Pen", 12);
		LineItem item1=new LineItem(1,2,p1);
		order1.addItem(item1);
		//assert
		assertEquals(expectedItemsSize,order1.getItems().size());
	}

}
