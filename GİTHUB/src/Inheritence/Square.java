package Inheritence;

public class Square extends TwoDimensionalShape {

	

	public Square(String isim, double deger) {
		super(isim, deger);
		
	}

	public double alan() {
		return deger*deger; 
	}
}
