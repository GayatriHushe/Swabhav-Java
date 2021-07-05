package com.techlab.model;

public class CellOccupiedException extends Exception {
	private String msg;

	public CellOccupiedException(String msg) {
		this.msg=msg;
	}
	@Override
	public String getMessage()
	{
		return msg;
	}
}
