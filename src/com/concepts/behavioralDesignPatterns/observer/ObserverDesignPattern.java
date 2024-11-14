package com.concepts.behavioralDesignPatterns.observer;

public class ObserverDesignPattern {
	
//	The Observer Design Pattern is a behavioral pattern that allows one object (the subject) to notify a list of dependent objects (the observers) automatically of any changes to its state. This is useful when you have a scenario where one object changes state and you want other objects to be informed of the change.
//
//	Key Components:
//	Subject: The object that holds the state and notifies observers about changes.
//	Observer: The object that wants to be notified when the subject's state changes.
//	Concrete Subject: A specific implementation of the subject that maintains the state and triggers notifications.
//	Concrete Observer: A specific implementation of the observer that reacts to state changes in the subject.

//	Benefits :-
//	Loose Coupling: The subject and observers are loosely coupled. The subject doesn't need to know about the specific observers, just their interface.
//	Dynamic Updates: Observers are notified whenever the subject's state changes, making it useful for real-time systems like weather stations or stock price monitors.

//	When to Use:
//	When you need to notify multiple objects about changes to a subject's state.
//	In event-driven systems where multiple listeners (observers) react to an event (subject's state change).
	
//	Question
//	Implement Amazon NotifyMe feature.
}
