package Inheritence;

public class Circle extends TwoDimensionalShape{
	
	

	public Circle(String isim, int deger) {
		super(isim, deger);
		
	}

	public double alan() {
		return 3.14*deger*deger; 
	}
	
}
