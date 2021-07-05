package com.techlab.test;

import com.techlab.model.Infant;
import com.techlab.model.Man;

public class EmotionableSocializationTest {

	public static void main(String[] args) {
		Man man = new Man();
		showMan(man);
		Infant infant=new Infant();
		showInfant(infant);
	}
	private static void showMan(Man m) {
		m.depart();
		m.wish();
		m.cry();
		m.laugh();
		System.out.println();
	}

	private static void showInfant(Infant i) {
		i.cry();
		i.laugh();
		System.out.println();
	}
}
