package com.techlab.business.model;

import java.util.ArrayList;
import java.util.List;
public class Board {
	private int size;
	private List<Cell> cells=new ArrayList<Cell>();
	public Board(int size)
	{
		this.size=size;
		for (int i = 0; i < size*size; i++) {
			cells.add(new Cell());
		}
	}
	public ArrayList<Cell> getBoard() {
		return (ArrayList<Cell>) cells;
	}
	public void markCell(int cellNo, Mark mark) throws CellOccupiedException {
		cells.get(cellNo).setMark(mark);
	}
	public boolean checkIfBoardFull() {
		for (Cell cell : cells)
		{
			if ((cell.getMark().equals(Mark.EMPTY)))
				return false;
		}
		return true;
	}
	public int getBoardSize() {
		return size;
	}
	public Mark getCellValue(int i) {
		// TODO Auto-generated method stub
		return cells.get(i).getMark();
	}
}
