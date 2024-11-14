package com.concepts.behavioralDesignPatterns.strategy.withStrategy;

public class SportVehicle extends Vehicle {

	public SportVehicle(DriveStrategy driveStrategy) {
		super(driveStrategy);
	}
	
}
