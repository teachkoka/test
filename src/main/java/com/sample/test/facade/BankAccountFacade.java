package com.sample.test.facade;

public class BankAccountFacade {
	private int acctNumber;
	private int pin;
	AccountChecker ac ;
	FundsChecker fc;
	SecurityChecker sc;
	
	public BankAccountFacade() {
	}
	
	public BankAccountFacade(int acctNumber, int pin) {
		this.acctNumber = acctNumber;
		this.pin = pin;
		ac = new AccountChecker();
		fc = new FundsChecker();
		sc = new SecurityChecker();
	}
	
	
	public void withdraw(int amount){
		if(ac.checkAccount(acctNumber) && sc.checkPin(pin) && fc.enoughAmount(amount)){
			fc.decreaseAmount(amount);
			System.out.println("Avaliable amount after withDraw:" + fc.getAvaliableAmount());
		}else{
			System.out.println("You don't have enough amount to withdraw");
		}
		
	}
	
	public void deposit(int amount){
		if(ac.checkAccount(acctNumber) && sc.checkPin(pin)){
			fc.addAmount(amount);
			System.out.println("Avaliable amount after adding:" + fc.getAvaliableAmount());
		}else{
			System.out.println("invalid acct");
		}
		
	}
	

}
