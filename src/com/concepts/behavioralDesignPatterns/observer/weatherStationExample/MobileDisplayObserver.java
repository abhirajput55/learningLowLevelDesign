package com.concepts.behavioralDesignPatterns.observer.weatherStationExample;

public class MobileDisplayObserver implements ObserverInterface {
	
	private ObservableInterface observableInterface;
	
	public MobileDisplayObserver(ObservableInterface observableInterface) {
		this.observableInterface = observableInterface;
	}
	
	@Override
	public void update() {
		
		System.out.println("Mobile Display Temp :: " + observableInterface.getData());
		
	}

}
