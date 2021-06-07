package com.yawar.bank;

public interface Interest {
    public double fixed_deposit = 0.0;
	public double account=  0.0;
	public double personalLoan = 0.0;
	public double HousingLoad = 0.0;
	
	public void calcInt();
}
