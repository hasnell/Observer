package csce247.assignments.observer;
//noah snell csce 247
public class Teacher implements Observer {
	private int trumpets;
	private Subject Watchmen;
	
	//teacher constructor which registers the observer
	public Teacher (Subject Watchmen) {
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
		System.out.println("Teacher: Helps get every kid home safe");
		else {
		System.out.println("Teacher: Brings all students to the underground shelter");	
		}
	}
}
