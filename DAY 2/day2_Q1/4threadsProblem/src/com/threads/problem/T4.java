package com.threads.problem;

public class T4 implements Runnable {
	private ThreadProblem tb=new ThreadProblem();

	public T4(ThreadProblem tb) {
		this.tb = tb;
	}

	@Override
	public void run() {
		for (int i=1; i<=5; i++)
			tb.t4(i);
		
	}
}
