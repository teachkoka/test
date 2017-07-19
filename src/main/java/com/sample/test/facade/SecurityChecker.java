package com.sample.test.facade;

public class SecurityChecker {
	
    private int[] pins = {5151,2121,3131,4141,6161};
	
	
	public boolean checkPin(int pin){
		for(int i=0;i<=pins.length-1;i++){
			if(pin== pins[i]){
				return true;
			}
		}
		return false;	
		
	}

}
