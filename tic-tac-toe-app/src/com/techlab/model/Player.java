package com.techlab.model;

public class Player {
	private String name;
	private Mark mark;
	
	public Player(String name, Mark mark)
	{
		this.name=name;
		this.mark=mark;
	}

	public String getName() {
		return name;
	}

	public Mark getMark() {
		return mark;
	}
}
