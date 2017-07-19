package com.sample.test.facade;

public class FundsChecker {
	
	private static int amount = 1000;
	
	public int getAvaliableAmount(){
		return amount;
	}
	
	public void decreaseAmount(int withDrawnAmount){
		amount = amount- withDrawnAmount;
	}

	public void addAmount(int depositedAmount){
		amount = amount +depositedAmount;
	
	}

	public boolean enoughAmount(int withDrawnAmount){
		if(amount> withDrawnAmount){
			return true;
		} else{
			System.out.println("Not enough funds in your account "+ amount);
		}
		return false;
	}
}
