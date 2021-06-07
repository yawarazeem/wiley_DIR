package com.threads.problem;

public class T3 implements Runnable {
	private ThreadProblem tb=new ThreadProblem();

	public T3(ThreadProblem tb) {
		super();
		this.tb = tb;
	}

	@Override
	public void run() {
		for (int i=1; i<=5; i++)
			tb.t3(i);
		
	}

}
