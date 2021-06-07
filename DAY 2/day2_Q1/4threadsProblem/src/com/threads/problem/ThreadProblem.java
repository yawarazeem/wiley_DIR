package com.threads.problem;

public class ThreadProblem {

	
	synchronized void t1(int i){
//	
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		System.out.println("Id: "+Thread.currentThread().getId()+"| Name: "+Thread.currentThread().getName()+"| Is ALive? "+Thread.currentThread().isAlive()+"| Priority: "+Thread.currentThread().getPriority() +"| Status: "+Thread.currentThread().getState());
		
	}
	
	synchronized void t2(int i){
	
			try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Id: "+Thread.currentThread().getId()+"| Name: "+Thread.currentThread().getName()+"| Is ALive? "+Thread.currentThread().isAlive()+"| Priority: "+Thread.currentThread().getPriority() +"| Status: "+Thread.currentThread().getState());
	
	}
	
	synchronized void t3(int i){
	
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		System.out.println("Id: "+Thread.currentThread().getId()+"| Name: "+Thread.currentThread().getName()+"| Is ALive? "+Thread.currentThread().isAlive()+"| Priority: "+Thread.currentThread().getPriority() +"| Status: "+Thread.currentThread().getState());
	
	}
	
	synchronized void t4(int i){

			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		System.out.println("Id: "+Thread.currentThread().getId()+"| Name: "+Thread.currentThread().getName()+"| Is ALive? "+Thread.currentThread().isAlive()+"| Priority: "+Thread.currentThread().getPriority() +"| Status: "+Thread.currentThread().getState());
	
	}
}
