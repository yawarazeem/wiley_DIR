package com.yawar.clock;

public class TackJob implements Runnable {
	
private Clock clock =new Clock();
	
	
	public TackJob(Clock clock) {
		super();
		this.clock = clock;
	}

	@Override
	public void run() {
		for(int i=1; i<=60; i++) {
			clock.Tack(i);
		}


}

}
