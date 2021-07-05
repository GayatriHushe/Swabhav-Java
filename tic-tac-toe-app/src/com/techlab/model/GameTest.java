package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class GameTest {
	String expectedName,actualName;
	Mark expectedMark,actualMark;

	Board board=new Board(3);
	ResultAnalyzer resultAnalyzer=new ResultAnalyzer(board);
	ArrayList<Player> players=new ArrayList<Player>();
	Player player1=new Player("Gayatri",Mark.X);
	Player player2=new Player("Shruti",Mark.O);


	@Test
	void testGame() {
		//arrange
		expectedName="Gayatri";
		expectedMark=Mark.X;
		//act
		players.add(player1);
		players.add(player2);
		Game game=new Game(resultAnalyzer,players);
		actualName=((Player) players.get(0)).getName();
		actualMark=((Player) players.get(0)).getMark();
		//assert
		assertEquals(expectedName,actualName);
		assertEquals(expectedMark,actualMark);
	}

	@Test
	void testSwitchPlayer() {
		//arrange
		expectedName="Shruti";
		expectedMark=Mark.O;
		//act
		players.add(player1);
		players.add(player2);
		Game game=new Game(resultAnalyzer,players);
		game.switchPlayer();
		actualName=game.getCurrentPlayer().getName();
		actualMark=game.getCurrentPlayer().getMark();
		//assert
		assertEquals(expectedName,actualName);
		assertEquals(expectedMark,actualMark);
	}

}
