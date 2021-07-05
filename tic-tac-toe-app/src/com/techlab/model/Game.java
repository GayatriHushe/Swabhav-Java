package com.techlab.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	private ResultAnalyzer resultAnalyzer;
	private ArrayList<Player> players=new ArrayList<Player>();
	private boolean player1=true;
	private Player currentPlayer;

	public Game(ResultAnalyzer resultAnalyzer,ArrayList<Player> players)
	{
		this.resultAnalyzer=resultAnalyzer;
		this.players=players;
	}
	public Player getCurrentPlayer() {
		if(player1)
		{
			currentPlayer=players.get(0);
			return currentPlayer;
		}
		else 
		{
			currentPlayer=players.get(1);
			return currentPlayer;
		}
	}
	public void switchPlayer() {
		if(player1)
			player1=false;
		else
			player1=true;
	}
	public String getWinnerName() {
		if(resultAnalyzer.getMarkOfWinner()==((Player) players.get(0)).getMark())	
			return ((Player) players.get(0)).getName();
		else if(resultAnalyzer.getMarkOfWinner()==((Player) players.get(1)).getMark())	
			return ((Player) players.get(1)).getName();
		else return null;
	}

	
	public int play(int cellNo, Board board)
	{
		try {
			board.markCell(cellNo,getCurrentPlayer().getMark());
		} 
		catch (CellOccupiedException e) 
		{
			System.out.println(e.getMessage());
			return 1;
		}
		return 0;
	}

}
