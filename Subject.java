package csce247.assignments.observer;
//noah snell csce 247
public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}