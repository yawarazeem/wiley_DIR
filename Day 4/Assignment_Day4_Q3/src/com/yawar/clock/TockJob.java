package com.yawar.clock;

public class TockJob implements Runnable {
	
private Clock clock =new Clock();
	
	
	public TockJob(Clock clock) {
		super();
		this.clock = clock;
	}

	@Override
	public void run() {
		for(int i=1; i<=60; i++) {
			clock.Tock(i);
		}


}
}
