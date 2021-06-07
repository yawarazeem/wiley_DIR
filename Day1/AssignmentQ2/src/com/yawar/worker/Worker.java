package com.yawar.worker;

public class Worker {
	private String name;
	private double salaryRate;
	private int salary;
	
	public Worker(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getSalaryRate() {
		return salaryRate;
	}
	public void setSalaryRate(double salaryRate) {
		this.salaryRate = salaryRate;
	}
	
	public void pay(int hours) {
		this.setSalaryRate((this.getSalary()*hours)*7);
		System.out.println("Salary Rate of "+ this.getName() +" per week => "+this.getSalaryRate());
	}

}
