package com.threads.problem;

public class Threads4Main {

	public static void main(String[] args) {
		ThreadProblem tb=new ThreadProblem();
		
		Thread t1=new Thread(new T1(tb));
		Thread t2=new Thread(new T2(tb));
		Thread t3=new Thread(new T3(tb));
		Thread t4=new Thread(new T4(tb));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		

	}

}
