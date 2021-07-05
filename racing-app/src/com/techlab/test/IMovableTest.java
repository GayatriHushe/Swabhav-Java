package com.techlab.test;

import com.techlab.model.Bike;
import com.techlab.model.Car;
import com.techlab.model.IMovable;
import com.techlab.model.Truck;

public class IMovableTest {

	public static void main(String[] args) {
				
		IMovable bike =new Bike();
		IMovable car =new Car();
		IMovable truck =new Truck();
		
		IMovable []arr=new IMovable[3];
		arr[0]=bike;
		arr[1]=car;
		arr[2]=truck;
		startRace(arr);
	}

	private static void startRace(IMovable[] movable) {
			for (int i = 0;i<movable.length;i++)
				movable[i].move();
			System.out.println("Race stopped\n");
		
	}

}
