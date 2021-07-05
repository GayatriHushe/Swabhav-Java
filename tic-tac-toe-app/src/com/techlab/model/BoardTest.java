package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoardTest {
	int expectedSize,actualSize;
	Mark expectedMark,actualMark;
	boolean expectedValue,actualValue;
	
	@Test
	void testBoardSize() {
		//arrange
		expectedSize=9;
		//act
		Board b=new Board(3);
		int actualSize=b.getBoard().size();
		//assert
		assertEquals(expectedSize,actualSize);
	}

	@Test
	void testMarkCell() throws CellOccupiedException 
	{
		//arrange
		expectedMark=Mark.X;
		//act
		Board b=new Board(3);
		b.markCell(2,Mark.X);
		actualMark=b.getBoard().get(2).getMark();
		//assert
		assertEquals(expectedMark,actualMark);
		
	}

	@Test
	void check_board_full() throws CellOccupiedException
	{
		//arrange
		expectedValue=false;
		//act
		Board b=new Board(3);
		b.markCell(2,Mark.X);
		b.markCell(4,Mark.O);
		actualValue=b.checkIfBoardFull();
		//assert
		assertEquals(expectedValue,actualValue);
	}
}
