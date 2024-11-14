package com.concepts.behavioralDesignPatterns.strategy.withoutStrategy;

public class TestWithoutStrategy {

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new OffRoadVehicle();
		Vehicle vehicle2 = new SportVehicle();
		Vehicle vehicle3 = new PassangerVehicle();
		
		vehicle1.drive();
		vehicle2.drive();
		vehicle3.drive();
		
		vehicle1.display();
		vehicle2.display();
		vehicle3.display();
		
		System.out.println("Here we are providing duplicate implementation for some methods in same level child classes.");
		System.out.println("This is the main problem in without strategy design pattern.");
	}
}
