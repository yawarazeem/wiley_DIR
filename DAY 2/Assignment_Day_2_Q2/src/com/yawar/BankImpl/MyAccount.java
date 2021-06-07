package com.yawar.BankImpl;

public class MyAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FDAcc fdacc = new FDAcc();
		HousingLoanAcc hla = new HousingLoanAcc();
		MyAccount mc = new MyAccount();
		PersonalAccLoan pal = new PersonalAccLoan();
		SavingsAcc sa = new SavingsAcc();
		
			fdacc.calcInt();
			fdacc.withdraw();
			fdacc.createAcc();
			fdacc.getBalance();
		
			
			

	}

}
