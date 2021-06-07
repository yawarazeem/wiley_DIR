package com.yawar.BankImpl;
import com.yawar.bank.*;
public class PersonalAccLoan implements LoanAcc, DebitInterest{
	//3.	PersonalLoanAcc which implements LoanAcc and DebitInterest
	
	public void repayPrincipal() {
		System.out.println("");
	}
	public void payInterest() {
		System.out.println("");
	}
	public void payPartialPrincipal() {
		System.out.println(""); }
	
	public void deductMonthlyInt() {
		System.out.println("");
	}
	public void  deductHalfYrlyInt() {
		System.out.println("");
	}
	public void deductAnnualInt() {
		System.out.println(""); }
	
	public void calcInt() {
		System.out.println("FROM INHERIT CLAASS");
	}

}
