package com.techlab.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ResultAnalyzerTest {
	boolean expectedVal_true,actualVal_true;
	boolean expectedVal_false,actualVal_false;

	Board board=new Board(3);
	ResultAnalyzer resultAnalyzer=new ResultAnalyzer(board);

	@Test
	void testIsWinner() throws CellOccupiedException {
		//arrange
		expectedVal_true=true;
		//act
		board.markCell(0,Mark.X);
		board.markCell(1,Mark.X);
		board.markCell(2,Mark.X);
		actualVal_true=resultAnalyzer.isRowWinner();

		//assert
		assertEquals(expectedVal_true,actualVal_true);
	}

	@Test
	void testIsRowWinner_true() throws CellOccupiedException {
		//arrange
		expectedVal_true=true;
		//act
		board.markCell(0,Mark.X);
		board.markCell(1,Mark.X);
		board.markCell(2,Mark.X);
		actualVal_true=resultAnalyzer.isRowWinner();
		//assert
		assertEquals(expectedVal_true,actualVal_true);
	}

	@Test
	void testIsRowWinner_false() throws CellOccupiedException {
		//arrange
		expectedVal_false=false;
		//act
		board.markCell(3,Mark.X);
		board.markCell(4,Mark.O);
		board.markCell(5,Mark.X);
		actualVal_false=resultAnalyzer.isRowWinner();
		//assert
		assertEquals(expectedVal_false,actualVal_false);
	}
	@Test
	void testIsColumnWinner_true() throws CellOccupiedException {
		//arrange
		expectedVal_true=true;
		//act
		board.markCell(0,Mark.X);
		board.markCell(3,Mark.X);
		board.markCell(6,Mark.X);
		actualVal_true=resultAnalyzer.isColumnWinner();
		//assert
		assertEquals(expectedVal_true,actualVal_true);
	}
	@Test
	void testIsColumnWinner_false() throws CellOccupiedException {
		//arrange
		expectedVal_false=false;
		//act
		board.markCell(1,Mark.X);
		board.markCell(4,Mark.O);
		board.markCell(7,Mark.X);
		actualVal_false=resultAnalyzer.isColumnWinner();
		//assert
		assertEquals(expectedVal_false,actualVal_false);
	}

	@Test
	void testIsLeftDiagonalWinner_true() throws CellOccupiedException {
		//arrange
		expectedVal_true=true;
		//act
		board.markCell(0,Mark.X);
		board.markCell(4,Mark.X);
		board.markCell(8,Mark.X);
		actualVal_true=resultAnalyzer.isLeftDiagonalWinner();
		//assert
		assertEquals(expectedVal_true,actualVal_true);
	}
	@Test
	void testIsLeftDiagonalWinner_false() throws CellOccupiedException {
		//arrange
		expectedVal_false=false;
		//act
		board.markCell(0,Mark.X);
		board.markCell(4,Mark.O);
		board.markCell(8,Mark.X);
		actualVal_true=resultAnalyzer.isLeftDiagonalWinner();
		//assert
		assertEquals(expectedVal_false,actualVal_false);
	}
	@Test
	void testIsRightDiagonalWinner_true() throws CellOccupiedException {
		//arrange
		expectedVal_true=true;
		//act
		board.markCell(2,Mark.X);
		board.markCell(4,Mark.X);
		board.markCell(6,Mark.X);
		actualVal_true=resultAnalyzer.isRightDiagonalWinner();
		//assert
		assertEquals(expectedVal_true,actualVal_true);
	}
	@Test
	void testIsRightDiagonalWinner_false() throws CellOccupiedException {
		//arrange
		expectedVal_false=false;
		//act
		board.markCell(2,Mark.X);
		board.markCell(4,Mark.O);
		board.markCell(6,Mark.X);
		actualVal_true=resultAnalyzer.isRightDiagonalWinner();
		//assert
		assertEquals(expectedVal_false,actualVal_false);
	}
}
