package com.concepts.behavioralDesignPatterns.observer.weatherStationExample;

public class TVDisplayObserver implements ObserverInterface {

	private ObservableInterface observableInterface;
	
	public TVDisplayObserver(ObservableInterface observableInterface) {
		this.observableInterface = observableInterface;
	}
	
	@Override
	public void update() {
		
		System.out.println("TV Display Temp :: " + observableInterface.getData());
		
	}
}
