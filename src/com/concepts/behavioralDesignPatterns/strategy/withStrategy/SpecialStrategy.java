package com.concepts.behavioralDesignPatterns.strategy.withStrategy;

public class SpecialStrategy implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("Special Drive Implementation");
	}

}
