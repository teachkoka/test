package com.sample.test.facade;

public class AccountChecker {
	
	private int[] accts = {12121212,1232321212,545411212,1212165656,1212165652};
	
	
	public boolean checkAccount(int acct){
		for(int i=0;i<=accts.length-1;i++){
			if(acct== accts[i]){
				return true;
			}
		}
		return false;	
		
	}

}
