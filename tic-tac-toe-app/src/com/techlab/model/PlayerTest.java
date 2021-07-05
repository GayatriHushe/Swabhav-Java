package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerTest {
	String expectedName,actualName;
	Mark expectedMark,actualMark;
	@Test
	void testPlayer() {
		//arrange
		expectedName="Gayatri";
		expectedMark=Mark.X;
		//act
		Player player=new Player("Gayatri",Mark.X);
		actualName=player.getName();
		actualMark=player.getMark();
		//assert
		assertEquals(expectedName,actualName);
		assertEquals(expectedMark,actualMark);
	}

}
