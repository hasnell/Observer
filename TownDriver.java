package csce247.assignments.observer;
//noah snell csce 247
public class TownDriver {
	public static void main(String[] args) {
		System.out.println("A Happy Little City");
		
		Watchmen watchmen = new Watchmen();
		Observer fredrick = new ShopOwner(watchmen);
		Observer lillian = new Teacher(watchmen);
		Observer monte = new Knight(watchmen);
		
		System.out.println("\n-----------------------\n");
		
		watchmen.issueWarning(1);
		
		System.out.println("\n-----------------------\n");
		
		watchmen.issueWarning(2);
	}
}
