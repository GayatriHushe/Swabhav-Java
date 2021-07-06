package com.techlab.model;

import java.time.LocalTime;

public class AsyncRunnable implements Runnable{
	@Override
	public void run() {
		while(true)
			System.out.println("Async : "+LocalTime.now());
	}

}
