package com.concepts.behavioralDesignPatterns.observer.weatherStationExample;

public interface ObservableInterface {

	void addObserver(ObserverInterface observerInterface);
	
	void removeObserver(ObserverInterface observerInterface);
	
	void notifyToAllObserver();
	
	void setData();
	
	Object getData();
}
