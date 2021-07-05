package com.techlab.model;

public class ResultAnalyzer {

	private Board board;
	private int size;
	
	private Mark markOfWinner;
	private String winX="", winO="";
	int temp;
	boolean val;
	public ResultAnalyzer(Board board)
	{
		this.board=board;
		this.size=board.getBoardSize();
		for (int i=0 ; i< size;i++) {
			winX+=Mark.X;
			winO+=Mark.O;
		}
	}
	public boolean isWinner()
	{
		if(isRowWinner())	return true;
		else if(isColumnWinner()) return true;
		else if(isLeftDiagonalWinner()) return true;
		else if(isRightDiagonalWinner()) return true;
		else return false;
	}

	public boolean isRowWinner() {
		temp=0;
		for (int i = 0; i < size; i++) 
		{
			String checkWinner="";
			for (int j = 0; j < size; j++) 
				checkWinner+=board.getCellValue(temp++);
			if(checkWinner.equals(winX))	
			{
				markOfWinner=Mark.X; 
				return true;
			}
			else if(checkWinner.equals(winO))	
			{
				markOfWinner=Mark.O; 
				return true;
			}
		}
		return false;
	}
	public boolean isColumnWinner() {
		for(int i=0;i<size;i++)
		{
			temp=i;
			String checkWinner="";
			for (int j = 0; j < size; j++) 
			{
				checkWinner+=board.getCellValue(temp);
				temp+=size;
			}
			if(checkWinner.equals(winX))	
			{
				markOfWinner=Mark.X; 
				return true;
			}
			else if(checkWinner.equals(winO))	
			{
				markOfWinner=Mark.O; 
				return true;
			}
		}
		return false;
	}	

	public boolean isLeftDiagonalWinner() {
		temp=0;
		String checkWinner="";
		for (int i = 0; i < size; i++) 
		{	checkWinner+=board.getCellValue(temp);
			temp=temp+(size+1);
		}
		if(checkWinner.equals(winX))	
		{
			markOfWinner=Mark.X; 
			return true;
		}
		else if(checkWinner.equals(winO))	
		{
			markOfWinner=Mark.O; 
			return true;
		}
		return false;
	}
	public boolean isRightDiagonalWinner() {
		temp=size-1;
		String checkWinner="";
		for (int i = 0; i < size; i++) 
		{
			checkWinner+=board.getCellValue(temp);
			temp+=size-1;
		}
		if(checkWinner.equals(winX))	
		{
			markOfWinner=Mark.X; 
			return true;
		}
		else if(checkWinner.equals(winO))	
		{
			markOfWinner=Mark.O; 
			return true;
		}
		return false;
	}
	public Mark getMarkOfWinner() {
		return markOfWinner;
	}
}


