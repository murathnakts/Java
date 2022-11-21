package Interface;

public class Spider extends Animal {

	protected Spider(int legs) {
		super(legs);
	}
	
	public void eat() {
		System.out.println("Orumcekler Bocekler Ile Beslenir.\n");
	}

	public void info() {
		System.out.println("Orumcekler\n" + getLegs() + " Ayaklidir.");
		eat();
		
	}
}
