package com.threads.problem;

public class T1 implements Runnable {
	private ThreadProblem tb=new ThreadProblem();

	public T1(ThreadProblem tb) {
		super();
		this.tb = tb;
	}

	@Override
	public void run() {
		for (int i=1; i<=5; i++)
			tb.t1(i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	

}
