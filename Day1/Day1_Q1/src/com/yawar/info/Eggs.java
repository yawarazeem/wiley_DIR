package com.yawar.info;

public class Eggs {

	private int number, gross, dozen, remaining;
	


	public void setNumber(int number) {
		this.number = number;
	}
	public Eggs(int number){
		 gross = (number-number % 144) / 144;
		 number = number-(gross*144);
		 dozen = (number-number%12)/12;
		 number = number -(dozen*12);
		 remaining = number;

	}
	
	public void display() {
		System.out.println("Total gross of eggs: "+gross);
		System.out.println("Total number of dozens: "+dozen);
		System.out.println("Total number of eggs left: "+remaining );				
	}
	
	

}
