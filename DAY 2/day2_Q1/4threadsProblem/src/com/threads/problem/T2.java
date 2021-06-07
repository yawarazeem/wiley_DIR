package com.threads.problem;

public class T2 implements Runnable {
	private ThreadProblem tb=new ThreadProblem();

	public T2(ThreadProblem tb) {
		super();
		this.tb = tb;
	}

	@Override
	public void run() {
		for (int i=1; i<=5; i++)
			tb.t2(i);
		
	}

}
