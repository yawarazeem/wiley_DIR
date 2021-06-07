package com.yawar.BankImpl;
import com.yawar.bank.*;
public class FDAcc implements DepositAcc, CreditInterest {
//2.	FDAcc which implements DepositAcc  and CreditInterest
	
	public void calcInt() {
		System.out.println("FROM INHERIT CLAASS");
	}
	public void createAcc() {
		System.out.println("From that other inherit class!");
	}
	
	public void withdraw() {
		System.out.println("This is the withdraw from FDA");
	}
	public void getBalance() {
		System.out.println("This is the getBalance from FDA");
	}
	public void deposit() {
		System.out.println("This is the depositt from FDA");
	}
	
	
	

	
	public void addMonthlyInt() {
		System.out.println("This is thea ddMonthlyInt from FDA");
	}
	public void addHarfYrlyInt() {
		System.out.println("This is the addHarfYrlyInt from FDA");
	}
	public void addAnnualInt() {
		System.out.println("This is the addAnnualInt from FDA");
	}
	
}
