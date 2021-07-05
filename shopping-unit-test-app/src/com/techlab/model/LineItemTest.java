package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LineItemTest {

	@Test
	void testLineItem() {
		//arrange
		int expectedLid=1;
		int expectedQty=2;
		String expectedProduct="Product [pid=1, pname=Pen, pcost=12.0]";
		//act
		Product p1 = new Product(1,"Pen", 12);
		LineItem item1=new LineItem(1,2,p1);
		//assert
		assertEquals(expectedLid,item1.getLid());
		assertEquals(expectedQty,item1.getQty());
		assertEquals(expectedProduct,item1.getProduct().toString());
	}

	@Test
	void testUpdateQty() {
		//arrange
		int expectedQty=5;
		//act
		Product p1 = new Product(1,"Pen", 12);
		LineItem item1=new LineItem(1,2,p1);
		item1.updateQty(3);
		//assert
		assertEquals(expectedQty,item1.getQty());
	}

}
