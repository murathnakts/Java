package Interface;

public class Fish extends Animal implements Pet {
	String name;
	
	protected Fish(int legs, String name) {
		super(legs);
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}

	public void play() {
		System.out.println("Baliklar Oyun Oynayamazlar.");
	}
	
	public void walk() {
		System.out.println("Baliklar Yuruyemezler.");
	}
	
	public void eat() {
		System.out.println("Baliklar Yosun Ile Beslenir.\n");
	}
	
	public void info() {
		System.out.println("Baliklar\n" + getLegs() + " Ayaklidir.\n" + "Evcil Hayvanin Ismi " + getName());
		play();
		walk();
		eat();
	}
}
