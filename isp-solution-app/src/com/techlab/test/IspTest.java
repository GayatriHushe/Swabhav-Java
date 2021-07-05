package com.techlab.test;

import com.techlab.model.IEatable;
import com.techlab.model.IWorkable;
import com.techlab.model.Managers;
import com.techlab.model.Robots;

public class IspTest {

	public static void main(String[] args) {
		IEatable manager=new Managers();
		IWorkable robot=new Robots();
		printManager(manager);
		printRobot(robot);
	}

	private static void printManager(IEatable obj) {
		obj.startEat();
		obj.stopEat();
		obj.startWork();
		obj.stopWork();
		
	}

	private static void printRobot(IWorkable obj) {
		obj.startWork();
		obj.stopWork();
	}
	
}
