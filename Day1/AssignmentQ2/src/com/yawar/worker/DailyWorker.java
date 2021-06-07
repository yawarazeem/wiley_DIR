package com.yawar.worker;


public class DailyWorker extends Worker {
	
	public DailyWorker(String name, int salary) {
		super(name, salary);
	}

	public void pay(int hours) {
		this.setSalaryRate(this.getSalary()*hours);
		System.out.println("Salary Rate of "+ this.getName() +" per day => "+this.getSalaryRate());
	}
}
