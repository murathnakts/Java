package Inheritence;

public class Triangle extends TwoDimensionalShape {

	

	public Triangle(String isim, double deger) {
		super(isim, deger);
		
	}

	public double alan() {
		return 0.43*deger*deger;
	}

}
