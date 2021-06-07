package com.yawar.employee;
import java.util.*;


public class Employee {
	private int index;
	private String name;
	private int age;
	
	

	public Employee() {
		
	}
	public Employee(int index, String name, int age) {
		super();
		this.index = index;
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	

}
