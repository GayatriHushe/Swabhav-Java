package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CellTest {
	
	Mark actualMark, expectedMark;


	@Test
	void test_if_cell_empty() {
		//arrange
		Cell c=new Cell();
		expectedMark=Mark.EMPTY;
		//act
		actualMark=c.getMark();
		//assert
		assertEquals(expectedMark,actualMark);
	}

	@Test
	void test_if_cell_is_already_marked_X() throws CellOccupiedException {
		//arrange
		Cell c=new Cell();
		expectedMark=Mark.X;
		//act
		c.setMark(Mark.X);
		actualMark=c.getMark();
		//assert
		assertEquals(expectedMark,actualMark);
	}


	@Test
	void test_if_cell_is_already_marked_throws_exception() throws CellOccupiedException {
		//arrange
		String expectedMsg="This cell is already occupied";
		expectedMark=Mark.X;
		Cell c=new Cell();
		c.setMark(Mark.X);
		
		String actualMsg=null;
		actualMark=null;
		//act
		try {
			c.setMark(Mark.O);
		} catch (CellOccupiedException e) {
			actualMsg=e.getMessage();
			actualMark=c.getMark();
		}
		//assert
		assertEquals(expectedMark,actualMark);
		assertEquals(actualMsg,expectedMsg);
	}

}
