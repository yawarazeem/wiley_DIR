package com.yawar.worker;



public class SalariedWorker extends Worker {

	public SalariedWorker(String name, int salary) {
		super(name, salary);
	}
	
	public void pay(int hours) {
		this.setSalaryRate(this.getSalary()*40);
		System.out.println("Salary Rate of "+this.getName()+" per week => "+this.getSalaryRate());
	}
}