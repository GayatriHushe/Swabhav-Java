package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void testProduct() {
		//arrange
		int expectedPid=1;
		String expectedPname="Pen";
		double expectedPcost=12;
		//act
		Product p1 = new Product(1,"Pen", 12);
		//assert
		assertEquals(expectedPid,p1.getPid());
		assertEquals(expectedPname,p1.getPname());
		assertEquals(expectedPcost,p1.getPcost());
	}

}
