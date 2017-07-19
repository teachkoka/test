package com.sample.test.facade;

public class FacadeDesignPatternTest {
	

	
	public static void main(String[] args){
              		
		
		BankAccountFacade bankFacade = new BankAccountFacade(12121212,5151);
		bankFacade.deposit(100);
		bankFacade.withdraw(2000);
		bankFacade.withdraw(200);
	}

}
