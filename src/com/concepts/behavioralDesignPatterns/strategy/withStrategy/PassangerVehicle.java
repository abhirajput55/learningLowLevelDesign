package com.concepts.behavioralDesignPatterns.strategy.withStrategy;

public class PassangerVehicle extends Vehicle {

	public PassangerVehicle(DriveStrategy driveStrategy) {
		super(driveStrategy);
	}
	
}
