package com.yawar.employee;
import java.util.*;
public class Operations {

	private int index;
	private Employee emps[];

	public Operations(int totalEmp) {
		emps = new Employee[totalEmp];
	
	}
	
	public void addEmp(Employee employee) {
		emps[index++] = employee;
		
	}

	
	
	public  int authentication(String name, int index){
		for(int i=0; i<index; i++) {
			System.out.println(emps[index].getName());
			if(name.equals(emps[index].getName())){
				return 1;
			}
		}
	
		return 0;
		
	}
	
	


	public Employee getEmps(int index) {
		return emps[index];
	}

	public void setEmps(Employee[] emps) {
		this.emps = emps;
	}
	
	
	
	
		
		
	}
	
	
	
	
	
	
	


