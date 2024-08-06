package com.capgemini.bnk.junitscbnew;

public class InterestCalculator {
	
	public double calculateInterest(double amount,double interest,double years)
	{
		if(amount==0||interest==0||years==0)
		{
			throw new IllegalArgumentException();
		}
		
		return(amount*interest*years/100.0);
	}

}
