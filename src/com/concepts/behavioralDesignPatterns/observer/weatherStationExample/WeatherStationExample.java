package com.concepts.behavioralDesignPatterns.observer.weatherStationExample;

public class WeatherStationExample {

	public static void main(String[] args) {
		
		WeatherStationObservable weatherStationObservable = new WeatherStationObservable();
		
		weatherStationObservable.addObserver(new MobileDisplayObserver(weatherStationObservable));
		weatherStationObservable.addObserver(new TVDisplayObserver(weatherStationObservable));
		
		weatherStationObservable.setCurrentTemp(133);
		weatherStationObservable.setCurrentTemp(135);
		weatherStationObservable.setCurrentTemp(136);
		
	}
}
