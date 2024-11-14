package com.concepts.behavioralDesignPatterns.strategy.withoutStrategy;

public class SportVehicle extends Vehicle {

	@Override
	public void drive() {
		System.out.println("Special Drive Method Implemetation.");
	}
	
	@Override
	public void display() {
		System.out.println("Special Display Method Implemetation.");
	}

}
