package csce247.assignments.observer;
//noah snell csce 247

public class Knight implements Observer {
	//declare private variables
	private int trumpets;
	private Subject Watchmen;
	
	//knight constructor which registers the observer
	public Knight (Subject Watchmen) {
		this.Watchmen = Watchmen;
		Watchmen.registerObserver(this);
	}
	//updates number of trumpets and displays output accordingly
	public void update(int trumpets) {
		this.trumpets = trumpets;
		display();
	}
	//text outputs mentioned above
	public void display() {
		if (this.trumpets == 1) 
		System.out.println("Knight: Helps everyone get home safe");
		else {
		System.out.println("Knight: Prepares for battle");	
		}
	}
}
