package com.concepts.behavioralDesignPatterns.strategy.withStrategy;

public class Vehicle {

	private DriveStrategy driveStrategy;
	
	public Vehicle(DriveStrategy driveStrategy) {
		this.driveStrategy = driveStrategy;
	}
	
	public void drive() {
		driveStrategy.drive();
	}
	
}
