package com.sample.test.factory;

public abstract class Car {
	 private String name;
	 private double speed;
	 private double cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	 
	 
   public void carDetails(){
	   System.out.println(getName() + getCost() + getSpeed());
   }
	 
	 
	
	

}
