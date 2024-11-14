package com.concepts.behavioralDesignPatterns.strategy.withStrategy;

public class TestWithStrategy {

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new SportVehicle(new SpecialStrategy());
		Vehicle vehicle2 = new OffRoadVehicle(new SpecialStrategy());
		Vehicle vehicle3 = new PassangerVehicle(new NormalStrategy());
		
		vehicle1.drive();
		vehicle2.drive();
		vehicle3.drive();
	}
}
