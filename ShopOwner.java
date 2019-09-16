package csce247.assignments.observer;
//noah snell csce 247
public class ShopOwner implements Observer{
	private int trumpets;
	private Subject Watchmen;
	
	//shop owner constructor which registers the observer
	public ShopOwner (Subject Watchmen) {
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
		System.out.println("Shop Owner: Close down shop and head home");
		else {
		System.out.println("Shop Owner: Drops everything and find nearest hideout");	
		}
	}
}
