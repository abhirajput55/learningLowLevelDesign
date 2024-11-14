package com.concepts.behavioralDesignPatterns.strategy.withStrategy;

public class NormalStrategy implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("Normal Drive Implementation");
	}

}
