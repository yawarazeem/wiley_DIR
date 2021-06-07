package com.yawar.clock;

public class Clock {
     private int temp = 1;
	
      synchronized void Tick(int i) {
		while(temp != 1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("TICK "+i);
		temp = 2;
		notifyAll();
	}
      synchronized   void Tack(int i) {
		while(temp != 2) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("TACK "+i);
		temp = 3;
		notifyAll();
	}
      
      synchronized void Tock(int i) {
		while(temp != 3) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("TOCK "+i);
		temp = 1;
		notifyAll();
	}
}
