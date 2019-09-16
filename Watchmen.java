package csce247.assignments.observer;
//noah snell csce 247

import java.util.ArrayList;

public class Watchmen implements Subject {
	private ArrayList<Observer> observers;
	private int trumpets;
	//constructor
	public Watchmen() {
		observers = new ArrayList<Observer>();
	}
	//adds an observer
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	//removes an observer
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	//notifys observers based off how many trumpets are played
	public void notifyObservers() {
		if (this.trumpets == 1) 
			System.out.println(trumpets + " trumpet was played!!!");
			else {
			System.out.println(trumpets + " trumpets were played!!!");	
			}
		for(Observer observer : observers) {
			observer.update(trumpets);
		}
	}
	//helper class to call notify observers
	public void issueWarning(int Watchmen) {
		this.trumpets = Watchmen;
		notifyObservers();	
	}
	
}
