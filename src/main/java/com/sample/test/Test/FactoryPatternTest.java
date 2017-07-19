package com.sample.test.factory;

import java.util.Scanner;

public class FactoryPatternTest {
	
  public static void main(String[] args){

        Car car = null;
		CarFactory factory = new CarFactory();
		
		Scanner userInput = new Scanner(System.in);
		
		String userCar = "";
		System.out.println("What car you looking for ?");
		if(userInput.hasNextLine()){
			userCar = userInput.nextLine();
			car =factory.getCarDetails(userCar);
			
		}
		
		
		displayCarDetails(car);
	  
  }  
  public static  void displayCarDetails(Car car){
	  car.carDetails();
  }
  
}
