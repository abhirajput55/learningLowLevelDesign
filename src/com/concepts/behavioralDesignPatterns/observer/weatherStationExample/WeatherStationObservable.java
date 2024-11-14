package com.concepts.behavioralDesignPatterns.observer.weatherStationExample;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservable implements ObservableInterface {
	
	private List<ObserverInterface> observerInterfaces;
	
	private double currentTemp;
	
	
	public double getCurrentTemp() {
		return currentTemp;
	}

	public void setCurrentTemp(double currentTemp) {
		this.currentTemp = currentTemp;
		setData();
	}

	@Override
	public void addObserver(ObserverInterface observerInterface) {
		if(observerInterfaces == null) {
			observerInterfaces = new ArrayList<ObserverInterface>();
		}
		observerInterfaces.add(observerInterface);
	}

	@Override
	public void removeObserver(ObserverInterface observerInterface) {
		observerInterfaces.remove(observerInterface);
	}

	@Override
	public void notifyToAllObserver() {

		for(ObserverInterface obsInterface : observerInterfaces) {
			obsInterface.update();
		}
		
	}

	@Override
	public void setData() {
		notifyToAllObserver();
	}

	@Override
	public Object getData() {
		return getCurrentTemp();
	}

}
