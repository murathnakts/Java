package Interface;

public class Cat extends Animal implements Pet{
	
	String name;
	
	protected Cat(int legs,String name) {
		super(legs);
		this.name = name;
	}
	
	protected Cat(int legs) {
		super(legs);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}

	public void play() {
		System.out.println("Kediler Oyun Oynamayi Sever.\n");
	}
	
	public void info() {
		System.out.println("Kediler\n" + getLegs() + " Ayaklidir.\n" + "Evcil Hayvanin Ismi " + getName());
		play();
	}
}
