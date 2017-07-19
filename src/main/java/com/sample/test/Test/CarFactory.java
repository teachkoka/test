package com.sample.test.factory;

import java.util.Scanner;

public class CarFactory {
	
	public Car getCarDetails(String carType){
		

		Car car = null;
		
	
		
		if(carType.equals("bmw")){
			car = new BMWCar();
		}else{
			car = new AudiCar();
		}
		return car;
		
	}

}
